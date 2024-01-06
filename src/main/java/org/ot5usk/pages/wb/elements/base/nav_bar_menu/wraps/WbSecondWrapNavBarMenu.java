package org.ot5usk.pages.wb.elements.base.nav_bar_menu.wraps;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.WbCatalogPage;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;

public class WbSecondWrapNavBarMenu {

    private final SelenideElement vacuumNdSteamCleaners = $x("//span[text()='Пылесосы и пароочистители']");
    private final SelenideElement laptops = $x("//div[@data-menu-id='4830']//a[text()='Ноутбуки']");

    public WbThirdWrapNavBarMenu clickVacuumNdSteamCleaners() {
        vacuumNdSteamCleaners.shouldBe(appear).click();
        return new WbThirdWrapNavBarMenu();
    }

    public WbCatalogPage clickLaptops() {
        laptops.shouldBe(appear).click();
        return new WbCatalogPage();
    }
}
