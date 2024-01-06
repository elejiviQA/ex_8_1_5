package org.ot5usk.wb;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbBasketAsserts.*;
import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbBasketAsserts.checkOrderBtnInBasket;
import static org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageStepsTempStorage.rememberCatalogCard;

public class BasketTest extends WbBaseTest {

    @DisplayName("Добавление товара в корзину")
    @Description("Проверка результатов: выбора навигационных фильтров, добавления товара в коризну")
    @Test
    void testBasket() {

        Selenide.clearBrowserLocalStorage();

        WbCatalogPageSteps catalogPageSteps = wbHomePageSteps
                .clickNavBarBtn()
                .goToHouseholdAppliances()
                .clickHomeAppliances()
                .clickVacuumNdSteamCleaners()
                .clickVacuumNdSteamCleaners2();

        checkNavBarTitle();

        checkNavBarPath();

        rememberCatalogCard();

        catalogPageSteps.cardsSteps().clickAddToBasketBtn();

        checkCounterOfCardsInBasketValue();

        checkCounterOfCardsInBasketColor();

        catalogPageSteps.clickGoToBasketBtn();

        checkCardTitleInBasket();

        checkNewCardPriceInBasket();

        checkOldCardPriceInBasket();

        checkNewTotalPriceInBasket();

        checkOldTotalPriceInBasket();

        checkOrderBtnInBasket();
    }
}
