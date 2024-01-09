package org.ot5usk.steps.wb.steps_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.menu.WbChangeCityMenuSteps;

import static org.ot5usk.steps.wb.assertions.pages_steps_assertions.WbChangeCityAsserts.*;
import static org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.WbChangeCityStepsTempStorage.rememberFirstAddress;
import static org.ot5usk.steps.wb.pages_steps.elements_steps.base.change_city.WbChangeCityStepsTempStorage.rememberInfoBlockAddress;
import static org.ot5usk.steps.wb.steps_definitions.WbGivenStepDefinitions.homeSteps;

public class WbChangeCityStepDefinitions {

    public static final WbChangeCityMenuSteps changeCityMenuSteps = new WbChangeCityMenuSteps();

    @When("пользователь нажимает на кнопку “Смена города”")
    public void clickChangeCityBtn() {
        homeSteps.changeCity().openMenu();
    }

    @And("вводит в поисковую строку название города {string}")
    public void sendQuery(String nameCity) {
        changeCityMenuSteps.sendQuery(nameCity);
    }

    @And("нажимает кнопку “Найти” в поисковой строке")
    public void executeQuery() {
        changeCityMenuSteps.executeQuery();
    }

    @And("выбирает первый адрес из списка адресов")
    public void selectFirstAddress() {
        rememberFirstAddress();
        changeCityMenuSteps.selectFirstAddress();
    }

    @Then("открывается информация о центре выдачи")
    public void checkAppearingInfoBlock() {
        checkInfoBlock();
    }

    @And("адрес пункта выдачи совпадает с тем адресом, что был предложен в списке адресов")
    public void expectedInfoBlockAddress() {
        rememberInfoBlockAddress();
        checkInfoBlockAddress();
    }

    @When("пользователь нажимает на кнопку “Выбрать”")
    public void clickSelectBtn() {
        changeCityMenuSteps.clickSelectBtn();
    }

    @Then("происходит переход на главную страницу")
    public void checkOpenedPage() {
        checkCurrentUrl();
    }

    @And("отображается адрес пункта выдачи из предыдущего шага")
    public void checkActualAddress() {
        checkCurrentAddress();
    }
}
