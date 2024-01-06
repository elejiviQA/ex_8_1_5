package org.ot5usk.steps.internet.pages_steps.frames;

import io.qameta.allure.Step;
import org.ot5usk.pages.internet.frames.FramesPage;

public class FramesPageSteps {

    private final FramesPage framesPage = new FramesPage();

    @Step("Открытие страницы Frames")
    public FramesPageSteps openFramesPage() {
        framesPage.openPage();
        return this;
    }

    @Step("Переход на страницу iFrame")
    public IFramePageSteps goToIFramePage() {
        return new IFramePageSteps(framesPage.goToIFramePage());
    }
}
