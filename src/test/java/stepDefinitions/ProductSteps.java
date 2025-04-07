package stepDefinitions;

import io.cucumber.java.en.When;
import pages.ProductPage;
import utils.PlaywrightFactory;

public class ProductSteps {

    @When("I select {string} from the products sort dropdown")
    public void iSelectOptionFromProductsSortDropdown(String optionText) {
        ProductPage productPage = new ProductPage(PlaywrightFactory.getPage());
        productPage.selectOptionInSortDropdown(optionText);
    }
}
