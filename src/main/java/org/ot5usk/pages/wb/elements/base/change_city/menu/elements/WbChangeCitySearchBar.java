package org.ot5usk.pages.wb.elements.base.change_city.menu.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;

public class WbChangeCitySearchBar {

    private final SelenideElement searchBar = $x("//input[contains(@placeholder, 'Введите адрес')]");
    private final SelenideElement searchBtn = $x("//ymaps[@class='ymaps-2-1-79-searchbox__button-cell']");
    private final SelenideElement searchBarMenu = $x("//ymaps[@class='ymaps-2-1-79-searchbox-list-button']");

    public void executeQuery(String query) {
        searchBar.shouldBe(appear).sendKeys(query);
        searchBtn.shouldBe(appear).click();
        searchBarMenu.shouldBe(appear).click();
        searchBar.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
    }
}
