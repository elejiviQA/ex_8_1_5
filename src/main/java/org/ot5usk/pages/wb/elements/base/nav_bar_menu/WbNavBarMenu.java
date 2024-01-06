package org.ot5usk.pages.wb.elements.base.nav_bar_menu;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.wraps.WbFirstWrapNavBarMenu;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;

public class WbNavBarMenu {

    private final SelenideElement householdAppliances = $x("//ul[@class='menu-burger__main-list']//a[text()='Бытовая техника']");
    private final SelenideElement electronics = $x("//ul[@class='menu-burger__main-list']//a[text()='Электроника']");
    private final SelenideElement travels = $x("//li[@data-menu-id='61037']//a[text()='Путешествия']");

    public WbFirstWrapNavBarMenu goToHouseholdAppliances() {
        actions().moveToElement(householdAppliances.shouldBe(appear)).build().perform();
        return new WbFirstWrapNavBarMenu();
    }

    public WbFirstWrapNavBarMenu goToElectronics() {
        actions().moveToElement(electronics.shouldBe(appear)).build().perform();
        return new WbFirstWrapNavBarMenu();
    }

    public WbFirstWrapNavBarMenu goToTravels() {
        actions().moveToElement(travels.shouldBe(appear)).build().perform();
        return new WbFirstWrapNavBarMenu();
    }
}