package org.ot5usk.utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Util {

    private final static PrintStream originalOutput = System.out;
    private AllureSelenide allureSelenide;
    private final ByteArrayOutputStream logs = new ByteArrayOutputStream();
    private final HashMap<String, String> infoAboutBrowser = new HashMap<>();

    public Util init() {
        if (logs.toString().isEmpty()) {
            redirectConsoleOutput();
        }
        if (allureSelenide == null) {
            allureSelenide = new AllureSelenide();
            SelenideLogger.addListener("allure", new AllureSelenide());
            Configuration.timeout = 10000;
            Configuration.browserSize = "1920x1080";
            Selenide.open();
            initInfoAboutBrowserIfNeed();
        }
        return this;
    }

    private void redirectConsoleOutput() {
        System.setOut(new PrintStream(logs));
    }

    public void clearBrowserLocalStorage() {
        Selenide.clearBrowserLocalStorage();
    }

    public void attachmentEnvironment() {
        browserName();
        browserVersion();
        dateTime();
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

    private void initInfoAboutBrowserIfNeed() {
        if (System.out != originalOutput) {
            System.setOut(originalOutput);
        }
        if (infoAboutBrowser.size() == 0) {
            List<String> logLinesList = Arrays.stream(logs.toString().split("\n")).toList();
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
