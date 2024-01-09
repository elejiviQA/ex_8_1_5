package org.ot5usk.pages.wb.elements;

import com.codeborne.selenide.SelenideElement;

@FunctionalInterface
public interface Element {

    SelenideElement get(String name);
}
