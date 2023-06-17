package starter.pages.interacciones;

import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import starter.pages.mapeos.CartPage;

public class CartPageInt extends PageObject {

    @Page
    private CartPage cartPage;

    public String getTitleCartPage() {

        return cartPage.txtTitleCartPage.waitUntilVisible().getText();
    }
}
