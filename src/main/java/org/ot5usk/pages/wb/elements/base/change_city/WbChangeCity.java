package org.ot5usk.pages.wb.elements.base.change_city;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.elements.base.change_city.menu.WbChangeCityMenu;

import static com.codeborne.selenide.Selenide.$x;

public class WbChangeCity {

    private final SelenideElement menu = $x("//li[contains(@class, 'simple-menu__item j-geocity-wrap')]");
    private final SelenideElement currentAddress = $x("//span[contains(@data-wba-header-name, 'DLV_Adress')]");

    public void openMenu() {
        menu.click();
        new WbChangeCityMenu();
    }

    public SelenideElement getCurrentAddress() {
        return currentAddress;
    }
}