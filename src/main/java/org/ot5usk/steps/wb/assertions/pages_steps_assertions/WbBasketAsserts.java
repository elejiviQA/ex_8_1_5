package org.ot5usk.steps.wb.assertions.pages_steps_assertions;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.steps.wb.pages_steps.basket.WbBasketPageSteps;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageStepsTempStorage.*;

public class WbBasketAsserts {

    private static final WbCatalogPageSteps catalogPageSteps = new WbCatalogPageSteps();
    private static final WbBasketPageSteps basketPageSteps = new WbBasketPageSteps();
    private static final String expectedCounterOfCardsInBasketValue = "1";
    private static final String expectedCounterOfCardsInBasketColor = "rgba(245, 81, 35, 1)";

    @Step("Проверка результирующего заголовка")
    public static void expectedNavBarTitle(String expectedNavBarTitle) {
        assertTrue(catalogPageSteps.getNavBarTitle().shouldBe(visible).getText().contains(expectedNavBarTitle));
    }

    @Step("Проверка пути навигационных фильтров")
    public static void expectedNavBarPath(List<String> expectedNavBarPath) {
        List<String> currentNavBarPath = List.of(catalogPageSteps.getNavBarPath().shouldBe(visible).getText().split("\n"));
        int expectedNavBarPathSize = expectedNavBarPath.size();
        if (expectedNavBarPathSize == 5) {
            assertEquals(expectedNavBarPath.size() - 1, currentNavBarPath.size());
            for (int i = 0; i < expectedNavBarPathSize; i++) {
                assertTrue(expectedNavBarPath.get(i).contains(currentNavBarPath.get(i)));
            }
        } else {
            assertEquals(expectedNavBarPath.size(), currentNavBarPath.size());
            for (int i = 0; i < expectedNavBarPathSize; i++) {
                assertTrue(expectedNavBarPath.get(i).contains(currentNavBarPath.get(i)));
            }
        }
    }

    @Step("Проверка значения счетчика количества товаров в корзине")
    public static void checkCounterOfCardsInBasketValue() {
        assertEquals(expectedCounterOfCardsInBasketValue, catalogPageSteps.getCounterOfCardsInBasket().shouldBe(visible).getText());

    }

    @Step("Проверка цвета счетчика количества товаров в корзине")
    public static void checkCounterOfCardsInBasketColor() {
        assertEquals(expectedCounterOfCardsInBasketColor, catalogPageSteps.getCounterOfCardsInBasket().shouldBe(visible).getCssValue("background-color"));
    }

    @Step("Проверка, что открытая страница - Корзина")
    public static void expectedPageIsBasket() {
        assertEquals("https://www.wildberries.ru/lk/basket", getWebDriver().getCurrentUrl());

    }

    @Step("Проверка актуальной цены товара в коризне")
    public static void checkNewCardPriceInBasket() {
        String newCardPriceInCatalog = getNewCardPriceInCatalog();
        basketPageSteps.getNewCardPrice().shouldBe(visible).shouldHave(text(newCardPriceInCatalog));
    }

    @Step("Проверка старой цены товара в коризне")
    public static void checkOldCardPriceInBasket() {
        String oldCardPriceInCatalog = getOldCardPriceInCatalog();
        basketPageSteps.getOldCardPrice().shouldHave(text(oldCardPriceInCatalog)).shouldBe(visible);
    }

    @Step("Проверка актуальной итоговой цены товаров в коризне")
    public static void checkNewTotalPriceInBasket() {
        String newCardPriceInCatalog = getNewCardPriceInCatalog();
        basketPageSteps.getNewTotalPrice().shouldHave(text(newCardPriceInCatalog)).shouldBe(visible);
    }

    @Step("Проверка старой итоговой цены товаров в коризне")
    public static void checkOldTotalPriceInBasket() {
        String oldCardPriceInCatalog = getOldCardPriceInCatalog();
        basketPageSteps.getOldTotalPrice().shouldHave(text(oldCardPriceInCatalog)).shouldBe(visible);
    }

    @Step("Проверка кнопки Заказать")
    public static void checkOrderBtnInBasket() {
        SelenideElement orderBtn = basketPageSteps.getOrderBtn().shouldBe(visible);
        assertTrue(orderBtn.isDisplayed());
        assertTrue(orderBtn.isEnabled());
    }
}
