package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthentificationPage {

    WebDriver driver;
    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css = ".u-column1")
    public WebElement paveLogin;

    @FindBy(css = ".u-column2")
    public WebElement paveRegister;

    @FindBy(css = "#username")
    public WebElement loginUsername;

    @FindBy(css = "#password")
    public WebElement loginPassword;

    @FindBy(css ="#reg_email")
    public WebElement registerUsername;

    @FindBy(css = "#reg_password")
    public WebElement registerPassword;

    @FindBy(css = "form > p:nth-child(3) > input.woocommerce-Button")
    public WebElement loginButton;

    @FindBy(css = "p.woocomerce-FormRow.form-row > input.woocommerce-Button.button")
    public WebElement RegisterButton;

    @FindBy(css = "#rememberme")
    public WebElement RemeberMeCheckBox;

    @FindBy(css = ".lost_password > a")
    public WebElement lostPasswordLik;

    @FindBy(css = ".woocommerce-error > li")
    public WebElement errorMessageBlock;

    public AuthentificationPage(WebDriver driver) {
        this.driver = driver;
    }


}
