package org.ot5usk.steps.wb.pages_steps.elements_steps.base.search_bar;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.search_bar.WbSearchBar;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;

public class WbSearchBarSteps {

    private final WbSearchBar searchBar;

    public WbSearchBarSteps(WbSearchBar searchBar) {
        this.searchBar = searchBar;
    }

    @Step("Ввод запроса в поисковую строку")
    public void enterQuery(String query) {
        searchBar.enterQuery(query);
    }

    @Step("Нажатие Enter в поисковой строке")
    public void sendEnter() {
        searchBar.sendEnter();
        new WbCatalogPageSteps();
    }

    @Step("Нажатие на крестик поисковой строки")
    public void clickTheCross() {
        searchBar.clickTheCross();
    }

    public SelenideElement getCross() {
        return searchBar.getCross();
    }
}
