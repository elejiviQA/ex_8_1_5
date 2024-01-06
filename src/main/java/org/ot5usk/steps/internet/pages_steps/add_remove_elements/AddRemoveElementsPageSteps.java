package org.ot5usk.steps.internet.pages_steps.add_remove_elements;

import io.qameta.allure.Step;
import org.ot5usk.pages.internet.add_remove_elements.AddRemoveElementsPage;
import org.ot5usk.pages.internet.add_remove_elements.AddRemoveElementsPageButtons;

public class AddRemoveElementsPageSteps {

    private final AddRemoveElementsPage page;
    private final AddRemoveElementsPageButtonsSteps buttonsSteps;

    public AddRemoveElementsPageSteps(AddRemoveElementsPage page) {
        this.page = page;
        this.buttonsSteps = new AddRemoveElementsPageButtonsSteps(new AddRemoveElementsPageButtons());
    }

    @Step("Обращение к кнопкам страницы")
    public AddRemoveElementsPageButtonsSteps buttonsSteps() {
        return buttonsSteps;
    }

    @Step("Нажатие на кнопку добавления элемента")
    public void addElement() {
        page.addElement();
    }

    @Step("Нажатие на кнопку удаления элемента")
    public void deleteElement() {
        page.deleteElement();
    }
}
