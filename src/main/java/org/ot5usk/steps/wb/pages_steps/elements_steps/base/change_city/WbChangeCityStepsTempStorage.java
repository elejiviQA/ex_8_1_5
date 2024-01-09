package org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city;

import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.change_city.WbChangeCity;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.menu.WbChangeCityMenuSteps;

import static com.codeborne.selenide.Condition.visible;

public class WbChangeCityStepsTempStorage {

    private static final WbChangeCityMenuSteps menuSteps = new WbChangeCityMenuSteps();
    private static final WbChangeCitySteps changeCitySteps = new WbChangeCitySteps(new WbChangeCity());
    private static String firstAddress;
    private static String infoBlockAddress;
    private static String currentAddress;

    @Step("Запоминание первого адреса из результирующего списка")
    public static void rememberFirstAddress() {
        firstAddress = menuSteps.getFirstAddress().shouldBe(visible).getText();
    }

    @Step("Получение первого адреса из результирующего списка")
    public static String getFirstAddress() {
        return firstAddress;
    }

    @Step("Запоминание адреса из блока информации о центре выдачи")
    public static void rememberInfoBlockAddress() {
        infoBlockAddress = menuSteps.getInfoBlockAddress().shouldBe(visible).getText();
    }

    @Step("Получение адреса из блока информации о центре выдачи")
    public static String getInfoBlockAddress() {
        return infoBlockAddress;
    }

    @Step("Получение текущего адреса доставки")
    public static String getCurrentAddress() {
        if (currentAddress == null) {
            currentAddress = changeCitySteps.getCurrentAddress().shouldBe(visible).getText();
        }
        return currentAddress;
    }
}
