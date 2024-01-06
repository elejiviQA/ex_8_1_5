package org.ot5usk.pages.wb.elements.base.nav_bar_menu.wraps;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.WbFlightsPage;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;

public class WbFirstWrapNavBarMenu {

    private final SelenideElement homeAppliances = $x("//div[@data-menu-id='16107']//span[text()='Техника для дома']");
    private final SelenideElement laptopsNdComputers = $x("//div[@data-menu-id='4830']//span[text()='Ноутбуки и компьютеры']");
    private final SelenideElement flights = $x("//div[@data-menu-id='61037']//a[text()='Авиабилеты']");

    public WbSecondWrapNavBarMenu clickHomeAppliances() {
        homeAppliances.shouldBe(appear).click();
        return new WbSecondWrapNavBarMenu();
    }

    public WbSecondWrapNavBarMenu clickLaptopsNdComputers() {
        laptopsNdComputers.shouldBe(appear).click();
        return new WbSecondWrapNavBarMenu();
    }

    public WbFlightsPage clickFlights() {
        flights.shouldBe(appear).click();
        return new WbFlightsPage();
    }
}
