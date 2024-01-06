package org.ot5usk.steps.internet.assertions.pages_steps_assertions;

import io.qameta.allure.Step;
import org.ot5usk.steps.internet.assertions.InternetAssertsHeap;
import org.ot5usk.steps.internet.pages_steps.horizontal_slider.HorizontalSliderPageSteps;

public class HorizontalSliderPageStepsAsserts extends InternetAssertsHeap {

    private final HorizontalSliderPageSteps pageSteps;

    public HorizontalSliderPageStepsAsserts(HorizontalSliderPageSteps pageSteps) {
        this.pageSteps = pageSteps;
    }

    @Step("Проверка значения слайдера")
    public void checkSliderValue() {
        checkElementValue("0",pageSteps.slider());
    }
}
