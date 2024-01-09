package org.ot5usk.steps.wb.steps_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbBasketAsserts.*;
import static org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageStepsTempStorage.rememberCatalogCard;
import static org.ot5usk.steps.wb.steps_definitions.WbGivenStepDefinitions.catalogSteps;

public class WbBasketStepDefinitions {

    @Then("происходит переход на страницу товаров c текстом {string}")
    public void checkNavBarTitle(String expectedNavBarTitle) {
        expectedNavBarTitle(expectedNavBarTitle);
    }

    @And("отображается путь фильтров:")
    public void checkNavBarFiltersPath(List<String> expectedNavBarPath) {
        expectedNavBarPath(expectedNavBarPath);
    }

    @When("пользователь наводится на первую карточку товара из списка")
    public void moveToFirstProductCard() {
        catalogSteps.cardsSteps().moveToCard();
        rememberCatalogCard();
    }

    @And("нажимает на кнопку “В корзину”")
    public void addProductInBasket() {
        catalogSteps.cardsSteps().clickAddToBasketBtn();
    }

    @Then("в правом верхнем углу над логотипом “Корзина” появляется красная цифра “1”")
    public void checkCounterOfCardsInBasket() {
        checkCounterOfCardsInBasketColor();
        checkCounterOfCardsInBasketValue();
    }

    @When("пользователь нажимает на логотип “Корзина” в правом верхнем углу")
    public void goToBasket() {
        catalogSteps.clickGoToBasketBtn();
    }

    @Then("открывается страница корзины")
    public void checkPageIsBasket() {
        expectedPageIsBasket();
    }

    @And("текст и цена товара соответствуют цене и названию товара из предыдущих шагов")
    public void checkCardPricesInBasket() {
        checkOldCardPriceInBasket();
        checkNewCardPriceInBasket();
    }

    @And("“Итого” = сумме товара")
    public void checkTotalPricesInBasket() {
        checkOldTotalPriceInBasket();
        checkNewTotalPriceInBasket();
    }

    @And("Кнопка “Заказать” активна для нажатия")
    public void checkOrderBtn() {
        checkOrderBtnInBasket();
    }
}
