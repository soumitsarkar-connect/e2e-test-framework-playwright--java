package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.PlaywrightFactory;

public class Hooks {
    @Before
    public void setUp() {
        PlaywrightFactory.initBrowser("chrome");
    }

    @After
    public void tearDown() {
        PlaywrightFactory.closeBrowser();
    }
}
