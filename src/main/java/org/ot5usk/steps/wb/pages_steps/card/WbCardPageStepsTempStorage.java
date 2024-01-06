package org.ot5usk.steps.wb.pages_steps.card;

import io.qameta.allure.Step;

public class WbCardPageStepsTempStorage {

    private static final WbCardPageSteps wbCardPageSteps = new WbCardPageSteps();
    private static String cardName;

    @Step("Запоминание названия карточки товара")
    public static void rememberProductCardName() {
        cardName = wbCardPageSteps.getCardName().getText();
    }

    @Step("Получение названия карточки товара")
    public static String getCardName() {
        return cardName;
    }
}
