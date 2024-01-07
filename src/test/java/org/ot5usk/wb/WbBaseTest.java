package org.ot5usk.wb;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;

import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.ot5usk.BaseTest;
import org.ot5usk.steps.wb.pages_steps.home.WbHomePageSteps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WbBaseTest extends BaseTest {

    public static WbHomePageSteps wbHomePageSteps;

    @BeforeAll
    static void init() {
        Selenide.open();
        wbHomePageSteps = new WbHomePageSteps();
        Configuration.timeout = 10000;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    void environment() {
        initInfoAboutBrowserIfNeed();
        browserName();
        browserVersion();
        dateTime();
    }

    @AfterEach
    void clearBrowserLocalStorage() {
        Selenide.clearBrowserLocalStorage();
    }


    @Attachment("BrowserName")
    private byte[] browserName() {
        return infoAboutBrowser.get("BrowserName").getBytes();
    }

    @Attachment("BrowserVersion")
    private byte[] browserVersion() {
        return infoAboutBrowser.get("Version").getBytes();
    }

    @Attachment("Date-time")
    private byte[] dateTime() {
        return LocalDateTime.now().toString().getBytes();
    }

    private static void initInfoAboutBrowserIfNeed() {
        if (System.out != originalOutput) {
            System.setOut(originalOutput);
        }

        if (infoAboutBrowser.size() == 0) {
            List<String> logLinesList = Arrays.stream(outputFromConsole.toString().split("\n")).toList();
            String aboutBrowser = null;
            for (String s : logLinesList) {
                if (s.contains("BrowserName")) {
                    aboutBrowser = s;
                    break;
                }
            }

            assert aboutBrowser != null;
            List<String> aboutBrowserLineSplitList = List.of(aboutBrowser.split(" "));
            List<String> aboutBrowserList = new ArrayList<>();
            for (String s : aboutBrowserLineSplitList) {
                if (s.contains("=")) {
                    aboutBrowserList.add(s);
                }
            }

            for (int i = 0; i < aboutBrowserList.size() - 1; i++) {
                List<String> list = List.of(aboutBrowserList.get(i).split("="));
                infoAboutBrowser.put(list.get(0), list.get(1));
            }
        }
    }
}