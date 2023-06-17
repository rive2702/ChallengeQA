package starter.pages.interacciones;

import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import starter.pages.mapeos.InventoryPage;

public class InventoryPageInt extends PageObject {

    @Page
    private InventoryPage inventoryPage;

    public String getTitleInventoryPage() {
        return inventoryPage.txtTitleInventoryPage.waitUntilVisible().getText();
    }
}
