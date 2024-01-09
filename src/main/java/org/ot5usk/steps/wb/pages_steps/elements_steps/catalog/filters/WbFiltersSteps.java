package org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.filters;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.catalog.filters.WbFilters;

public class WbFiltersSteps {

    private final WbFilters filters;

    public WbFiltersSteps(WbFilters filters) {
        this.filters = filters;
    }

    public ElementsCollection getSelectedFilters() {
        return filters.getSelectedFilters();
    }

    @Step("Открыть меню фильтров")
    public void openFiltersMenu() {
        filters.openAllFiltersMenu();
        new WbFiltersMenuSteps();
    }

    public SelenideElement navBarFilterBtn() {
        return filters.getNavBarFilterBtn();
    }

    public SelenideElement baseRangingFilterBtn() {
        return filters.getBaseRangingFilterBtn();
    }
}
