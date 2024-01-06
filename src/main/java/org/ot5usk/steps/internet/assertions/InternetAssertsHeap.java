package org.ot5usk.steps.internet.assertions;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;

public class InternetAssertsHeap {

    @Step("Проверка видимости элемента")
    public void elementIsVisible(SelenideElement actualElement) {
        actualElement.shouldBe(visible);
    }

    @Step("Проверка невидимости элемента")
    public void elementIsInvisible(SelenideElement actualElement) {
        actualElement.shouldNotBe(visible);
    }

    @Step("Проверка появления элемента")
    public void elementIsAppear(SelenideElement actualElement) {
        actualElement.shouldBe(appear);
    }

    @Step("Проверка исчезновения элемента")
    public void elementIsDisappear(SelenideElement actualElement) {
        actualElement.shouldBe(disappear);
    }

    @Step("Проверка атрибута value элемента")
    public void checkElementValue(String expectedValue, SelenideElement actualElement) {
        actualElement.shouldHave(value(expectedValue));
    }

    @Step("Проверка текста элемента")
    public void checkElementText(String expectedText, SelenideElement actualElement) {
        actualElement.shouldHave(text(expectedText));
    }

    @Step("Проверка атрибута href элемента")
    public void checkElementHref(String expectedHref, SelenideElement actualElement) {
        actualElement.shouldHave(attribute("href", expectedHref));
    }
}