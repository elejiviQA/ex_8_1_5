package org.ot5usk.steps.wb.assertions.pages_steps_assertions;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.nav_bar_menu.WbNavBarMenuSteps;
import org.ot5usk.utils.ProductsOfCategory;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WbCatalogAsserts {

    @Step("Проверка: название страницы = {expectedTitle}")
    public static void expectedNavBarTitle(String expectedTitle, SelenideElement navBarTitle) {
        assertEquals(expectedTitle.toLowerCase(), navBarTitle.shouldBe(visible).getText().toLowerCase());
    }

    @Step("Проверка списка категории: {categoryName}")
    public static void expectedProductsOfCategory(String categoryName) {
        List<String> expectedProducts = new ProductsOfCategory(categoryName).get();
        for (String expectedProduct : expectedProducts) {
            new WbNavBarMenuSteps().getProductsOfCategory(expectedProduct).shouldBe(visible);
        }
    }

    @Step("Проверка: заголовок результатов поиска = {expectedTitle}")
    public static void expectedSearchBarResultsTitle(String expectedTitle, SelenideElement searchBarResultsTitle) {
        assertEquals(expectedTitle.toLowerCase(), searchBarResultsTitle.shouldBe(visible).getText().toLowerCase());
    }

    @Step("Проверка: название товара = {expectedProductName}")
    public static void expectedProduct(String expectedProductName, SelenideElement productName) {
        productName.shouldBe(visible);
        assertTrue(productName.getText().toLowerCase().contains(expectedProductName.toLowerCase()));
    }
}
