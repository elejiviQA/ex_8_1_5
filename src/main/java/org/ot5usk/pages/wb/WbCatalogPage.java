package org.ot5usk.pages.wb;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.elements.base.WbBaseElements;
import org.ot5usk.pages.wb.elements.catalog.cards.WbCards;
import org.ot5usk.pages.wb.elements.catalog.filters.WbFilters;

import static com.codeborne.selenide.Selenide.$x;

public class WbCatalogPage extends WbBaseElements {

    private final static String URL = "https://www.wildberries.ru/catalog";
    private final WbFilters filters;
    private final WbCards cards;
    private final SelenideElement navBarPath = $x("//ul[contains(@class, 'breadcrumbs__list')]");
    private final SelenideElement navBarTitle = $x("//h1[contains(@class, 'catalog-title')]");
    private final SelenideElement navBarCardsCounter = $x("//span[@class='goods-count']");
    private final SelenideElement counterOfCardsInBasket = $x("//span[@class='navbar-pc__notify']");
    private final SelenideElement searchBarResultsTitle = $x("//*[contains(@class, 'searching-results__title')]");
    private final SelenideElement goToBasketBtn = $x("//span[@class='navbar-pc__icon navbar-pc__icon--basket']");

    public WbCatalogPage() {
        this.filters = new WbFilters();
        this.cards = new WbCards();
    }

    public WbFilters filters() {
        return filters;
    }

    public WbCards cards() {
        return cards;
    }

    public SelenideElement getNavBarPath() {
        return navBarPath;
    }

    public SelenideElement getNavBarTitle() {
        return navBarTitle;
    }

    public SelenideElement getNavBarCardsCounter() {
        return navBarCardsCounter;
    }

    public SelenideElement getCounterOfCardsInBasket() {
        return counterOfCardsInBasket;
    }

    public WbBasketPage clickGoToBasketBtn() {
        goToBasketBtn.click();
        return new WbBasketPage();
    }

    public SelenideElement getSearchBarResultsTitle() {
        return searchBarResultsTitle;
    }
}
