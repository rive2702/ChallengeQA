package starter.steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import starter.pages.interacciones.CartPageInt;
import starter.pages.interacciones.InventoryPageInt;
import starter.pages.mapeos.CartPage;
import starter.pages.mapeos.InventoryPage;

public class InventorySteps {
    @Page
    private InventoryPage inventoryPage;
    @Page
    private InventoryPageInt inventoryPageInt;
    @Page
    private CartPage cartPage;
    @Page
    private CartPageInt cartPageInt;

    @Step("user open inventory page")
    public void openInventoryPage() {

        inventoryPage.open();
    }
    @Step("Press product button")
    public void pressProductButton(){
        inventoryPage.btnProduct.waitUntilClickable().click();
    }

    @Step("Press cart button")
    public void pressCartButton(){
        inventoryPage.btnCart.waitUntilClickable().click();
    }

    @Step("validate cart page")
    public void validateCartPage() {
        final String mensajeError = "Checkout was unsuccessful.";
        //assertThat(mensajeError, cartPageInt.getTitleCartPage(), is(equalTo("Your Cart")));
    }
}
