package org.ot5usk.steps.wb.pages_steps.catalog;

import io.qameta.allure.Step;
import org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.cards.WbCardsSteps;

import static com.codeborne.selenide.Condition.visible;

public class WbCatalogPageStepsTempStorage {

    private static final WbCatalogPageSteps catalogPageSteps = new WbCatalogPageSteps();
    private static String newCardPriceInCatalog;
    private static String oldCardPriceInCatalog;
    private static String navBarCardsCounterBeforeUseFilters;

    @Step("Запоминание товара каталога")
    public static void rememberCatalogCard() {
        WbCardsSteps cardsSteps = catalogPageSteps.cardsSteps();
        newCardPriceInCatalog = cardsSteps.getNewCardPrice().shouldBe(visible).getText();
        oldCardPriceInCatalog = cardsSteps.getOldCardPrice().shouldBe(visible).getText();
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
        navBarCardsCounterBeforeUseFilters = catalogPageSteps.getNavBarCardsCounter().shouldBe(visible).getText();
    }

    @Step("Получение значения счетчика количества товаров до использования фильтров")
    public static String getNavBarCardsCounter() {
        return navBarCardsCounterBeforeUseFilters;
    }
}
