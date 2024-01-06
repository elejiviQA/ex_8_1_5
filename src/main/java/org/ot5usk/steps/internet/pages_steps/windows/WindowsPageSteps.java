package org.ot5usk.steps.internet.pages_steps.windows;

import io.qameta.allure.Step;
import org.ot5usk.pages.internet.windows.WindowsPage;

public class WindowsPageSteps {

    private final WindowsPage windowsPage = new WindowsPage();

    @Step("Открытие страницы Windows")
    public void openPage() {
        windowsPage.openPage();
    }

    @Step("Получение url страницы")
    public String url() {
        return windowsPage.url();
    }

    @Step("Нажатие ссылки на новую страницу")
    public NewWindowPageSteps clickNewWindowPageLink() {
        return new NewWindowPageSteps(windowsPage.clickNewWindowPageLink());
    }
}
