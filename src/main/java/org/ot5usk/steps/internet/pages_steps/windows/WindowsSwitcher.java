package org.ot5usk.steps.internet.pages_steps.windows;

import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;

public class WindowsSwitcher {

    @Step("Переключение на новое открытое окно")
    public static void switchToNewOpenedWindow(String defaultHandle) {
        List<String> actualHandles = webdriver().driver().getWebDriver().getWindowHandles().stream().toList();
        for (String handle : actualHandles) {
            if (!handle.equals(defaultHandle)) {
                switchTo().window(handle);
            }
        }
    }

    @Step("Переключение на предыдущее окно")
    public static void switchToPreviousWindow(String defaultHandle) {
        switchTo().window(defaultHandle);
    }
}
