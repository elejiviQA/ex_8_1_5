package org.ot5usk.wb;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.menu.WbChangeCityMenuSteps;

import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbChangeCityAsserts.*;
import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbChangeCityAsserts.checkCurrentAddress;
import static org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.WbChangeCityStepsTempStorage.rememberFirstAddress;
import static org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.WbChangeCityStepsTempStorage.rememberInfoBlockAddress;

public class ChangeCityTest extends WbBaseTest {

    @DisplayName("Смена города")
    @Description("Проверка результатов: ввода запроса, выбора адреса")
    @ParameterizedTest(name = "Запрос: {0}")
    @CsvSource("Санкт-Петербург")
    void testChangeCity(String query) {

        WbChangeCityMenuSteps menuSteps = wbHomePageSteps.changeCity().openMenu().executeQuery(query);

        rememberFirstAddress();

        menuSteps.selectFirstAddress();

        checkInfoBlock();

        rememberInfoBlockAddress();

        checkInfoBlockAddress();

        menuSteps.clickSelectBtn();

        checkCurrentUrl();

        checkCurrentAddress();
    }
}
