package org.ot5usk.pages.wb.elements.base;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.WbBasketPage;
import org.ot5usk.pages.wb.elements.base.change_city.WbChangeCity;
import org.ot5usk.pages.wb.elements.base.nav_bar_menu.WbNavBarMenu;
import org.ot5usk.pages.wb.elements.base.search_bar.WbSearchBar;

import static com.codeborne.selenide.Selenide.$x;

public class WbBaseElements {

    private final WbChangeCity changeCity;
    private final WbSearchBar searchBar;
    private final SelenideElement navBarMenuBtn = $x("//button[contains(@aria-label, 'Навигация по сайту')]");
    private final SelenideElement counterOfCardsInBasket = $x("//span[@class='navbar-pc__notify']");
    private final SelenideElement goToBasketBtn = $x("//span[@class='navbar-pc__icon navbar-pc__icon--basket']");

    public WbBaseElements() {
        this.changeCity = new WbChangeCity();
        this.searchBar = new WbSearchBar();
    }

    public WbChangeCity changeCity() {
        return changeCity;
    }

    public WbSearchBar searchBar() {
        return searchBar;
    }

    public WbSearchBar clickOnTheSearchBar() {
        return searchBar.click();
    }

    public void clickNavBarBtn() {
        navBarMenuBtn.click();
        new WbNavBarMenu();
    }

    public SelenideElement getCounterOfCardsInBasket() {
        return counterOfCardsInBasket;
    }

    public void clickGoToBasketBtn() {
        goToBasketBtn.click();
        new WbBasketPage();
    }
}
