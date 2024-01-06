package org.ot5usk.pages.wb.elements.flights;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;

public class WbPassengersTable {

    private final SelenideElement addAnAdultPassengerBtn = $$x("//button[@type='button']").get(18);

    public void clickAddAnAdultPassengerBtn() {
        addAnAdultPassengerBtn.click();
    }
}
