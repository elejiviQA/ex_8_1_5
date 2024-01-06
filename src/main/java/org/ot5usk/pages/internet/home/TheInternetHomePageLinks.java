package org.ot5usk.pages.internet.home;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.internet.add_remove_elements.AddRemoveElementsPage;
import org.ot5usk.pages.internet.horizontal_slider.HorizontalSliderPage;
import org.ot5usk.pages.internet.status_codes.StatusCodesPage;

import static com.codeborne.selenide.Selenide.$x;

public class TheInternetHomePageLinks {

    private final SelenideElement addRemoveElementsPageLink = $x("//a[text()='Add/Remove Elements']");
    private final SelenideElement statusCodesPageLink = $x("//a[text()='Status Codes']");
    private final SelenideElement horizontalSliderPageLink = $x("//a[text()='Horizontal Slider']");

    public SelenideElement addRemoveElementsPageLink() {
        return addRemoveElementsPageLink;
    }

    public SelenideElement statusCodesPageLink() {
        return statusCodesPageLink;
    }

    public SelenideElement horizontalSliderPageLink() {
        return horizontalSliderPageLink;
    }

    public AddRemoveElementsPage goToAddRemoveElementsPage() {
        addRemoveElementsPageLink().click();
        return new AddRemoveElementsPage();
    }

    public StatusCodesPage goToStatusCodesPage() {
        statusCodesPageLink().click();
        return new StatusCodesPage();
    }

    public HorizontalSliderPage goToHorizontalSliderPage() {
        horizontalSliderPageLink().click();
        return new HorizontalSliderPage();
    }
}
