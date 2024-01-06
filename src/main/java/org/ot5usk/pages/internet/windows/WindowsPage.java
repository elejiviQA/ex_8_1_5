package org.ot5usk.pages.internet.windows;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class WindowsPage {

    private static final String URL = "https://the-internet.herokuapp.com/windows";
    private final SelenideElement newWindowPageLink = $x("//a[@href='/windows/new']");

    public void openPage() {
        open(URL);
    }

    public String url() {
        return URL;
    }

    public SelenideElement newWindowPageLink() {
        return newWindowPageLink;
    }

    public NewWindowPage clickNewWindowPageLink() {
        newWindowPageLink().click();
        return new NewWindowPage();
    }
}
