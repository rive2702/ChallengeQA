package starter.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://saucedemo.com/v1")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@name='user-name']")
    public WebElementFacade inputUsername;

    @FindBy(id = "password")
    public WebElementFacade inputPassword;

    @FindBy(id = "login-button")
    public WebElementFacade btnLogin;


}
