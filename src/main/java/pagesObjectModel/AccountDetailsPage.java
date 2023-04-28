package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDetailsPage {

    WebDriver driver;

    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css="#password_current")
    public WebElement currentPassword;

    @FindBy(css="#password_1")
    public WebElement newPassword;

    @FindBy(css="#password_2")
    public WebElement confirmNewPassword;

    @FindBy(css=".woocommerce-Button")
    public WebElement saveButton;

    @FindBy(css=".woocommerce-error")
    public WebElement errorMessage;

    public AccountDetailsPage(WebDriver driver) {
        this.driver = driver;
    }


}
