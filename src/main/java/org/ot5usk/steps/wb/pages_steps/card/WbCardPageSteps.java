package org.ot5usk.steps.wb.pages_steps.card;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.WbCardPage;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.WbBaseElementsSteps;

public class WbCardPageSteps extends WbBaseElementsSteps {

    private final WbCardPage cardPage;

    public WbCardPageSteps() {
        this.cardPage = new WbCardPage();
    }

    @Step("Поиск названия карточки товара")
    public SelenideElement getCardName() {
        return cardPage.getCardName();
    }

    @Step("Нажатие кнопки добавления товара в корзину")
    public WbCardPageSteps clickAddToBasketBtn() {
        cardPage.clickAddToBasketBtn();
        return this;
    }
}
