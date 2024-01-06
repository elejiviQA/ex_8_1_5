package org.ot5usk.internet.types_of_expectations;

import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.steps.internet.assertions.pages_steps_assertions.AddRemoveElementsPageStepsAsserts;
import org.ot5usk.steps.internet.pages_steps.add_remove_elements.AddRemoveElementsPageSteps;

public class AddRemoveElementsPageTest extends InternetPagesBaseTest {

    private static AddRemoveElementsPageSteps pageSteps;
    private static AddRemoveElementsPageStepsAsserts pageStepsAsserts;

    @BeforeEach
    void init() {
        pageSteps = homePageSteps.goToAddRemoveElementsPageSteps();
        pageStepsAsserts = new AddRemoveElementsPageStepsAsserts(pageSteps);
    }

    @DisplayName("Кнопка добавления элемента на странице по умолчанию")
    @Description("Кнопка добавления элемента присутствует")
    @Test
    void testAddElementBtnOnDefaultPage() {
        pageStepsAsserts.addElementBtnIsVisible();
    }

    @DisplayName("Кнопка удаления элемента на странице по умолчанию")
    @Description("Кнопка удаления элемента отсутствует")
    @Test
    void testDeleteElementBtnOnDefaultPage() {
        pageStepsAsserts.deleteElementBtnIsInvisible();
    }

    @DisplayName("Нажатие на кнопку добавления элемента")
    @Description("На странице появилась кнопка удаления элемента")
    @Test
    void testClickOnTheAddElementBtn() {
        pageSteps.addElement();
        pageStepsAsserts.deleteElementBtnIsAppear();
    }

    @DisplayName("Нажатие на кнопку удаления элемента")
    @Description("На странице исчезла кнопка удаления элемента")
    @Test
    void testClickOnTheDeleteElementBtn() {
        pageSteps.addElement();
        pageSteps.deleteElement();
        pageStepsAsserts.deleteElementBtnIsDisappear();
    }

    @AfterEach
    void backToHomePage() {
        homePageSteps.openHomePage();
    }
}
