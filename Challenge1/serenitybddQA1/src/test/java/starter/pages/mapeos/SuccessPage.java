package starter.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SuccessPage extends PageObject {

    @FindBy(xpath = "//a[text()='FINISH']")
    public WebElementFacade txtTitleSuccessPage;

}
