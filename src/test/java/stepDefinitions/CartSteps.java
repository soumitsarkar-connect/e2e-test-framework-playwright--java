package stepDefinitions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import utils.PlaywrightFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CartSteps {
    private final Page page = PlaywrightFactory.getPage();
    private final CartPage cartPage = new CartPage(page);

    @When("I add {string} product to the cart")
    public void i_add_product_to_cart(String productName) {
        Locator addToCartButton = cartPage.getAddToCartLocator(productName);
        addToCartButton.click();
    }

    @When("I click on cart icon")
    public void i_click_on_cart_icon() {
        cartPage.getByCartIconLink().click();
    }

    @Then("I should see cart icon {string} number")
    public void i_should_see_cart_icon_number(String number) {
        Locator icon = cartPage.getByCartIconNumber(number, true);
        assertTrue(icon.isVisible(), "Expected cart icon number to be visible: " + number);
    }

    @Then("I should not see cart icon {string} number")
    public void i_should_not_see_cart_icon_number(String number) {
        Locator icon = cartPage.getByCartIconNumber(number, true);
        assertFalse(icon.isVisible(), "Expected cart icon number to be hidden: " + number);
    }
}

