package org.ot5usk.steps.internet.pages_steps.add_remove_elements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.internet.add_remove_elements.AddRemoveElementsPageButtons;

public class AddRemoveElementsPageButtonsSteps {

    private final AddRemoveElementsPageButtons buttons;

    public AddRemoveElementsPageButtonsSteps(AddRemoveElementsPageButtons buttons) {
        this.buttons = buttons;
    }

    @Step("Поиск кнопки добавления элемента")
    public SelenideElement addElementBtn() {
        return buttons.addElementBtn();
    }

    @Step("Поиск кнопки удаления элемента")
    public SelenideElement deleteElementBtn() {
        return buttons.deleteElementBtn();
    }
}
