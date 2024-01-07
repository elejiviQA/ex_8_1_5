package org.ot5usk.steps.wb.pages_steps.catalog;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.WbCatalogPage;
import org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.cards.WbCardsSteps;
import org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters.WbFiltersSteps;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.WbBaseElementsSteps;

public class WbCatalogPageSteps extends WbBaseElementsSteps {

    private final WbCatalogPage catalog;

    public WbCatalogPageSteps() {
        this.catalog = new WbCatalogPage();
    }

    public WbFiltersSteps filtersSteps() {
        return new WbFiltersSteps(catalog.filters());
    }

    public WbCardsSteps cardsSteps() {
        return new WbCardsSteps(catalog.cards());
    }

    public SelenideElement getSearchBarResultsTitle() {
        return catalog.getSearchBarResultsTitle();
    }

    public SelenideElement getNavBarPath() {
        return catalog.getNavBarPath();
    }

    public SelenideElement getNavBarTitle() {
        return catalog.getNavBarTitle();
    }

    public SelenideElement getNavBarCardsCounter() {
        return catalog.getNavBarCardsCounter();
    }

    public SelenideElement getCounterOfCardsInBasket() {
        return catalog.getCounterOfCardsInBasket();
    }
}
