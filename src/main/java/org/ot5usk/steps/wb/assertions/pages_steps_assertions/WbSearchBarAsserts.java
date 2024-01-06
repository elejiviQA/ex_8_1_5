package org.ot5usk.steps.wb.assertions.pages_steps_assertions;

import io.qameta.allure.Step;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WbSearchBarAsserts {

    private static final WbCatalogPageSteps catalogSteps = new WbCatalogPageSteps();
    private static final String expectedBaseRangingFilter = "По популярности";
    private static final String expectedCardBrand = "Apple";

    @Step("Проверка результирующего заголовка")
    public static void expectedSearchBarResultsTitle(String expectedResultsTitle) {
        assertEquals(expectedResultsTitle, catalogSteps.getSearchBarResultsTitle().getText());
    }

    @Step("Проверка первого фильтра - фильтра навигации")
    public static void expectedNavBarFilterTitle(String expectedFilterTitle) {
        assertEquals(expectedFilterTitle, catalogSteps.filtersSteps().navBarFilterBtn().getText());
    }

    @Step("Проверка второго фильтра - базового фильтра упорядочивания")
    public static void checkBaseRangingFilter() {
        assertEquals(expectedBaseRangingFilter, catalogSteps.filtersSteps().baseRangingFilterBtn().getText());
    }

    @Step("Проверка брэнда товара")
    public static void checkCardBrand() {
        assertEquals(expectedCardBrand, catalogSteps.cardsSteps().getCardBrand().getText());
    }

    @Step("Проверка отсутствия крестика")
    public static void checkClickTheCross() {
        assertFalse(catalogSteps.clickOnTheSearchBar().getCross().isDisplayed());
    }
}