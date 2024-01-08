package org.ot5usk.steps.wb.assertions.pages_steps_assertions;

import io.qameta.allure.Step;
import org.ot5usk.steps.wb.pages_steps.basket.WbBasketPageSteps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageStepsTempStorage.*;

public class WbBasketAsserts {

    private static final WbBasketPageSteps basketPageSteps = new WbBasketPageSteps();

    @Step("Проверка имени и брэнда товара в коризине")
    public static void checkCardTitleInBasket() {
        String catalogCardName = getCardNameInCatalog();
        String catalogCardBrand = getCardBrandInCatalog();
        List<String> cardInCatalog = List.of(catalogCardName, catalogCardBrand);
        List<String> result = new ArrayList<>();
        for (String s : cardInCatalog) {
            List<String> temp = Arrays.stream(s.split(" ")).toList();
            temp = temp.stream().map(e -> e.replaceAll("[^A-Za-zА-Яа-я0-9]", "")).toList();
            temp = temp.stream().filter(e -> !e.isEmpty()).toList();
            result.addAll(temp);
        }
        String basketCardTitle = basketPageSteps.getCardTitle().shouldBe(visible).getText();
        for (String s : result) {
            assertTrue(basketCardTitle.contains(s));
        }
    }
}
