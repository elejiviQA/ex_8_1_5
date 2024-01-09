package org.ot5usk.pages.wb.elements.base.nav_bar_menu;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.elements.Element;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.nav_bar_menus_elements_data.WbCategoriesElements;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.nav_bar_menus_elements_data.wraps.WbFirstMenuElements;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.nav_bar_menus_elements_data.wraps.WbSecondMenuElements;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.nav_bar_menus_elements_data.wraps.WbThirdMenuLinks;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.actions;

public class WbNavBarMenu {

    private final Element category = WbCategoriesElements::getCategory;
    private final Element firstMenuElement = WbFirstMenuElements::getFirstMenuElement;
    private final Element secondMenuElement = WbSecondMenuElements::getSecondMenuElement;
    private final Element link = WbThirdMenuLinks::getLink;

    public void moveToCategory(String name) {
        moveTo(category.get(name));
    }

    public void clickToFirstMenuElement(String name) {
        clickTo(firstMenuElement.get(name));
    }

    public void clickToSecondMenuElement(String name) {
        clickTo(secondMenuElement.get(name));
    }

    public void clickToLink(String name) {
        clickTo(link.get(name));
    }

    private void moveTo(SelenideElement element) {
        actions().moveToElement(element.shouldBe(appear)).build().perform();
    }

    private void clickTo(SelenideElement element) {
        element.shouldBe(visible).click();
    }
}