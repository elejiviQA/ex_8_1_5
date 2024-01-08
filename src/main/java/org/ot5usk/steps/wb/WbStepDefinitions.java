package org.ot5usk.steps.wb;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.search_bar.WbSearchBarSteps;
import org.ot5usk.steps.wb.pages_steps.home.WbHomePageSteps;
import org.ot5usk.utils.Util;

import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbCatalogAsserts.*;
import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbBasketAsserts.checkCardTitleInBasket;
import static org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageStepsTempStorage.rememberCatalogCard;

public class WbStepDefinitions {
    
    private final WbHomePageSteps wbHomePageSteps = new WbHomePageSteps();
    private final WbCatalogPageSteps wbCatalogPageSteps = new WbCatalogPageSteps();
    private static Util util;

    @Given("пользователь на главной странице магазина")
    public void openHomePage() {
        if (util == null) {
            util = new Util().init();
        }
        util.attachmentEnvironment();
        wbHomePageSteps.openHomePage();
        util.clearBrowserLocalStorage();
    }

    @When("он переходит в категорию {string}")
    public void goToCategory(String productCategory) {
        wbHomePageSteps.clickNavBarBtn().clickToCategory(productCategory);
    }

    @Then("он видит список товаров категории {string}")
    public void viewProductsList(String productCategory) {
        expectedNavBarTitle(productCategory, wbCatalogPageSteps.getNavBarTitle());
        expectedProductsOfCategory(productCategory);
    }

    @When("он вводит {string} в строку поиска")
    public void search(String productName) {
        WbSearchBarSteps searchBar = wbHomePageSteps.clickOnTheSearchBar();
        SelenideElement cross = searchBar.getCross();
        if (cross.isDisplayed()) {
            searchBar.clickTheCross();
        }
        searchBar.enterQuery(productName).sendEnter();
    }

    @Then("он видит товар {string} в результатах поиска")
    public void checkSearchBarResult(String productName) {
        expectedSearchBarResultsTitle(productName, wbCatalogPageSteps.getSearchBarResultsTitle());
        expectedProduct(productName, wbCatalogPageSteps.cardsSteps().getCardName());
    }

    @Given("пользователь нашел товар {string}")
    public void getProduct(String productName) {
        // не догоняю насчёт переиспользования - вроде как нельзя, раз зависимости появляются, но оставлю
        openHomePage();
        search(productName);
        checkSearchBarResult(productName);
        rememberCatalogCard();
    }

    @When("он добавляет товар {string} в корзину")
    public void addProductInBasket(String ignored) {
        wbCatalogPageSteps.cardsSteps().clickAddToBasketBtn();
    }

    @Then("в его корзине находится товар {string}")
    public void checkProductCard(String ignored) {
        wbCatalogPageSteps.clickGoToBasketBtn();
        checkCardTitleInBasket();
    }
}
