package org.ot5usk;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void configBrowserSize() {
        Configuration.browserSize = "1920x1080";
    }
}
