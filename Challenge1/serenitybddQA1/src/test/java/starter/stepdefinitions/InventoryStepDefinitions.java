package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.InventorySteps;

public class InventoryStepDefinitions {

    @Steps
    private InventorySteps inventorySteps;

    @Given("Pablo is on the inventory page")
    public void SauceDemoInventoryPage() {
        inventorySteps.openInventoryPage();
    }

    @When("he pick two products and push cart button")
    public void CartButton() {
        inventorySteps.pressCartButton();
    }

    @Then("he is redirected to cartCheckout page")
    public void RedirectToCheckoutPage() {
        inventorySteps.validateCartPage();

    }

}
