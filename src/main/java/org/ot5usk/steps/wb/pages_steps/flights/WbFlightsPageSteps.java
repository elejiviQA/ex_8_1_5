package org.ot5usk.steps.wb.pages_steps.flights;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.WbFlightsPage;

import java.time.LocalDate;

public class WbFlightsPageSteps {

    private final WbFlightsPage flightsPage;

    public WbFlightsPageSteps() {
        this.flightsPage = new WbFlightsPage();
    }

    @Step("Заполнение Точки: Откуда")
    public WbFlightsPageSteps fillFrom(String from) {
        flightsPage.fillFrom(from);
        return this;
    }

    @Step("Заполнение Точки: Куда")
    public WbFlightsPageSteps fillTo(String to) {
        flightsPage.fillTo(to);
        return this;
    }

    @Step("Заполнение Даты: Туда")
    public WbFlightsPageSteps fillDepartureDate(int inHowManyDays) {
        String desiredDate = String.valueOf(LocalDate.now().plusDays(inHowManyDays).getDayOfMonth());
        ElementsCollection departureDateTitles = flightsPage.clickDepartureDate().getDepartureDateTitles();
        for (SelenideElement departureDateTitle : departureDateTitles) {
            if (departureDateTitle.getText().equals(desiredDate)) {
                departureDateTitle.click();
                break;
            }
        }
        return this;
    }

    @Step("Добавление второго взрослого пассажира")
    public WbFlightsPageSteps addSecondAdultPassenger() {
        flightsPage.clickPassengers().clickAddAnAdultPassengerBtn();
        return this;
    }

    @Step("Нажатие кнопки поиска")
    public void clickSearchBtn() {
        flightsPage.clickSearchBtn();
    }
}
