package org.ot5usk.steps.wb.steps_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbSearchBarAsserts.*;
import static org.ot5usk.steps.wb.steps_definitions.WbGivenStepDefinitions.*;

public class WbSearchBarStepDefinitions {

    @When("пользователь нажимает на поисковую строку")
    public void clickOnTheSearchBar() {
        homeSteps.clickOnTheSearchBar();
    }

    @And("вводит в поисковую строку {string}")
    public void enterQueryIntoSearchBar(String productName) {
        homeSteps.searchBar().enterQuery(productName);
    }

    @And("нажимает Enter")
    public void sendEnterInSearchBar() {
        homeSteps.searchBar().sendEnter();
    }

    @Then("на странице с результатами поиска отображается текст: {string}")
    public void checkSearchingResult(String productName) {
        expectedSearchBarResultsTitle(productName);
    }

    @And("первый фильтр: {string}")
    public void checkFirstFilter(String productName) {
        expectedNavBarFilterTitle(productName);
    }

    @And("применен фильтр: “По популярности”")
    public void expectedBaseRangingFilter() {
        checkBaseRangingFilter();
    }

    @And("у первой карточки товара из списка бренд: {string}")
    public void checkProductBrand(String productBrand) {
        checkCardBrand(productBrand);
    }

    @When("пользователь нажимает на крестик в поисковой строке")
    public void clickTheSearchBarCross() {
        catalogSteps.searchBar().clickTheCross();
    }

    @Then("крестик исчезает")
    public void checkTheSearchBarCross() {
        checkClickTheCross();
    }
}
