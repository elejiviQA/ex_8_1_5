package org.ot5usk.steps.wb.pages_steps.elements_steps.base.nav_bar_menu;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.WbNavBarMenu;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

public class WbNavBarMenuSteps {

    private final WbNavBarMenu navBarMenu;

    public WbNavBarMenuSteps() {
        this.navBarMenu = new WbNavBarMenu();
    }

    public SelenideElement getProductsOfCategory(String productsName) {
        return navBarMenu.getProductsOfCategory(productsName);
    }

    @Step("Нажатие на категорию товаров {categoryName}")
    public void clickToCategory(String categoryName) {
        navBarMenu.clickToCategory(categoryName);
        new WbCatalogPageSteps();
    }
}
