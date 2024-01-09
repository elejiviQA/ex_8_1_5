package org.ot5usk.steps.wb.steps_definitions;

import io.cucumber.java.en.Given;
import org.ot5usk.steps.wb.pages_steps.catalog.WbCatalogPageSteps;
import org.ot5usk.steps.wb.pages_steps.home.WbHomePageSteps;
import org.ot5usk.utils.Util;

public class WbGivenStepDefinitions {

    public static final WbHomePageSteps homeSteps = new WbHomePageSteps();
    public static final WbCatalogPageSteps catalogSteps = new WbCatalogPageSteps();
    private static Util util;

    @Given("пользователь находится на главной странице")
    public void openHomePage() {
        if (util == null) {
            util = new Util().init();
        }
        util.attachmentEnvironment();
        homeSteps.openHomePage();
        util.clearBrowserLocalStorage();
    }
}
