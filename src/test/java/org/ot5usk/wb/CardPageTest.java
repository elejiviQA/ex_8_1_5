package org.ot5usk.wb;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.ot5usk.steps.wb.pages_steps.card.WbCardPageSteps;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

import static com.codeborne.selenide.Selenide.sleep;
import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbBasketAsserts.checkCardNameInBasket;
import static org.ot5usk.steps.wb.pages_steps.card.WbCardPageStepsTempStorage.rememberProductCardName;

public class CardPageTest extends WbBaseTest {

    @DisplayName("Взаимодействие со страницей карточки товара")
    @Description("Добавление товара в коризну со страницы карточки товара")
    @ParameterizedTest(name = "Запрос: {0}")
    @CsvSource("мобильный телефон")
    void testCardPage(String query) {

        Selenide.clearBrowserLocalStorage();

        WbCatalogPageSteps catalogPageSteps = wbHomePageSteps.clickOnTheSearchBar().enterQuery(query).sendEnter();

        WbCardPageSteps cardPageSteps = catalogPageSteps.cardsSteps().clickToCard();

        sleep(2000);

        rememberProductCardName();

        cardPageSteps.clickAddToBasketBtn().clickGoToBasketBtn();

        checkCardNameInBasket();
    }


}