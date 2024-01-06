package org.ot5usk.wb;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.ot5usk.steps.wb.pages_steps.flights.WbFlightsPageSteps;

import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbSearchFlightsAsserts.checkOpenedPage;
import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbSearchFlightsAsserts.checkTicketsResult;

public class SearchFlightsTest extends WbBaseTest {

    @DisplayName("Поиск авиабилетов")
    @Description("Проверка результатов: поиска авиабилетов")
    @ParameterizedTest(name = "Откуда: {0}, куда: {1}, через сколько дней: {2}")
    @CsvSource("Домодедово, Пулково, 2")
    void testSearchFlights(String from, String to, int inHowManyDays) {

        WbFlightsPageSteps flightsPageSteps = wbHomePageSteps.clickNavBarBtn().goToTravels().clickFlights();

        checkOpenedPage();

        flightsPageSteps
                .fillFrom(from)
                .fillTo(to)
                .fillDepartureDate(inHowManyDays)
                .addSecondAdultPassenger()
                .clickSearchBtn();

        checkTicketsResult();
    }
}
