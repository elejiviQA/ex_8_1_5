package org.ot5usk.steps.internet.pages_steps.home;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.internet.home.TheInternetHomePageLinks;
import org.ot5usk.steps.internet.pages_steps.horizontal_slider.HorizontalSliderPageSteps;
import org.ot5usk.steps.internet.pages_steps.status_codes.StatusCodesPageSteps;
import org.ot5usk.steps.internet.pages_steps.add_remove_elements.AddRemoveElementsPageSteps;

public class TheInternetHomePageLinksSteps {

    private final TheInternetHomePageLinks links;

    public TheInternetHomePageLinksSteps(TheInternetHomePageLinks links) {
        this.links = links;
    }

    @Step("Поиск ссылки на страницу Add/Remove Elements")
    public SelenideElement addRemoveElementsPageLinkSteps() {
        return links.addRemoveElementsPageLink();
    }

    @Step("Поиск ссылки на страницу Status Codes")
    public SelenideElement statusCodesPageLinkSteps() {
        return links.statusCodesPageLink();
    }

    @Step("Поиск ссылки на страницу Horizontal Slider")
    public SelenideElement horizontalSliderPageLinkSteps() {
        return links.horizontalSliderPageLink();
    }

    @Step("Нажатие на ссылку: Add/Remove Elements")
    public AddRemoveElementsPageSteps goToAddRemoveElementsPageSteps() {
        return new AddRemoveElementsPageSteps(links.goToAddRemoveElementsPage());
    }

    @Step("Нажатие на ссылку: Horizontal Slider")
    public HorizontalSliderPageSteps goToHorizontalSliderPageSteps() {
        return new HorizontalSliderPageSteps(links.goToHorizontalSliderPage());
    }

    @Step("Нажатие на ссылку: Status Codes")
    public StatusCodesPageSteps goToStatusCodesPageSteps() {
        return new StatusCodesPageSteps(links.goToStatusCodesPage());
    }
}
