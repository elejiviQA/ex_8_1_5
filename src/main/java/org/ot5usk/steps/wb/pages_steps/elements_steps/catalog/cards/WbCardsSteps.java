package org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.cards;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.catalog.cards.WbCards;
import org.ot5usk.steps.wb.pages_steps.card.WbCardPageSteps;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.WbBaseElementsSteps;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.actions;

public class WbCardsSteps extends WbBaseElementsSteps {

    private final WbCards cards;

    public WbCardsSteps(WbCards cards) {
        this.cards = cards;
    }

    @Step("Нажатие на карточку товара")
    public WbCardPageSteps clickToCard() {
        cards.clickToCard();
        return new WbCardPageSteps();
    }

    @Step("Нажатие кнопки добавления товара в корзину")
    public void clickAddToBasketBtn() {
        moveToCard();
        getAddToBasketBtn().shouldBe(appear).click();
    }

    @Step("Наведение на карточку товара")
    public void moveToCard() {
        actions().moveToElement(getCard().shouldBe(appear)).build().perform();
    }

    @Step("Поиск карточки товара")
    public SelenideElement getCard() {
        return cards.getCard();
    }

    @Step("Поиск кнопки добавления товара в корзину")
    public SelenideElement getAddToBasketBtn() {
        return cards.getAddToBasketBtn();
    }

    @Step("Поиск названия товара")
    public SelenideElement getCardName() {
        return cards.getCardName();
    }

    @Step("Поиск брэнда товара")
    public SelenideElement getCardBrand() {
        return cards.getCardBrand();
    }

    @Step("Поиск актуальной цены продукта")
    public SelenideElement getNewCardPrice() {
        return cards.getNewCardPrice();
    }

    @Step("Поиск старой цены продукта")
    public SelenideElement getOldCardPrice() {
        return cards.getOldCardPrice();
    }
}