package org.ot5usk.steps.internet.assertions.pages_steps_assertions;

import io.qameta.allure.Step;
import org.ot5usk.steps.internet.assertions.InternetAssertsHeap;
import org.ot5usk.steps.internet.pages_steps.home.TheInternetHomePageLinksSteps;

public class TheInternetHomePageLinksStepsAsserts extends InternetAssertsHeap {

    private final TheInternetHomePageLinksSteps linksSteps;

    public TheInternetHomePageLinksStepsAsserts(TheInternetHomePageLinksSteps linksSteps) {
        this.linksSteps = linksSteps;
    }

    @Step("Проверка видимости ссылки на страницу Add/Remove Elements")
    public void addRemoveElementsPageLinkStepsIsVisible() {
        elementIsVisible(linksSteps.addRemoveElementsPageLinkSteps());
    }

    @Step("Проверка видимости ссылки на страницу Horizontal Slider")
    public void horizontalSliderPageLinkStepsIsVisible() {
        elementIsVisible(linksSteps.horizontalSliderPageLinkSteps());
    }

    @Step("Проверка видимости ссылки на страницу Status Codes")
    public void statusCodesPageLinkStepsIsVisible() {
        elementIsVisible(linksSteps.statusCodesPageLinkSteps());
    }
}
