package org.ot5usk.pages.wb.elements.flights;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WbDepartureDatesTable {

    private final SelenideElement departureDatesTable = $x("//div[@class='ant-picker-body']//table[@class='ant-picker-content']");
    private static final String departureDateTitle = "td[title]";

    public SelenideElement getDepartureDatesTable() {
        return departureDatesTable;
    }

    public ElementsCollection getDepartureDateTitles() {
        return getDepartureDatesTable().$$(departureDateTitle);
    }
}
