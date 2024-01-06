package org.ot5usk.steps.wb.assertions.pages_steps_assertions;

import io.qameta.allure.Step;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.WbChangeCityStepsTempStorage;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.menu.WbChangeCityMenuSteps;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.webdriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WbChangeCityAsserts {

    private static final WbChangeCityMenuSteps menuSteps = new WbChangeCityMenuSteps();

    @Step("Проверка появления информации о центре выдачи")
    public static void checkInfoBlock() {
        menuSteps.getInfoBlock().shouldBe(appear);
    }

    @Step("Проверка адреса пункта выдачи")
    public static void checkInfoBlockAddress() {
        String firstAddress = WbChangeCityStepsTempStorage.getFirstAddress();
        String infoBlockAddress = WbChangeCityStepsTempStorage.getInfoBlockAddress();
        assertEquals(firstAddress, infoBlockAddress);
    }

    @Step("Проверка перехода на главную страницу")
    public static void checkCurrentUrl() {
        String actualUrl = webdriver().driver().getWebDriver().getCurrentUrl();
        assertEquals("https://www.wildberries.ru/", actualUrl);
    }

    @Step("Проверка текущего адреса")
    public static void checkCurrentAddress() {
        String infoBlockAddress = WbChangeCityStepsTempStorage.getInfoBlockAddress();
        String currentAddress = WbChangeCityStepsTempStorage.getCurrentAddress();
        assertEquals(infoBlockAddress, currentAddress);
    }
}
