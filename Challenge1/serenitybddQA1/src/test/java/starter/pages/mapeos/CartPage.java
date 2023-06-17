package starter.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("https://www.saucedemo.com/v1/cart")
public class CartPage extends PageObject {

    @FindBy(xpath = "//div[text()='Your Cart']")
    public WebElementFacade txtTitleCartPage;

    @FindBy(xpath = "//a[text()='CHECKOUT']")
    public WebElementFacade btnCheckout;



}
