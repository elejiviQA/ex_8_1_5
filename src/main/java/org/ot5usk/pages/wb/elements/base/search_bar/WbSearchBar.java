package org.ot5usk.pages.wb.elements.base.search_bar;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.ot5usk.pages.wb.WbCatalogPage;

import static com.codeborne.selenide.Selenide.$x;

public class WbSearchBar {

    private final SelenideElement searchInput = $x("//*[contains(@id, 'searchInput')]");
    private final SelenideElement cross = $x("//button[contains(@aria-label, 'Очистить поиск')]");

    public WbSearchBar click() {
        searchInput.click();
        return this;
    }

    public void enterQuery(String query) {
        searchInput.sendKeys(query);
    }

    public WbCatalogPage sendEnter() {
        searchInput.sendKeys(Keys.ENTER);
        return new WbCatalogPage();
    }

    public void clickTheCross() {
        cross.click();
    }

    public SelenideElement getCross() {
        return cross;
    }
}
