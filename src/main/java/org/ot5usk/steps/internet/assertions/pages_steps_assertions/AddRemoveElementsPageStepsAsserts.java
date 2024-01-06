package org.ot5usk.steps.internet.assertions.pages_steps_assertions;

import io.qameta.allure.Step;
import org.ot5usk.steps.internet.assertions.InternetAssertsHeap;
import org.ot5usk.steps.internet.pages_steps.add_remove_elements.AddRemoveElementsPageSteps;

public class AddRemoveElementsPageStepsAsserts extends InternetAssertsHeap {

    AddRemoveElementsPageSteps pageSteps;

    public AddRemoveElementsPageStepsAsserts(AddRemoveElementsPageSteps pageSteps) {
        this.pageSteps = pageSteps;
    }

    @Step("Проверка видимости кнопки добавления элемента")
    public void addElementBtnIsVisible() {
        elementIsVisible(pageSteps.buttonsSteps().addElementBtn());
    }

    @Step("Проверка невидимости кнопки удаления элемента")
    public void deleteElementBtnIsInvisible() {
        elementIsInvisible(pageSteps.buttonsSteps().deleteElementBtn());
    }

    @Step("Проверка появления кнопки удаления элемента")
    public void deleteElementBtnIsAppear() {
        elementIsAppear(pageSteps.buttonsSteps().deleteElementBtn());
    }

    @Step("Проверка исчезновения кнопки удаления элемента")
    public void deleteElementBtnIsDisappear() {
        elementIsDisappear(pageSteps.buttonsSteps().deleteElementBtn());
    }
}
