package org.ot5usk.steps.wb.assertions.pages_steps_assertions;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters.WbFiltersMenuSteps;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

import java.util.List;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageStepsTempStorage.getNavBarCardsCounter;
import static org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters.WbFiltersMenuStepsTempStorage.getProductsCounterInFiltersMenu;

public class WbFiltersAsserts {

    private static final WbCatalogPageSteps catalogPageSteps = new WbCatalogPageSteps();
    private static final WbFiltersMenuSteps filtersMenuSteps = new WbFiltersMenuSteps();
    private static final List<String> expectedFiltersChoice = List.of("до 3 дней", "Apple", "от 100 000 до 149 000", "13.6\"");

    @Step("Проверка открытия меню фильтров")
    public static void checkFiltersMenuWindowIsOpen() {
        filtersMenuSteps.getFiltersMenuWindow().shouldBe(appear);
    }

    @Step("Проверка активации фильтров")
    public static void checkFiltersActivity() {
        String navBarCardsCounterBeforeUseFilters = getNavBarCardsCounter();
        String before = navBarCardsCounterBeforeUseFilters.replaceAll("[^0-9]", "");
        String after = catalogPageSteps.getNavBarCardsCounter().shouldBe(visible).getText().replaceAll("[^0-9]", "");
        assertTrue(Long.parseLong(after) <= Long.parseLong(before)); // <=, =?
    }

    @Step("Проверка равенства количества товаров в меню фильтров и количества товаров на странице каталога")
    public static void checkProductsCounter() {
        String productsCounterInFilterMenu = getProductsCounterInFiltersMenu().replaceAll("[^0-9]", "");
        String navBarCardsCounter = catalogPageSteps.getNavBarCardsCounter().shouldBe(visible).getText().replaceAll("[^0-9]", "");
        assertEquals(productsCounterInFilterMenu, navBarCardsCounter);
    }

    @Step("Проверка отображения фильтров на странице")
    public static void checkDisplayOfFilters() {
        ElementsCollection choices = catalogPageSteps.filtersSteps().getSelectedFilters();
        for (int i = 0; i < expectedFiltersChoice.size(); i++) {
            assertTrue(choices.get(i).isDisplayed());
            assertEquals(expectedFiltersChoice.get(i).toLowerCase(), choices.get(i).shouldBe(visible).getText().toLowerCase());
        }
    }

    @Step("Проверка появления кнопки Сбросить всё")
    public static void checkVisibilityOfResetBtn() {
        filtersMenuSteps.getResetBtn().shouldBe(appear);
    }
}
