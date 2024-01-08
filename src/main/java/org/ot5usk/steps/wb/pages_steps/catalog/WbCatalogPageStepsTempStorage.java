package org.ot5usk.steps.wb.pages_steps.catalog;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;

public class WbCatalogPageStepsTempStorage {

    private static final WbCatalogPageSteps catalogPageSteps = new WbCatalogPageSteps();
    private static String cardNameInCatalog;
    private static String cardBrandInCatalog;

    @Step("Запоминание товара каталога")
    public static void rememberCatalogCard() {
        cardNameInCatalog = catalogPageSteps.cardsSteps().getCardName().shouldBe(visible).getText();
        cardBrandInCatalog = catalogPageSteps.cardsSteps().getCardBrand().shouldBe(visible).getText();
    }

    @Step("Получение названия товара в каталоге")
    public static String getCardNameInCatalog() {
        return cardNameInCatalog;
    }

    @Step("Получение брэнда товара в каталоге")
    public static String getCardBrandInCatalog() {
        return cardBrandInCatalog;
    }
}
