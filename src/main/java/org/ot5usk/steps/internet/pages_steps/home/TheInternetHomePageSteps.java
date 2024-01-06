package org.ot5usk.steps.internet.pages_steps.home;

import io.qameta.allure.Step;
import org.ot5usk.pages.internet.home.TheInternetHomePage;
import org.ot5usk.steps.internet.pages_steps.horizontal_slider.HorizontalSliderPageSteps;
import org.ot5usk.steps.internet.pages_steps.status_codes.StatusCodesPageSteps;
import org.ot5usk.steps.internet.pages_steps.add_remove_elements.AddRemoveElementsPageSteps;

public class TheInternetHomePageSteps {

    private final TheInternetHomePage page;
    private final TheInternetHomePageLinksSteps linksSteps;

    public TheInternetHomePageSteps() {
        this.page = new TheInternetHomePage();
        this.linksSteps = new TheInternetHomePageLinksSteps(page.links());
    }

    @Step("Поиск всех ссылок домашней страницы")
    public TheInternetHomePageLinksSteps linksSteps() {
        return linksSteps;
    }

    @Step("Открытие домашней страницы")
    public void openHomePage() {
        page.openHomePage();
    }

    @Step("Переход на страницу: Add/Remove Elements")
    public AddRemoveElementsPageSteps goToAddRemoveElementsPageSteps() {
        return linksSteps().goToAddRemoveElementsPageSteps();
    }

    @Step("Переход на страницу: Horizontal Slider")
    public HorizontalSliderPageSteps goToHorizontalSliderPageSteps() {
        return linksSteps.goToHorizontalSliderPageSteps();
    }

    @Step("Переход на страницу: Status Codes")
    public StatusCodesPageSteps goToStatusCodesPageSteps() {
        return linksSteps.goToStatusCodesPageSteps();
    }
}
