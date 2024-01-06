package org.ot5usk.steps.wb.pages_steps.basket;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.WbBasketPage;

public class WbBasketPageSteps {

    private final WbBasketPage basketPage;

    public WbBasketPageSteps() {
        this.basketPage = new WbBasketPage();
    }

    @Step("Поиск названия и брэнда товара в коризне")
    public SelenideElement getCardTitle() {
        return basketPage.getCardTitle();
    }

    @Step("Поиск названия товара в коризине")
    public SelenideElement getCardName() {
        return basketPage.getCardName();
    }

    @Step("Поиск актуальной цены товара в корзине")
    public SelenideElement getNewCardPrice() {
        return basketPage.getNewCardPrice();
    }

    @Step("Поиск старой цены товара в коризне")
    public SelenideElement getOldCardPrice() {
        return basketPage.getOldCardPrice();
    }

    @Step("Поиск актуальной итоговой цены товара в корзине")
    public SelenideElement getNewTotalPrice() {
        return basketPage.getNewTotalPrice();
    }

    @Step("Поиск старой итоговой цены товара в коризне")
    public SelenideElement getOldTotalPrice() {
        return basketPage.getOldTotalPrice();
    }

    @Step("Поиск кнопки Заказать")
    public SelenideElement getOrderBtn() {
        return basketPage.orderBtn();
    }
}
