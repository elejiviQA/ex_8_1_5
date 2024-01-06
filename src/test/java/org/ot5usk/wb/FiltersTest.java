package org.ot5usk.wb;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;
import org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters.WbFiltersMenuSteps;

import static com.codeborne.selenide.Selenide.sleep;
import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbFiltersAsserts.*;
import static org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageStepsTempStorage.rememberNavBarCardsCounter;
import static org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters.WbFiltersMenuStepsTempStorage.rememberProductsCounterInFiltersMenu;

public class FiltersTest extends WbBaseTest {

    @DisplayName("Работа с фильтрами")
    @Description("Проверка результатов: выбора фильтров")
    @ParameterizedTest(name = "Цена товара от {0} и до {1}")
    @CsvSource("100000, 149000")
    void testFilters(String priceFrom, String priceTo) {

        WbCatalogPageSteps catalogPageSteps = wbHomePageSteps
                .clickNavBarBtn()
                .goToElectronics()
                .clickLaptopsNdComputers()
                .clickLaptops();

        checkOpenedPage();

        rememberNavBarCardsCounter();

        WbFiltersMenuSteps filtersMenuSteps = catalogPageSteps.filtersSteps().openFiltersMenu();

        filtersMenuSteps
                .fillPrices(priceFrom, priceTo)
                .selectUpToThreeDays()
                .selectAppleBrand()
                .selectScreenDiagonal();

        sleep(2000);

        rememberProductsCounterInFiltersMenu();

        filtersMenuSteps.clickShowBtn();

        checkFiltersActivity();

        checkProductsCounter();

        checkDisplayOfFilters();

        checkVisibilityOfResetBtn();
    }
}
