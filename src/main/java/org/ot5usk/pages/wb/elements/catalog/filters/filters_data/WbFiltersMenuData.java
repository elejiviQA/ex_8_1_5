package org.ot5usk.pages.wb.elements.catalog.filters.filters_data;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.utils.LazyHelper;

import java.util.HashMap;
import java.util.Map;

public class WbFiltersMenuData {

    private static final Map<String, String> menuFilters = new HashMap<>();

    static {
        init();
    }

    public static SelenideElement getFilter(String name) {
        return LazyHelper.getElement(menuFilters, name);
    }

    private static void init() {
        menuFilters.put("цена от", "//input[@name='startN']");
        menuFilters.put("цена до", "//input[@name='endN']");
        menuFilters.put("срок до 3 дней", "//span[contains(text(), 'до 3 дней')]");
        menuFilters.put("бренд Apple", "//span[contains(text(), 'Apple')]");
        menuFilters.put("диагональ экрана 13.6\"", "//span[contains(text(), '13.6')]");
    }
}
