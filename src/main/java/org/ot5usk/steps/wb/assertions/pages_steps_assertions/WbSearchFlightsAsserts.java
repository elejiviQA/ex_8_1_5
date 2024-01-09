package org.ot5usk.steps.wb.assertions.pages_steps_assertions;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WbSearchFlightsAsserts {

    @Step("Проверка открытой страницы")
    public static void checkCurrentUrl(String expectedUrl) {
        assertEquals(expectedUrl, Selenide.webdriver().driver().getWebDriver().getCurrentUrl());
    }
}
