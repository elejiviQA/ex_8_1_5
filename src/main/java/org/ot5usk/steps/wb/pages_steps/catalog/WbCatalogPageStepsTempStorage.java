package org.ot5usk.steps.wb.pages_steps.catalog;

import io.qameta.allure.Step;

public class WbCatalogPageStepsTempStorage {

    private static final WbCatalogPageSteps catalogPageSteps = new WbCatalogPageSteps();
    private static String cardNameInCatalog;
    private static String cardBrandInCatalog;
    private static String newCardPriceInCatalog;
    private static String oldCardPriceInCatalog;
    private static String navBarCardsCounterBeforeUseFilters;

    @Step("Запоминание товара каталога")
    public static void rememberCatalogCard() {
        cardNameInCatalog = catalogPageSteps.cardsSteps().getCardName().getText();
        cardBrandInCatalog = catalogPageSteps.cardsSteps().getCardBrand().getText();
        newCardPriceInCatalog = catalogPageSteps.cardsSteps().getNewCardPrice().getText();
        oldCardPriceInCatalog = catalogPageSteps.cardsSteps().getOldCardPrice().getText();
    }

    @Step("Получение названия товара в каталоге")
    public static String getCardNameInCatalog() {
        return cardNameInCatalog;
    }

    @Step("Получение брэнда товара в каталоге")
    public static String getCardBrandInCatalog() {
        return cardBrandInCatalog;
    }

    @Step("Получение актуальной цены товара в каталоге")
    public static String getNewCardPriceInCatalog() {
        return newCardPriceInCatalog;
    }

    @Step("Получение старой цены товара в каталоге")
    public static String getOldCardPriceInCatalog() {
        return oldCardPriceInCatalog;
    }

    @Step("Запоминание значения счетчика количества товаров до использования фильтров")
    public static void rememberNavBarCardsCounter() {
        navBarCardsCounterBeforeUseFilters = catalogPageSteps.getNavBarCardsCounter().getText();
    }

    @Step("Получение значения счетчика количества товаров до использования фильтров")
    public static String getNavBarCardsCounter() {
        return navBarCardsCounterBeforeUseFilters;
    }
}
