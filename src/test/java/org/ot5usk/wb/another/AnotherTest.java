package org.ot5usk.wb.another;

import io.qameta.allure.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.wb.WbBaseTest;

import static com.codeborne.selenide.Condition.visible;

public class AnotherTest extends WbBaseTest {

    @Feature("Failed test")
    @Story("Execute failed test")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Vladimir Voblikov")
    @DisplayName("Failed test")
    @Description("Execute failed test")
    @Test
    void testFailed() {
        wbHomePageSteps.openHomePage().changeCity().openMenu().getInfoBlockAddress().shouldBe(visible);
    }

    @Disabled
    @Feature("Nothing")
    @Story("Missed nothing")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Vladimir Voblikov")
    @DisplayName("Nothing")
    @Description("Nothing")
    @Test
    void testDisabled() {

    }
}