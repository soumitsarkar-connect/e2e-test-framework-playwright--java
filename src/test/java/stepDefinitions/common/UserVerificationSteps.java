package stepDefinitions.common;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import components.Link;
import components.NavMenu;
import components.Text;
import components.Button;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import utils.PlaywrightFactory;

public class UserVerificationSteps {

    private final Page page = PlaywrightFactory.getPage();

    @Then("I should see the {string} as the page header title")
    public void iShouldSeeTheTextAsPageHeaderTitle(String expectedText) {
        Text textComponent = new Text(page);
        Locator headerText = textComponent.getElementByText(expectedText, false); // Change to true for exact match
        Assertions.assertTrue(headerText.isVisible(), "The expected header text is not visible.");
    }

    @Then("I should see {string} text")
    public void iShouldSeeTheText(String expectedText) {
        Text textComponent = new Text(page);
        Locator text = textComponent.getElementByText(expectedText, false); // Change to true for exact match
        Assertions.assertTrue(text.isVisible(), "The expected header text is not visible.");
    }

    @Then("I should see {string} button")
    public void iShouldSeeButton(String expectedLabel) {
        Button buttonComponent = new Button(page);
        Locator button = buttonComponent.getByLabel(expectedLabel, false);
        Assertions.assertTrue(button.isVisible(), "Expected button with label '" + expectedLabel + "' to be visible.");
    }

    @Then("I should see {string} icon")
    public void iShouldSeeIcon(String expectedLinkText) {
        Link linkTextComponent = new Link(page);
        Locator link = linkTextComponent.getByLink(expectedLinkText, false);
        Assertions.assertTrue(link.isVisible(), "Expected button with label '" + expectedLinkText + "' to be visible.");
    }

    @Then("I should see button contains {string} text")
    public void iShouldSeeButtonComponent(String expectedLabel) {
        Button buttonComponent = new Button(page);
        Locator button = buttonComponent.getByLabel(expectedLabel, false);
        Assertions.assertTrue(button.isVisible(), "Expected button with label '" + expectedLabel + "' to be visible.");
    }

    @Then("I should see {string} nav menu text")
    public void iShouldSeeNavMenuText(String expectedNavMenu) {
        NavMenu navMenuComponent = new NavMenu(page);
        Locator NavMenu = navMenuComponent.getByNavMenu(expectedNavMenu, false);
        Assertions.assertTrue(NavMenu.isVisible(), "Expected button with label '" + expectedNavMenu + "' to be visible.");
    }
}
