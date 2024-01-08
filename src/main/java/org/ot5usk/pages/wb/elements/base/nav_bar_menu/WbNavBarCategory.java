package org.ot5usk.pages.wb.elements.base.nav_bar_menu;

import com.codeborne.selenide.SelenideElement;

@FunctionalInterface
public interface WbNavBarCategory {

    SelenideElement get(String name);
}
