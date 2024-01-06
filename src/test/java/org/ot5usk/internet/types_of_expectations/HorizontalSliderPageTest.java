package org.ot5usk.internet.types_of_expectations;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.steps.internet.assertions.pages_steps_assertions.HorizontalSliderPageStepsAsserts;
import org.ot5usk.steps.internet.pages_steps.horizontal_slider.HorizontalSliderPageSteps;

public class HorizontalSliderPageTest extends InternetPagesBaseTest {

    @DisplayName("Значение слайдера")
    @Description("Значение слайдера равно нулю")
    @Test
    void testHorizontalSliderValue() {
        HorizontalSliderPageSteps pageSteps = homePageSteps.goToHorizontalSliderPageSteps();
        HorizontalSliderPageStepsAsserts pageStepsAssertions = new HorizontalSliderPageStepsAsserts(pageSteps);
        pageStepsAssertions.checkSliderValue();
    }
}