package org.ot5usk.steps.internet.assertions.pages_steps_assertions;

import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.webdriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WindowsAsserts {

    @Step("Проверка перехода на новую страницу")
    public static void checkToNewWindowTransition() {
        assertEquals(2, actualHandles().size());
    }

    @Step("Проверка перехода на предыдущю страницу")
    public static void checkToBackTransition() {
        assertEquals(1, actualHandles().size());
    }

    private static List<String> actualHandles() {
        return webdriver().driver().getWebDriver().getWindowHandles().stream().toList();
    }

    @Step("Проверка url страницы")
    public static void expectedPageUrl(String expectedPageUrl) {
        assertEquals(expectedPageUrl, currentUrl());
    }

    private static String currentUrl() {
        return webdriver().driver().getWebDriver().getCurrentUrl();
    }

    @Step("Проверка текста новой страницы")
    public static void checkPageText(String actualPageText) {
        assertNotEquals("New Page", actualPageText);
    }
}
