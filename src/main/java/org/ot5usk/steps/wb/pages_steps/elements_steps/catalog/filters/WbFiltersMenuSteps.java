package org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.catalog.filters.WbFiltersMenu;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

public class WbFiltersMenuSteps {

    private final WbFiltersMenu filtersMenu;

    public WbFiltersMenuSteps() {
        this.filtersMenu = new WbFiltersMenu();
    }

    public SelenideElement getFiltersMenuWindow() {
        return filtersMenu.getFiltersMenuWindow();
    }

    @Step("Заполнение фильтра: Цена от {from}")
    public void fillPriceFrom(String from) {
        filtersMenu.fillPriceFrom( from);
    }

    @Step("Заполнение фильтра: Цена до {to}")
    public void fillPriceTo(String to) {
        filtersMenu.fillPriceTo( to);
    }

    @Step("Выбор фильтра: {name}")
    public void selectFilter(String name) {
        filtersMenu.selectFilter(name);
    }

    @Step("Нажатие на кнопку применения выбранных фильтров")
    public void clickShowBtn() {
        filtersMenu.clickShowBtn();
        new WbCatalogPageSteps();
    }

    public SelenideElement getResetBtn() {
        return filtersMenu.getResetBtn();
    }

    public SelenideElement getProductsCounter() {
        return filtersMenu.getProductsCounter();
    }
}
