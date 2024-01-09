package org.ot5usk.pages.wb;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.elements.flights.WbDepartureDatesTable;
import org.ot5usk.pages.wb.elements.flights.WbPassengersTable;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class WbFlightsPage {

    private final static String URL = "https://vmeste.wildberries.ru/avia";
    private final SelenideElement from = $x("//span/input[@id='rc_select_0']");
    private final SelenideElement to = $x("//span/input[@id='rc_select_1']");
    private final SelenideElement departureDate = $x("//div[text()='Туда']");
    private final SelenideElement passengers = $x("//div[contains(text(), 'пассажир')]");
    private final SelenideElement searchTicketsBtn = $x("//button[text()='Найти билеты']");
    private final SelenideElement searchResult = $x("//div[@data-module='vmeste-avia-v2']");

    public void fillFrom(String from) {
        this.from.sendKeys(from);
        $x("//div[contains(@label, '" + from + "')]").click();
    }

    public void fillTo(String to) {
        this.to.sendKeys(to);
        $x("//div[contains(@label, '" + to + "')]").click();
    }

    public WbDepartureDatesTable clickDepartureDate() {
        departureDate.shouldBe(visible).click();
        return new WbDepartureDatesTable();
    }

    public WbPassengersTable clickPassengers() {
        passengers.shouldBe(visible).click();
        return new WbPassengersTable();
    }

    public void clickSearchBtn() {
        searchTicketsBtn.shouldBe(visible).click();
        searchResult.shouldBe(appear);
    }
}
