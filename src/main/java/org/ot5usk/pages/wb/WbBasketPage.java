package org.ot5usk.pages.wb;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.elements.base.WbBaseElements;

import static com.codeborne.selenide.Selenide.$x;

public class WbBasketPage extends WbBaseElements {

    private final static String URL = "https://www.wildberries.ru/lk/basket";
    private final SelenideElement cardTitle = $x("//a[@class='good-info__title j-product-popup']");
    private final SelenideElement newCardPrice = $x("//div[@class='list-item__price-new']");
    private final SelenideElement oldCardPrice = $x("//div[@class='list-item__price-old']");
    private final SelenideElement newTotalPrice = $x("//div[@class='list-item__price-new']");
    private final SelenideElement oldTotalPrice = $x("//div[@class='list-item__price-old']");
    private final SelenideElement orderBtn = $x("//div[@class='basket-order__b-btn b-btn']");

    public SelenideElement getCardTitle() {
        return cardTitle;
    }

    public SelenideElement getNewCardPrice() {
        return newCardPrice;
    }

    public SelenideElement getOldCardPrice() {
        return oldCardPrice;
    }

    public SelenideElement getNewTotalPrice() {
        return newTotalPrice;
    }

    public SelenideElement getOldTotalPrice() {
        return oldTotalPrice;
    }

    public SelenideElement orderBtn() {
        return orderBtn;
    }
}
