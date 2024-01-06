package org.ot5usk.internet.types_of_expectations;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.steps.internet.assertions.pages_steps_assertions.StatusCodesPageStepsAsserts;
import org.ot5usk.steps.internet.pages_steps.status_codes.StatusCodesPageSteps;

public class StatusCodesPageTest extends InternetPagesBaseTest {

    private static StatusCodesPageStepsAsserts pageStepsAssertions;

    @BeforeAll
    static void init() {
        StatusCodesPageSteps pageSteps = homePageSteps.goToStatusCodesPageSteps();
        pageStepsAssertions = new StatusCodesPageStepsAsserts(pageSteps);
    }

    @DisplayName("Текст ссылки на страницу статус-код 200")
    @Description("Текст ссылки: '200'")
    @Test
    void testLinkTextToCode200Page() {
        pageStepsAssertions.checkLinkTextToCode200Page();
    }

    @DisplayName("Атрибут href ссылки на страницу статус-код 200")
    @Description("href ссылки: 'https://the-internet.herokuapp.com/status_codes/200'")
    @Test
    void testLinkHrefToCode200Page() {
        pageStepsAssertions.checkLinkHrefToCode200Page();
    }
}