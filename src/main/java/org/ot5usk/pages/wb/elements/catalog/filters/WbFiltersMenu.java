package org.ot5usk.pages.wb.elements.catalog.filters;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.UIAssertionError;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;

public class WbFiltersMenu {

    private final SelenideElement priceFrom = $x("//input[@name='startN']");
    private final SelenideElement priceTo = $x("//input[@name='endN']");
    private final SelenideElement upToThreeDays = $x("//span[contains(text(), 'до 3 дней')]");
    private final SelenideElement appleBrand = $x("//span[contains(text(), 'Apple')]");
    private final SelenideElement secondAppleBrand = $x("//span[contains(text(), 'apple')]");
    private final SelenideElement screenDiagonal = $x("//span[contains(text(), '13.6')]");
    private final SelenideElement resetBtn = $x("//button[contains(text(), 'Сбросить все')]");
    private final SelenideElement showBtn = $x("//button[@class='filters-desktop__btn-main btn-main']");
    private final SelenideElement productsCounter = $x("//p[@class='filters-desktop__count-goods']");

    public void fillPrices(String from, String to) {
        priceFrom.shouldBe(appear).clear();
        priceFrom.sendKeys(from);
        priceTo.shouldBe(appear).clear();
        priceTo.sendKeys(to);
    }

    public void clickUpToThreeDays() {
        upToThreeDays.shouldBe(appear).click();
    }

    public void clickAppleBrand() {
        try {
            appleBrand.shouldBe(appear).click();
        } catch (UIAssertionError e) {
            secondAppleBrand.shouldBe(appear).click();
        }
    }

    public void clickScreenDiagonal() {
        screenDiagonal.shouldBe(appear).click();
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
