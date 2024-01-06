package org.ot5usk.wb;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.ot5usk.BaseTest;
import org.ot5usk.steps.wb.pages_steps.home.WbHomePageSteps;

public class WbBaseTest extends BaseTest {

    public static WbHomePageSteps wbHomePageSteps;

    @BeforeAll
    static void openHomePage() {
        wbHomePageSteps = new WbHomePageSteps().openHomePage();
        Configuration.timeout = 10000;
    }
}