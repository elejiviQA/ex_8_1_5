package org.ot5usk.pages.wb.elements.base.nav_bar_menu;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.WbCatalogPage;

import static com.codeborne.selenide.Selenide.$x;

public class WbNavBarMenu {

    private final WbNavBarCategory category = (categoryName -> $x("//ul[@class='menu-burger__main-list']//a[text()='" + categoryName + "']"));
    private final WbNavBarCategory productsOfCategory = (productsName -> $x("//div[@class='menu-catalog']//a[text()='" + productsName + "']"));

    public void clickToCategory(String categoryName) {
        getCategory(categoryName).click();
        new WbCatalogPage();
    }

    public SelenideElement getCategory(String categoryName) {
        return category.get(categoryName);
    }

    public SelenideElement getProductsOfCategory(String productsName) {
        return productsOfCategory.get(productsName);
    }
}