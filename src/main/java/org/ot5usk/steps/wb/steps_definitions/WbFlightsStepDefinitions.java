package org.ot5usk.steps.wb.steps_definitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opentest4j.AssertionFailedError;
import org.ot5usk.steps.wb.pages_steps.flights.WbFlightsPageSteps;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbSearchFlightsAsserts.checkCurrentUrl;

public class WbFlightsStepDefinitions {

    public static final WbFlightsPageSteps flightsPageSteps = new WbFlightsPageSteps();
    private int throwsCounter = 0;

    @Then("происходит переход на страницу {string}")
    public void checkOpenedPage(String expectedUrl) {
        checkCurrentUrl(expectedUrl);
    }

    @When("пользователь заполняет поле “Откуда” значением: {string}")
    public void fillFrom(String from) {
        flightsPageSteps.fillFrom(from);
    }

    @And("заполняет поле “Куда” значением: {string}")
    public void fillTo(String to) {
        flightsPageSteps.fillTo(to);
    }

    @And("заполняет поле “Дата” значением: Сегодняшний день + {string} дней")
    public void fillDepartureDate(String inHowManyDays) {
        flightsPageSteps.fillDepartureDate(Integer.parseInt(inHowManyDays));
    }
    @And("поле “Обратно” оставляет пустым")
    public void ignored() {

    }

    @And("выбирает два взрослых пассажира")
    public void addSecondAdultPassenger() {
        flightsPageSteps.addSecondAdultPassenger();
    }

    @And("нажимает кнопку “Найти билеты”")
    public void clickSearchBtn() {
        flightsPageSteps.clickSearchBtn();
    }

    @Then("если билеты найдены, то есть хотя бы один билет в списке")
    public void checkTicketList() {
        try {
            Configuration.timeout = 10000;
            $("div[class*='ticket-module__ticket']").shouldBe(visible);
        } catch (AssertionFailedError ignored) {
            throwsCounter++;
        }
        assertTrue(throwsCounter != 2);
    }

    @And("если билеты не найдены, то отображается сообщение о том, что билеты не найдены")
    public void checkNegativeMsg() {
        try {
            if (throwsCounter == 1) {
                Configuration.timeout +=10000;
            }
            $x("//h1[text()='Мы не нашли билеты по вашему запросу']").shouldBe(visible);
        } catch (AssertionFailedError ignored) {
            throwsCounter++;
        }
        assertTrue(throwsCounter != 2);
    }


}
