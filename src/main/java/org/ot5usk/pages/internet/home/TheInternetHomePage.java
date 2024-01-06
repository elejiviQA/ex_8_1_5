package org.ot5usk.pages.internet.home;

import static com.codeborne.selenide.Selenide.open;

public class TheInternetHomePage {

    private static final String URL = "https://the-internet.herokuapp.com/";
    private final TheInternetHomePageLinks links;

    public TheInternetHomePage() {
        links = new TheInternetHomePageLinks();
    }

    public TheInternetHomePageLinks links() {
        return links;
    }

    public void openHomePage() {
        open(URL);
    }
}