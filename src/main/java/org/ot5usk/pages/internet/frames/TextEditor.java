package org.ot5usk.pages.internet.frames;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class TextEditor {

    private final SelenideElement frame = $x("//iframe[@id='mce_0_ifr']");
    private final SelenideElement frameBodyInput = $x("//body[@id='tinymce']");
    private final SelenideElement boldBtn = $x("//button[@aria-label='Bold']");

    public void enterText(String text) {
        switchTo().frame(frame);
        frameBodyInput.sendKeys(Keys.CONTROL + "a");
        frameBodyInput.sendKeys(text);
    }

    public void makeTextBold() {
        frameBodyInput.sendKeys(Keys.CONTROL + "a");
        switchTo().defaultContent();
        boldBtn.click();
    }
}
