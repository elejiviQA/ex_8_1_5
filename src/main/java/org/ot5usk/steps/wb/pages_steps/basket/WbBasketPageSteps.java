package org.ot5usk.steps.wb.pages_steps.basket;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.WbBasketPage;

public class WbBasketPageSteps {

    private final WbBasketPage basketPage;

    public WbBasketPageSteps() {
        this.basketPage = new WbBasketPage();
    }

    public SelenideElement getNewCardPrice() {
        return basketPage.getNewCardPrice();
    }

    public SelenideElement getOldCardPrice() {
        return basketPage.getOldCardPrice();
    }

    public SelenideElement getNewTotalPrice() {
        return basketPage.getNewTotalPrice();
    }

    public SelenideElement getOldTotalPrice() {
        return basketPage.getOldTotalPrice();
    }

    public SelenideElement getOrderBtn() {
        return basketPage.orderBtn();
    }
}
