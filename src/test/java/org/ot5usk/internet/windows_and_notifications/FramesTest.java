package org.ot5usk.internet.windows_and_notifications;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.BaseTest;
import org.ot5usk.steps.internet.pages_steps.frames.FramesPageSteps;

public class FramesTest extends BaseTest {

    private static FramesPageSteps framesPageSteps;

    @BeforeAll
    static void init() {
        framesPageSteps = new FramesPageSteps();
    }

    @DisplayName("Взаимодействие с элементами внутри фрейма")
    @Description("Использование текстового редактора")
    @Test
    void testFrames() {
        framesPageSteps
                .openFramesPage()
                .goToIFramePage()
                .enterTextIntoTextEditor("Hello World")
                .makeTextBoldInTextEditor();
    }
}
