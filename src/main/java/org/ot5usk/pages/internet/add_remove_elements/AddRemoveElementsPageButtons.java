package org.ot5usk.pages.internet.add_remove_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AddRemoveElementsPageButtons {

    private final SelenideElement addElementBtn = $x("//button[text()='Add Element']");
    private final SelenideElement deleteElementBtn = $x("//button[text()='Delete']");

    public SelenideElement addElementBtn() {
        return addElementBtn;
    }

    public SelenideElement deleteElementBtn() {
        return deleteElementBtn;
    }
}
