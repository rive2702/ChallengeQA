package starter.pages.interacciones;

import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import starter.pages.mapeos.InventoryPage;
import starter.pages.mapeos.SuccessPage;

public class SuccessPageInt extends PageObject {

    @Page
    private SuccessPage successPage;

    public String getTitleCheckoutPage() {
        return successPage.txtTitleSuccessPage.waitUntilVisible().getText();
    }
}
