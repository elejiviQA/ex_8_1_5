package org.ot5usk.pages.internet.horizontal_slider;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HorizontalSliderPage {

    private final SelenideElement slider = $x("//input[@type='range']");

    public SelenideElement slider() {
        return slider;
    }
}
