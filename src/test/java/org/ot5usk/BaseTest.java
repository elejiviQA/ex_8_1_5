package org.ot5usk;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

public class BaseTest {

    public static ByteArrayOutputStream outputFromConsole = new ByteArrayOutputStream();
    public final static PrintStream originalOutput = System.out;
    public static HashMap<String, String> infoAboutBrowser = new HashMap<>();

    @BeforeAll
    static void config() {
        configBrowser();
        redirectConsoleOutput();
    }

    private static void configBrowser() {
        Configuration.browserSize = "1920x1080";
    }

    private static void redirectConsoleOutput() {
        PrintStream ps = new PrintStream(outputFromConsole);
        System.setOut(ps);
    }
}
