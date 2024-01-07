package org.ot5usk.wb;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbSearchBarAsserts.*;

public class SearchBarTest extends WbBaseTest {

    @Feature("Поисковая строка")
    @Story("Работа с поисковой строкой")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Vladimir Voblikov")
    @DisplayName("Работа с поисковой строкой")
    @Description("Проверка результатов: ввода запроса, нажатия крестика")
    @ParameterizedTest(name = "Запрос: {0}")
    @CsvSource("Iphone 13")
    void testSearchBar(String query) {

        WbCatalogPageSteps catalogPageSteps = wbHomePageSteps.openHomePage()
                .clickOnTheSearchBar()
                .enterQuery(query)
                .sendEnter();

        expectedSearchBarResultsTitle(query);

        expectedNavBarFilterTitle(query);

        checkBaseRangingFilter();

        checkCardBrand();

        catalogPageSteps.clickOnTheSearchBar().clickTheCross();

        checkClickTheCross();
    }
}
