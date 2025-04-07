package stepDefinitions.common;

import io.cucumber.java.en.When;

public class WaitSteps {

    @When("I wait for {int} second(s)")
    public void iWaitForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000L); // Convert seconds to milliseconds
    }
}
