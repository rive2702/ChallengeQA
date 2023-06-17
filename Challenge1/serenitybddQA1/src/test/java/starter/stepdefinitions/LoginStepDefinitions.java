package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.LoginSteps;

public class LoginStepDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Given("Pablo is on the SauceDemo home page")
    public void SauceDemoLoginPage() {
        loginSteps.openLoginPage();
        loginSteps.clearFieldsLogin();

    }

    @When("he put credentials")
    public void PutCredentials() {
        loginSteps.enterCredentials("standard_user", "secret_sauce");
        loginSteps.pressLoginButton();
    }

    @Then("he is redirected to homepage")
    public void RedirectToHomepage() {
        loginSteps.validateSuccessfulLogin();
    }
}
