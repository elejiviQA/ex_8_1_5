package org.ot5usk.pages.wb.elements.base.nav_bar_menu.nav_bar_menus_elements_data;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.utils.LazyHelper;

import java.util.HashMap;
import java.util.Map;

public class WbCategoriesElements {

    private static final Map<String, String> categories = new HashMap<>();

    static {
        init();
    }

    public static SelenideElement getCategory(String name) {
        return LazyHelper.getElement(categories, name);
    }

    private static void init() {
        categories.put("Бытовая техника", "//ul[@class='menu-burger__main-list']//a[text()='Бытовая техника']");
        categories.put("Электроника", "//ul[@class='menu-burger__main-list']//a[text()='Электроника']");
        categories.put("Путешествия", "//li[@data-menu-id='61037']//a[text()='Путешествия']");
    }
}
