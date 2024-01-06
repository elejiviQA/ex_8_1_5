package org.ot5usk.pages.internet.alerts;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class JsAlertsPageButtons {

    private final SelenideElement jsAlertBtn = $x("//button[@onclick='jsAlert()']");
    private final SelenideElement jsConfirmBtn = $x("//button[@onclick='jsConfirm()']");
    private final SelenideElement jsPromptBtn = $x("//button[@onclick='jsPrompt()']");

    public void clickJsAlertBtn() {
        jsAlertBtn.click();
    }

    public void clickJsConfirmBtn() {
        jsConfirmBtn.click();
    }

    public void clickJsPromptBtn() {
        jsPromptBtn.click();
    }


}
