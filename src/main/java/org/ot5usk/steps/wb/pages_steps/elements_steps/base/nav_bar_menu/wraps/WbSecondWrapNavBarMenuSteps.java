package org.ot5usk.steps.wb.pages_steps.elements_steps.base.nav_bar_menu.wraps;

import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.wraps.WbSecondWrapNavBarMenu;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

public class WbSecondWrapNavBarMenuSteps {

    private final WbSecondWrapNavBarMenu secondWrapNavBarMenu;

    public WbSecondWrapNavBarMenuSteps() {
        this.secondWrapNavBarMenu = new WbSecondWrapNavBarMenu();
    }

    @Step("Открытие меню: Пылесосы и пароочистители")
    public WbThirdWrapNavBarMenuSteps clickVacuumNdSteamCleaners() {
        secondWrapNavBarMenu.clickVacuumNdSteamCleaners();
        return new WbThirdWrapNavBarMenuSteps();
    }

    public WbCatalogPageSteps clickLaptops() {
        secondWrapNavBarMenu.clickLaptops();
        return new WbCatalogPageSteps();
    }
}
