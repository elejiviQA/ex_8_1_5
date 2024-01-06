package org.ot5usk.pages.internet.windows;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.closeWindow;

public class NewWindowPage {

    private static final String URL = "https://the-internet.herokuapp.com/windows/new";
    private static final SelenideElement example = $x("//div[@class='example']");

    public String url() {
        return URL;
    }

    public SelenideElement getExample() {
        return example;
    }

    public void closePage() {
        closeWindow();
    }
}
