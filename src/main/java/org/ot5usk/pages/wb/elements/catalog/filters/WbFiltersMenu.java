package org.ot5usk.pages.wb.elements.catalog.filters;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.elements.Element;
import org.ot5usk.pages.wb.elements.catalog.filters.filters_data.WbFiltersMenuData;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;

public class WbFiltersMenu {

    private final Element filter = WbFiltersMenuData::getFilter;
    private final SelenideElement priceFrom = filter.get("Цена от");
    private final SelenideElement priceTo = filter.get("Цена до");
    private final SelenideElement filtersMenuWindow = $x("//div[@class='filters-desktop__content']");
    private final SelenideElement resetBtn = $x("//button[contains(text(), 'Сбросить все')]");
    private final SelenideElement showBtn = $x("//button[@class='filters-desktop__btn-main btn-main']");
    private final SelenideElement productsCounter = $x("//p[@class='filters-desktop__count-goods']");

    public SelenideElement getFiltersMenuWindow() {
        return filtersMenuWindow;
    }

    public void selectFilter(String name) {
        filter.get(name).shouldBe(appear).click();
    }

    public void fillPriceFrom(String from) {
        priceFrom.shouldBe(appear).clear();
        priceFrom.sendKeys(from);

    }

    public void fillPriceTo(String to) {
        priceTo.shouldBe(appear).clear();
        priceTo.sendKeys(to);
    }

    public void clickShowBtn() {
        showBtn.shouldBe(appear).click();
    }

    public SelenideElement getProductsCounter() {
        return productsCounter;
    }

    public SelenideElement getResetBtn() {
        return resetBtn;
    }
}
