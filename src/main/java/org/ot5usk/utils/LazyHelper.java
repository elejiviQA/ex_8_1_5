package org.ot5usk.utils;

import com.codeborne.selenide.SelenideElement;

import java.util.Map;

import static com.codeborne.selenide.Selenide.$x;

public class LazyHelper {

    //iterate hashMap, lazy
    public static SelenideElement getElement(Map<String, String> map, String name) {
        SelenideElement element = null;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (name.toLowerCase().contains(key.toLowerCase())) {
                element = $x(value);
            }
        }
        return element;
    }
}
