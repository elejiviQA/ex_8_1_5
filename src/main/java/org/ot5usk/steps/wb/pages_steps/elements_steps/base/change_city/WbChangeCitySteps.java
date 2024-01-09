package org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.change_city.WbChangeCity;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.menu.WbChangeCityMenuSteps;

import static com.codeborne.selenide.Condition.visible;

public class WbChangeCitySteps {

    private final WbChangeCity changeCity;

    public WbChangeCitySteps(WbChangeCity changeCity) {
        this.changeCity = changeCity;
    }

    @Step("Открытие меню смены города")
    public void openMenu() {
        changeCity.openMenu();
        new WbChangeCityMenuSteps();
    }

    public SelenideElement getCurrentAddress() {
        return changeCity.getCurrentAddress().shouldBe(visible);
    }
}
