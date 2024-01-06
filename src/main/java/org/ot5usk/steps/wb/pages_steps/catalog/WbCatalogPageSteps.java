package org.ot5usk.steps.wb.pages_steps.catalog;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.WbCatalogPage;
import org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.cards.WbCardsSteps;
import org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters.WbFiltersSteps;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.WbBaseElementsSteps;

public class WbCatalogPageSteps extends WbBaseElementsSteps {

    private final WbCatalogPage catalog;

    public WbCatalogPageSteps() {
        this.catalog = new WbCatalogPage();
    }

    @Step("Обращение к фильтрам")
    public WbFiltersSteps filtersSteps() {
        return new WbFiltersSteps(catalog.filters());
    }

    @Step("Обращение к карточкам товаров")
    public WbCardsSteps cardsSteps() {
        return new WbCardsSteps(catalog.cards());
    }

    @Step("Поиск результирующего заголовка")
    public SelenideElement getSearchBarResultsTitle() {
        return catalog.getSearchBarResultsTitle();
    }

    @Step("Поиск отображаемого пути навигационных фильтров")
    public SelenideElement getNavBarPath() {
        return catalog.getNavBarPath();
    }

    @Step("Поиск результирующего заголовка навигационных фильтров")
    public SelenideElement getNavBarTitle() {
        return catalog.getNavBarTitle();
    }

    @Step("Поиск отображаемого счетчика количества товаров в каталоге")
    public SelenideElement getNavBarCardsCounter() {
        return catalog.getNavBarCardsCounter();
    }

    @Step("Поиск отображаемого счетчика количества товаров в корзине")
    public SelenideElement getCounterOfCardsInBasket() {
        return catalog.getCounterOfCardsInBasket();
    }
}
