package org.ot5usk.pages.internet.status_codes;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StatusCodesPage {

    private final SelenideElement content = $x("//div[@id='content']");

    public SelenideElement content() {
        return content;
    }
}
