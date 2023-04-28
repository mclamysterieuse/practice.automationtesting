package pagesObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

    @FindBy(css=".woocommerce-message")
    public WebElement message;
}
