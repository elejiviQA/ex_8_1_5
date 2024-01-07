package org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.menu;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.change_city.menu.WbChangeCityMenu;
import org.ot5usk.pages.wb.elements.base.change_city.menu.elements.wrap.WbChangeCityInfoBlock;

public class WbChangeCityMenuSteps {

    private final WbChangeCityMenu menu;
    private final WbChangeCityInfoBlock infoBlock;

    public WbChangeCityMenuSteps() {
        this.menu = new WbChangeCityMenu();
        this.infoBlock = new WbChangeCityInfoBlock();
    }

    @Step("Выполнение поискового запроса - поиск города")
    public WbChangeCityMenuSteps executeQuery(String query) {
        menu.searchBar().executeQuery(query);
        return this;
    }

    public SelenideElement getFirstAddress() {
        return menu.addressesBlock().getFirstAddress();
    }

    @Step("Выбор первого адреса из результирующего списка")
    public void selectFirstAddress() {
        menu.addressesBlock().selectFirstAddress();
    }

    public SelenideElement getInfoBlockAddress() {
        return infoBlock.getInfoBlockAddress();
    }

    public SelenideElement getInfoBlock() {
        return infoBlock.getInfoBlock();
    }

    @Step("Нажатие кнопки Выбрать")
    public void clickSelectBtn() {
        infoBlock.clickSelectBtn();
    }
}
