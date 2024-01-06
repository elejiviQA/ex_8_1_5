package org.ot5usk.internet.windows_and_notifications;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.BaseTest;
import org.ot5usk.steps.internet.pages_steps.alerts.JsAlertsPageSteps;

import static org.ot5usk.steps.internet.assertions.pages_steps_assertions.AlertsAsserts.*;

public class AlertsTest extends BaseTest {

    private static JsAlertsPageSteps jsAlertsPageSteps;

    @BeforeAll
    static void init() {
        jsAlertsPageSteps = new JsAlertsPageSteps();
    }

    @DisplayName("Взаимодействие со всплывающими уведомлениями")
    @Description("На странице появился текст You entered: Hello World")
    @Test
    void testAlerts() {

        String alertText = jsAlertsPageSteps.openPage().clickJsAlertBtn().acceptAlert();

        checkAlertText("I am a JS Alert", alertText);

        checkAlertClosing();

        jsAlertsPageSteps.clickJsConfirmBtn().dismissAlert();

        checkAlertClosing();

        jsAlertsPageSteps.clickJsPromptBtn().enterTextIntoAlert("Hello World");

        checkResultText("You entered: Hello World", jsAlertsPageSteps.getPageResultText());
    }
}