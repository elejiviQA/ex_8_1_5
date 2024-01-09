package org.ot5usk.steps.wb.pages_steps.elements_steps.base.nav_bar_menu;

import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.WbNavBarMenu;

public class WbNavBarMenuSteps {

    private final WbNavBarMenu navBarMenu;

    public WbNavBarMenuSteps() {
        this.navBarMenu = new WbNavBarMenu();
    }

    @Step("Наведение на категорию {name}")
    public WbNavBarMenuSteps moveToCategory(String name) {
        navBarMenu.moveToCategory(name);
        return this;
    }

    @Step("Нажатие на {name}")
    public WbNavBarMenuSteps clickToFirstMenuElement(String name) {
        navBarMenu.clickToFirstMenuElement(name);
        return this;
    }

    @Step("Нажатие на {name}")
    public WbNavBarMenuSteps clickToSecondMenuElement(String name) {
        navBarMenu.clickToSecondMenuElement(name);
        return this;
    }

    @Step("Нажатие на {name}")
    public void clickToLink(String name) {
        navBarMenu.clickToLink(name);
    }
}
