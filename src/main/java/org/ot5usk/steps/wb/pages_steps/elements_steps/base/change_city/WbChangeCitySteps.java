package org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.change_city.WbChangeCity;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.menu.WbChangeCityMenuSteps;

public class WbChangeCitySteps {

    private final WbChangeCity changeCity;

    public WbChangeCitySteps() {
        this.changeCity = new WbChangeCity();
    }

    @Step("Открытие меню смены города")
    public WbChangeCityMenuSteps openMenu() {
        changeCity.openMenu();
        return new WbChangeCityMenuSteps();
    }

    @Step("Поиск текущего адреса")
    public SelenideElement getCurrentAddress() {
        return changeCity.getCurrentAddress();
    }
}
