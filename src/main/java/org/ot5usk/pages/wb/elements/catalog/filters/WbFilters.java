package org.ot5usk.pages.wb.elements.catalog.filters;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class WbFilters {

    private final SelenideElement menuBtn = $x("//button[@class='dropdown-filter__btn dropdown-filter__btn--all']");
    private final SelenideElement navBarFilterBtn = $x("//button[contains(@class, 'dropdown-filter__btn dropdown-filter__btn--burger')]");
    private final SelenideElement baseRangingFilterBtn = $x("//button[contains(@class, 'dropdown-filter__btn dropdown-filter__btn--sorter')]");
    private final ElementsCollection selectedFilters = $$x("//span[@class='your-choice__btn']");


    public void openAllFiltersMenu() {
        menuBtn.click();
        new WbFiltersMenu();
    }

    public SelenideElement getNavBarFilterBtn() {
        return navBarFilterBtn;
    }

    public SelenideElement getBaseRangingFilterBtn() {
        return baseRangingFilterBtn;
    }

    public ElementsCollection getSelectedFilters() {
        return selectedFilters;
    }
}
