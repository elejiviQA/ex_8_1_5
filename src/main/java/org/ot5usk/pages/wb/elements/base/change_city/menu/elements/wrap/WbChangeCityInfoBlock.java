package org.ot5usk.pages.wb.elements.base.change_city.menu.elements.wrap;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WbChangeCityInfoBlock {

    private final SelenideElement infoBlock = $x("//*[contains(@class, 'geo-block__info-wrap')]");
    private final SelenideElement infoBlockAddress = $x("//*[contains(@class, 'details-self__name-text')]");
    private final SelenideElement selectBtn = $x("//*[contains(@class, 'details-self__btn btn-main')]");

    public SelenideElement getInfoBlockAddress() {
        return infoBlockAddress;
    }

    public SelenideElement getInfoBlock() {
        return infoBlock;
    }

    public void clickSelectBtn() {
        selectBtn.click();
    }
}
