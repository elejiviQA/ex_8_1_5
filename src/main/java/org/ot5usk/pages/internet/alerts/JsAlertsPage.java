package org.ot5usk.pages.internet.alerts;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class JsAlertsPage {

    private static final String URL = "https://the-internet.herokuapp.com/javascript_alerts";
    private final JsAlertsPageButtons buttons = new JsAlertsPageButtons();
    private final SelenideElement pageResult = $x("//p[@id='result']");

    public void openPage() {
        open(URL);
    }

    public void clickJsAlertBtn() {
        buttons.clickJsAlertBtn();
    }

    public void clickJsConfirmBtn() {
        buttons.clickJsConfirmBtn();
    }

    public void clickJsPromptBtn() {
        buttons.clickJsPromptBtn();
    }

    public String acceptAlert() {
        return confirm();
    }

    public void dismissAlert() {
        dismiss();
    }

    public void enterTextIntoAlert(String text) {
        prompt(text);
    }

    public SelenideElement getPageResult() {
        return pageResult;
    }
}
