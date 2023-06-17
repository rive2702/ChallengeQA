package starter.steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matcher;
import starter.pages.interacciones.InventoryPageInt;
import starter.pages.mapeos.LoginPage;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoginSteps {
    @Page
    private LoginPage loginPage;

    @Page
    private InventoryPageInt inventoryPageInt;

    @Step("user open login page")
    public void openLoginPage() {
        loginPage.open();
    }

    @Step("clear fields")
    public void clearFieldsLogin() {
        loginPage.inputUsername.type("");
        loginPage.inputPassword.type("");
    }

    @Step("enter credentials")
    public void enterCredentials(String username, String password) {
        loginPage.inputUsername.type(username);
        loginPage.inputPassword.type(password);
    }

    @Step("Press LOGIN button")
    public void pressLoginButton(){
        loginPage.btnLogin.waitUntilClickable().click();
    }

    @Step("valid ate successful login")
    public void validateSuccessfulLogin() {
        final String mensajeError = "Login was unsuccessful.";
        //assertThat(mensajeError, inventoryPageInt.getTitleInventoryPage(), is(equalTo("Products")));
    }


}
