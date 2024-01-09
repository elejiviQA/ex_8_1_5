package org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;

public class WbFiltersMenuStepsTempStorage {

    private static final WbFiltersMenuSteps filtersMenuSteps = new WbFiltersMenuSteps();
    private static String productsCounterInFiltersMenu;

    @Step("Запоминание значения счетчика количества товаров в меню фильтров")
    public static void rememberProductsCounterInFiltersMenu() {
        productsCounterInFiltersMenu = filtersMenuSteps.getProductsCounter().shouldBe(visible).getText();
    }

    @Step("Получение значения счетчика количества товаров в меню фильтров")
    public static String getProductsCounterInFiltersMenu() {
        return productsCounterInFiltersMenu;
    }
}
