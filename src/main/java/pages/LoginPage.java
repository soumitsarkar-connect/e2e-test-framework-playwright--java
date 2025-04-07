package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import components.Button;
import components.InputBox;

public class LoginPage {
    private final Page page;

    private final Locator usernameInput;
    private final Locator passwordInput;
    private final Locator loginButton;

    private final String username;
    private final String password;

    public LoginPage(Page page) {
        this.page = page;
        InputBox inputBoxPage = new InputBox(page);
        Button buttonPage = new Button(page);

        this.usernameInput = inputBoxPage.getInputBoxByPlaceholder("Username");
        this.passwordInput = inputBoxPage.getInputBoxByPlaceholder("Password");
        this.loginButton = buttonPage.getByLabel("Login", false);

        this.username = "standard_user";
        this.password = "secret_sauce";
    }

    public void navigateToLogin() {
        page.navigate("https://www.saucedemo.com/");
    }

    public void login() {
        usernameInput.fill(username);
        passwordInput.fill(password);
        loginButton.click();
    }
}
