package org.ot5usk.steps.wb.pages_steps.elements_steps.base.nav_bar_menu.wraps;

import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.wraps.WbThirdWrapNavBarMenu;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

public class WbThirdWrapNavBarMenuSteps {

    private final WbThirdWrapNavBarMenu thirdWrapNavBarMenu;

    public WbThirdWrapNavBarMenuSteps() {
        thirdWrapNavBarMenu = new WbThirdWrapNavBarMenu();
    }

    @Step("Нажатие на ссылку: Пылесосы и пароочистители")
    public WbCatalogPageSteps clickVacuumNdSteamCleaners2() {
        thirdWrapNavBarMenu.clickVacuumNdSteamCleaners2();
        return new WbCatalogPageSteps();
    }
}
