package starter.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("https://www.saucedemo.com/v1/inventory")
public class InventoryPage extends PageObject {

    @FindBy(xpath = "//div[text()='Products']")
    public WebElementFacade txtTitleInventoryPage;

    @FindBy(xpath = "//button[text()='ADD TO CART']")
    public static WebElementFacade btnProduct;
    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    public static WebElementFacade btnCart;
}
