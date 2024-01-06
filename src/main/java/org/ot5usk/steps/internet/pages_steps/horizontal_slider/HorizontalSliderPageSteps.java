package org.ot5usk.steps.internet.pages_steps.horizontal_slider;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.internet.horizontal_slider.HorizontalSliderPage;

public class HorizontalSliderPageSteps {

    private final HorizontalSliderPage page;

    public HorizontalSliderPageSteps(HorizontalSliderPage page) {
        this.page = page;
    }

    @Step("Поиск слайдера")
    public SelenideElement slider() {
        return page.slider();
    }
}
