package org.ot5usk.steps.wb.pages_steps.flights;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.WbFlightsPage;

import java.time.LocalDate;

import static com.codeborne.selenide.Condition.visible;

public class WbFlightsPageSteps {

    private final WbFlightsPage flightsPage;

    public WbFlightsPageSteps() {
        this.flightsPage = new WbFlightsPage();
    }

    @Step("Заполнение Точки: Откуда")
    public void fillFrom(String from) {
        flightsPage.fillFrom(from);
    }

    @Step("Заполнение Точки: Куда")
    public void fillTo(String to) {
        flightsPage.fillTo(to);
    }

    @Step("Заполнение Даты: Туда")
    public void fillDepartureDate(int inHowManyDays) {
        String desiredDate = String.valueOf(LocalDate.now().plusDays(inHowManyDays).getDayOfMonth());
        ElementsCollection departureDateTitles = flightsPage.clickDepartureDate().getDepartureDateTitles();
        for (SelenideElement departureDateTitle : departureDateTitles) {
            if (departureDateTitle.shouldBe(visible).getText().equals(desiredDate)) {
                departureDateTitle.shouldBe(visible).click();
                break;
            }
        }
    }

    @Step("Добавление второго взрослого пассажира")
    public void addSecondAdultPassenger() {
        flightsPage.clickPassengers().clickAddAnAdultPassengerBtn();
    }

    @Step("Нажатие кнопки поиска")
    public void clickSearchBtn() {
        flightsPage.clickSearchBtn();
    }
}
