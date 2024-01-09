package org.ot5usk.steps.wb.steps_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.nav_bar_menu.WbNavBarMenuSteps;

import java.util.List;

import static org.ot5usk.steps.wb.steps_definitions.WbGivenStepDefinitions.homeSteps;

public class WbNavBarFiltersStepDefinitions {

    public static final WbNavBarMenuSteps navBarMenuSteps = new WbNavBarMenuSteps();

    @When("пользователь нажимает на кнопку “Фильтры”")
    public void clickNavBarFiltersMenuBtn() {
        homeSteps.clickNavBarBtn();
    }

    @And("выбирает фильтры:")
    public void selectFilters(List<String> filters) {
        switch (filters.size()) {
            case (2) -> navBarMenuSteps.moveToCategory(filters.get(0))
                        .clickToFirstMenuElement(filters.get(1));
            case (3) -> navBarMenuSteps.moveToCategory(filters.get(0))
                        .clickToFirstMenuElement(filters.get(1))
                        .clickToSecondMenuElement(filters.get(2));
            case (4) -> navBarMenuSteps.moveToCategory(filters.get(0))
                        .clickToFirstMenuElement(filters.get(1))
                        .clickToSecondMenuElement(filters.get(2))
                        .clickToLink(filters.get(3));
        }
    }
}
