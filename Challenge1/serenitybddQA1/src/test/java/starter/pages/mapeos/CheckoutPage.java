package starter.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("https://www.saucedemo.com/v1/checkout-step-two")
public class CheckoutPage extends PageObject {

    @FindBy(xpath = "//div[text()='Checkout: Overview']")
    public WebElementFacade txtTitleCheckoutPage;

    @FindBy(xpath = "//input[@id='first-name']")
    public WebElementFacade inputFirstName;

    @FindBy(xpath = "//input[@id='last-name']")
    public WebElementFacade inputLastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    public WebElementFacade inputZipCode;

    @FindBy(xpath = "//input[@class='btn_primary cart_button']")
    public WebElementFacade btnContinue;
}
