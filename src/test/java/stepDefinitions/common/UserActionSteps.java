package stepDefinitions.common;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import components.Button;
import components.InputBox;
import io.cucumber.java.en.When;
import utils.PlaywrightFactory;

public class UserActionSteps {

    private final Page page = PlaywrightFactory.getPage();

    @When("I enter {string} text in input box with {string} placeholder")
    public void iEnterTextInInputBoxWithPlaceholder(String inputText, String inputTextBoxPlaceholder) {
        InputBox inputBoxComponent = new InputBox(page);
        Locator inputBox = inputBoxComponent.getInputBoxByPlaceholder(inputTextBoxPlaceholder);

        inputBox.clear();
        inputBox.fill(inputText);
    }

    @When("I click on {string} button")
    public void iClickOnButton(String buttonLabel) {
        Button buttonComponent = new Button(page);
        Locator button = buttonComponent.getByLabel(buttonLabel, false);
        button.click();
    }

    @When("I click on button contains {string} text")
    public void iClickOnButtonContainText(String buttonLabel) {
        Button buttonComponent = new Button(page);
        Locator button = buttonComponent.getByLabel(buttonLabel, false);
        button.click();
    }
}
