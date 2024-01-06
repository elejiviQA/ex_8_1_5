package org.ot5usk.steps.wb.pages_steps.home;

import io.qameta.allure.Step;
import org.ot5usk.pages.wb.WbHomePage;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.WbBaseElementsSteps;

public class WbHomePageSteps extends WbBaseElementsSteps {

    private final WbHomePage home;

    public WbHomePageSteps() {
        this.home = new WbHomePage();
    }


    @Step("Открытие домашней страницы")
    public WbHomePageSteps openHomePage() {
        home.open();
        return this;
    }
}
