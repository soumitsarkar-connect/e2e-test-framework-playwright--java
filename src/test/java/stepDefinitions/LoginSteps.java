package stepDefinitions;

import com.microsoft.playwright.Page;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.PlaywrightFactory;

public class LoginSteps {
    private final Page page = PlaywrightFactory.getPage();
    private final LoginPage loginPage = new LoginPage(page);

    @Given("I navigate to login page")
    public void user_navigates_to_login_page() {
        loginPage.navigateToLogin();
    }

    @When("I login to the app")
    public void iLoginToTheApp() {
        loginPage.login();
    }
}


