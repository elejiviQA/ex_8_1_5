package org.ot5usk.steps.wb.pages_steps.elements_steps.base.nav_bar_menu;

import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.WbNavBarMenu;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.nav_bar_menu.wraps.WbFirstWrapNavBarMenuSteps;

public class WbNavBarMenuSteps {

    private final WbNavBarMenu navBarMenu;

    public WbNavBarMenuSteps() {
        this.navBarMenu = new WbNavBarMenu();
    }

    @Step("Открытие меню: Бытовая техника")
    public WbFirstWrapNavBarMenuSteps goToHouseholdAppliances() {
        navBarMenu.goToHouseholdAppliances();
        return new WbFirstWrapNavBarMenuSteps();
    }

    @Step("Открытие меню: Электроника")
    public WbFirstWrapNavBarMenuSteps goToElectronics() {
        navBarMenu.goToElectronics();
        return new WbFirstWrapNavBarMenuSteps();
    }

    @Step("Открытие меню: Путешествия")
    public WbFirstWrapNavBarMenuSteps goToTravels() {
        navBarMenu.goToTravels();
        return new WbFirstWrapNavBarMenuSteps();
    }
}
