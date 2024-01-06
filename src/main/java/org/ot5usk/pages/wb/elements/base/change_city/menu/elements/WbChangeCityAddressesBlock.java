package org.ot5usk.pages.wb.elements.base.change_city.menu.elements;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.elements.base.change_city.menu.elements.wrap.WbChangeCityInfoBlock;

import static com.codeborne.selenide.Selenide.$x;

public class WbChangeCityAddressesBlock {

    private final SelenideElement firstAddress = $x("//span[contains(@class, 'address-item__name-text')]");

    public SelenideElement getFirstAddress() {
        return firstAddress;
    }

    public void selectFirstAddress() {
        firstAddress.click();
        new WbChangeCityInfoBlock();
    }
}
