package org.ot5usk.pages.internet.frames;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class FramesPage {

    private static final String URL = "https://the-internet.herokuapp.com/frames";

    private final SelenideElement iFramePageLink = $x("//a[@href='/iframe']");

    public void openPage() {
        open(URL);
    }

    public IFramePage goToIFramePage() {
        iFramePageLink.click();
        return new IFramePage();
    }
}
