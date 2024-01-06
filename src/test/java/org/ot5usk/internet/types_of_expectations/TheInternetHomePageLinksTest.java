package org.ot5usk.internet.types_of_expectations;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.steps.internet.assertions.pages_steps_assertions.TheInternetHomePageLinksStepsAsserts;

public class TheInternetHomePageLinksTest extends InternetPagesBaseTest {

    private static TheInternetHomePageLinksStepsAsserts linksStepsAssertions;

    @BeforeAll
    static void init() {
        linksStepsAssertions = new TheInternetHomePageLinksStepsAsserts(homePageSteps.linksSteps());
    }

    @DisplayName("Ссылка на страницу Add/Remove Elements")
    @Description("Ссылка присутствует")
    @Test
    void testAddRemoveElementsPageLink() {
        linksStepsAssertions.addRemoveElementsPageLinkStepsIsVisible();
    }

    @DisplayName("Ссылка на страницу Horizontal Slider")
    @Description("Ссылка присутствует")
    @Test
    void testHorizontalSliderPageLink() {
        linksStepsAssertions.horizontalSliderPageLinkStepsIsVisible();
    }

    @DisplayName("Ссылка на страницу Status Codes")
    @Description("Ссылка присутствует")
    @Test
    void testStatusCodesPageLink() {
        linksStepsAssertions.statusCodesPageLinkStepsIsVisible();
    }
}
