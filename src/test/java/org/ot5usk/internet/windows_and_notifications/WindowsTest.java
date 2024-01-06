package org.ot5usk.internet.windows_and_notifications;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.BaseTest;
import org.ot5usk.steps.internet.pages_steps.windows.NewWindowPageSteps;
import org.ot5usk.steps.internet.pages_steps.windows.WindowsPageSteps;

import static com.codeborne.selenide.Selenide.webdriver;
import static org.ot5usk.steps.internet.assertions.pages_steps_assertions.WindowsAsserts.*;
import static org.ot5usk.steps.internet.pages_steps.windows.WindowsSwitcher.switchToNewOpenedWindow;
import static org.ot5usk.steps.internet.pages_steps.windows.WindowsSwitcher.switchToPreviousWindow;

public class WindowsTest extends BaseTest {

    private static WindowsPageSteps windowsPageSteps;

    @BeforeAll
    static void init() {
        windowsPageSteps = new WindowsPageSteps();
    }

    @DisplayName("Переключение между окнами браузера")
    @Description("Осуществление перехода на новое окно и назад")
    @Test
    void testWindows() {

        windowsPageSteps.openPage();

        String defaultHandle = webdriver().driver().getWebDriver().getWindowHandle();

        NewWindowPageSteps newWindowPageSteps = windowsPageSteps.clickNewWindowPageLink();

        checkToNewWindowTransition();

        switchToNewOpenedWindow(defaultHandle);

        expectedPageUrl(newWindowPageSteps.url());

        checkPageText(newWindowPageSteps.getExampleText());

        newWindowPageSteps.closePage();

        checkToBackTransition();

        switchToPreviousWindow(defaultHandle);

        expectedPageUrl(windowsPageSteps.url());
    }
}
