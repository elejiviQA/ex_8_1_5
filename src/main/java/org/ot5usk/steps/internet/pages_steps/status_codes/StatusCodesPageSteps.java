package org.ot5usk.steps.internet.pages_steps.status_codes;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.internet.status_codes.StatusCodesPage;

public class StatusCodesPageSteps {

    private final StatusCodesPage page;

    public StatusCodesPageSteps(StatusCodesPage page) {
        this.page = page;
    }

    @Step("Поиск content")
    public SelenideElement content() {
        return page.content();
    }

    @Step("Получение списка из content")
    public SelenideElement contentList() {
        return content().find("ul");
    }

    @Step("Получение всех элементов списка")
    public ElementsCollection contentListItems() {
        return contentList().findAll("li");
    }

    @Step("Получение {0} элемента списка")
    public SelenideElement contentListItem(int index) {
        return contentListItems().get(index);
    }

    @Step("Получение <a> {0} элемента списка")
    public SelenideElement tagAContentListItem(int index) {
        return contentListItem(index).find("a");
    }
}
