package org.ot5usk.pages.wb.elements.base.nav_bar_menu.nav_bar_menus_elements_data.wraps;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.utils.LazyHelper;

import java.util.HashMap;
import java.util.Map;

public class WbThirdMenuLinks {

    private static final Map<String, String> wbThirdMenuLinks = new HashMap<>();

    static {
        init();
    }

    public static SelenideElement getLink(String name) {
        return LazyHelper.getElement(wbThirdMenuLinks, name);
    }

    private static void init() {
        wbThirdMenuLinks.put("Пылесосы и пароочистители", "//div[@data-menu-id='16107']//a[text()='Пылесосы и пароочистители']");
    }
}
