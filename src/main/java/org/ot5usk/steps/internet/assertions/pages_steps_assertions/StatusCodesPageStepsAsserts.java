package org.ot5usk.steps.internet.assertions.pages_steps_assertions;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.steps.internet.assertions.InternetAssertsHeap;
import org.ot5usk.steps.internet.pages_steps.status_codes.StatusCodesPageSteps;

public class StatusCodesPageStepsAsserts extends InternetAssertsHeap {

    public StatusCodesPageSteps pageSteps;

    public StatusCodesPageStepsAsserts(StatusCodesPageSteps pageSteps) {
        this.pageSteps = pageSteps;
    }

    @Step("Проверка текста ссылки на страницу код 200")
    public void checkLinkTextToCode200Page() {
        SelenideElement linkToCode200Page = pageSteps.contentListItem(0);
        checkElementText("200", linkToCode200Page);
    }

    @Step("Проверка атрибута href ссылки на страницу код 200")
    public void checkLinkHrefToCode200Page() {
        SelenideElement linkToCode200Page = pageSteps.tagAContentListItem(0);
        checkElementHref("https://the-internet.herokuapp.com/status_codes/200", linkToCode200Page);
    }
}