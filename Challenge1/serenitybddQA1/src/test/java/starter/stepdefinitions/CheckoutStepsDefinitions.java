package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.CheckoutSteps;
import starter.steps.InventorySteps;

public class CheckoutStepsDefinitions {

    @Steps
    private InventorySteps inventorySteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Given("Pablo is on the cart page")
    public void SauceDemoCheckoutPage() {
    }

    @When("he push checkout button")
    public void CheckoutButton() {

        checkoutSteps.pressCheckoutButton();
    }

    @Then("he is redirected to checkout page")
    public void RedirectToSuccesPage() {
        checkoutSteps.validateSuccess();

    }
}
