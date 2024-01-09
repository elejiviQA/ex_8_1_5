package org.ot5usk.pages.wb.elements.base.nav_bar_menu.nav_bar_menus_elements_data.wraps;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.utils.LazyHelper;

import java.util.HashMap;
import java.util.Map;

public class WbFirstMenuElements {

    private static final Map<String, String> firstMenuElements = new HashMap<>();

    static {
        init();
    }

    public static SelenideElement getFirstMenuElement(String name) {
        return LazyHelper.getElement(firstMenuElements, name);
    }

    private static void init() {
        firstMenuElements.put("Техника для дома", "//div[@data-menu-id='16107']//span[text()='Техника для дома']");
        firstMenuElements.put("Ноутбуки и компьютеры", "//div[@data-menu-id='4830']//span[text()='Ноутбуки и компьютеры']");
        firstMenuElements.put("Авиабилеты", "//div[@data-menu-id='61037']//a[text()='Авиабилеты']");
    }
}
