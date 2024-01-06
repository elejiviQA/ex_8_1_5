package org.ot5usk.internet.types_of_expectations;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.ot5usk.BaseTest;
import org.ot5usk.steps.internet.pages_steps.home.TheInternetHomePageSteps;

import static com.codeborne.selenide.Selenide.sleep;

public class InternetPagesBaseTest extends BaseTest {

    public static TheInternetHomePageSteps homePageSteps;
    private static long timeoutValue = 2500;

    @BeforeAll
    static void openHomePage() {
        homePageSteps = new TheInternetHomePageSteps();
        homePageSteps.openHomePage();
        Configuration.timeout = timeoutValue;
    }

    @BeforeEach
    void pause() {
        sleep(timeoutValue += 250);
    }
}
