package org.ot5usk.pages.internet.add_remove_elements;

import com.codeborne.selenide.SelenideElement;

public class AddRemoveElementsPage {

    private final AddRemoveElementsPageButtons buttons;

    public AddRemoveElementsPage() {
        buttons = new AddRemoveElementsPageButtons();
    }

    public SelenideElement addElementBtn() {
        return buttons.addElementBtn();
    }

    public SelenideElement deleteElementBtn() {
        return buttons.deleteElementBtn();
    }

    public void addElement() {
        addElementBtn().click();
    }

    public void deleteElement() {
        deleteElementBtn().click();
    }
}
