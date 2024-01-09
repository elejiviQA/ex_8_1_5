package org.ot5usk.steps.wb.steps_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters.WbFiltersMenuSteps;

import java.util.List;

import static com.codeborne.selenide.Selenide.sleep;
import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbFiltersAsserts.*;
import static org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageStepsTempStorage.rememberNavBarCardsCounter;
import static org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters.WbFiltersMenuStepsTempStorage.rememberProductsCounterInFiltersMenu;
import static org.ot5usk.steps.wb.steps_definitions.WbGivenStepDefinitions.catalogSteps;

public class WbFiltersStepDefinitions {

    public static final WbFiltersMenuSteps filtersMenuSteps = new WbFiltersMenuSteps();

    @When("пользователь нажимает на кнопку “Все фильтры”")
    public void clickFiltersMenuBtn() {
        rememberNavBarCardsCounter();
        catalogSteps.filtersSteps().openFiltersMenu();
    }

    @Then("открывается меню фильтров")
    public void expectedFiltersMenuWindowIsAppear() {
        checkFiltersMenuWindowIsOpen();
    }

    @When("пользователь выбирает фильтры:")
    public void selectFilters(List<String> filters) {
        String priceFrom;
        String priceTo;
        for (String filter : filters) {
            if (filter.toLowerCase().contains("цена от")) {
                priceFrom = filter.replaceAll("[^0-9]", "");
                filtersMenuSteps.fillPriceFrom(priceFrom);
            }
            if (filter.toLowerCase().contains("цена до")) {
                priceTo = filter.replaceAll("[^0-9]", "");
                filtersMenuSteps.fillPriceTo(priceTo);
            }
            filtersMenuSteps.selectFilter(filter.toLowerCase());
        }

    }

    @And("нажимает кнопку “Показать”")
    public void clickShowBtn() {
        sleep(2000);
        rememberProductsCounterInFiltersMenu();
        filtersMenuSteps.clickShowBtn();
    }

    @Then("фильтры активируются")
    public void checkFiltersIsActive() {
        checkFiltersActivity();
    }

    @And("количество товаров на странице = количеству товаров из меню “Все фильтры”")
    public void checkCounters() {
        checkProductsCounter();
    }

    @And("все выбранные фильтры отображаются на странице")
    public void checkFiltersIsDisplayed() {
        checkDisplayOfFilters();
    }

    @And("появляется кнопка “Сбросить все”")
    public void checkOrderBtn() {
        checkVisibilityOfResetBtn();
    }
}
