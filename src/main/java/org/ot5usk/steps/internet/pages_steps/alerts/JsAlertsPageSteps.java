package org.ot5usk.steps.internet.pages_steps.alerts;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.internet.alerts.JsAlertsPage;

public class JsAlertsPageSteps {

    private final JsAlertsPage jsAlertsPage = new JsAlertsPage();

    @Step("Открытие страницы JavaScript Alerts")
    public JsAlertsPageSteps openPage() {
        jsAlertsPage.openPage();
        return this;
    }

    @Step("Нажатие на кнопку Click For JS Alert")
    public JsAlertsPageSteps clickJsAlertBtn() {
        jsAlertsPage.clickJsAlertBtn();
        return this;
    }

    @Step("Нажатие на кнопку Click For JS Confirm")
    public JsAlertsPageSteps clickJsConfirmBtn() {
        jsAlertsPage.clickJsConfirmBtn();
        return this;
    }

    @Step("Нажатие на кнопку Click For JS Prompt")
    public JsAlertsPageSteps clickJsPromptBtn() {
        jsAlertsPage.clickJsPromptBtn();
        return this;
    }

    @Step("Полуение текста алерта и нажатие кнопки ОК")
    public String acceptAlert() {
        return jsAlertsPage.acceptAlert();
    }

    @Step("Отказ от алерта")
    public void dismissAlert() {
        jsAlertsPage.dismissAlert();
    }

    @Step("Ввод текста в алерт")
    public void enterTextIntoAlert(String text) {
        jsAlertsPage.enterTextIntoAlert(text);
    }

    @Step("Поиск результирующего текста страницы")
    public SelenideElement getPageResult() {
        return jsAlertsPage.getPageResult();
    }

    @Step("Получение результирующего текста страницы")
    public String getPageResultText() {
        return getPageResult().getText();
    }
}
