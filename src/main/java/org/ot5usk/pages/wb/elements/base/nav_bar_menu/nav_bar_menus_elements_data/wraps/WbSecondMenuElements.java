package org.ot5usk.pages.wb.elements.base.nav_bar_menu.nav_bar_menus_elements_data.wraps;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.utils.LazyHelper;

import java.util.HashMap;
import java.util.Map;

public class WbSecondMenuElements {

    private static final Map<String, String> secondMenuElements = new HashMap<>();

    static {
        init();
    }

    public static SelenideElement getSecondMenuElement(String name) {
        return LazyHelper.getElement(secondMenuElements, name);
    }

    private static void init() {
        secondMenuElements.put("Пылесосы и пароочистители", "//span[text()='Пылесосы и пароочистители']");
        secondMenuElements.put("Ноутбуки", "//div[@data-menu-id='4830']//a[text()='Ноутбуки']");
    }
}
