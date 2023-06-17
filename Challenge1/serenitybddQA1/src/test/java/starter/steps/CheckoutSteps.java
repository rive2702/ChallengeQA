package starter.steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import starter.pages.interacciones.CartPageInt;
import starter.pages.interacciones.SuccessPageInt;
import starter.pages.mapeos.CartPage;
import starter.pages.mapeos.SuccessPage;

public class CheckoutSteps {

    @Page
    private CartPage cartPage;

    @Page
    private CartPageInt cartPageInt;

    @Page
    private SuccessPage successPage;

    @Page
    private SuccessPageInt successPageInt;


    @Step("user open cart page")
    public void openCartPage() {

        cartPage.open();
    }
    @Step("Press Checkout button")
    public void pressCheckoutButton(){

        cartPage.btnCheckout.waitUntilClickable().click();
    }

    @Step("valid ate successful login")
    public void validateSuccess() {
        final String mensajeError = "Shop was unsuccessful.";
        //assertThat(mensajeError, successPageInt.getTitleSuccessPage(), is(equalTo("Finish")));
    }
}
