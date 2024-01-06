package org.ot5usk.pages.wb;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WbCardPage {

    public static final SelenideElement cardName = $x("//h1[@class='product-page__title']");
    public static final SelenideElement addToBasketBtn = $x("//div[@class='product-page__order-buttons']");

    public SelenideElement getCardName() {
        return cardName;
    }

    public void clickAddToBasketBtn() {
        addToBasketBtn.click();
        new WbBasketPage();
    }
}
