package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(css = "#reg_email")
    public WebElement registerUsername;

    @FindBy(css = "#reg_password")
    public WebElement registerPassword;

    @FindBy(css = "form > p:nth-child(3) > input.woocommerce-Button")
    public WebElement loginButton;


    @FindBy(css = "p.woocomerce-FormRow.form-row > input.woocommerce-Button.button")
    public WebElement registerButton;


    @FindBy(css = "#rememberme")
    public WebElement remeberMeCheckBox;


    @FindBy(css = ".lost_password > a")
    public WebElement lostPasswordLink;


    @FindBy(css = ".woocommerce-error > li")
    public WebElement errorMessageBlock;


    public AuthentificationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean checkVisibilityBasketLink() {
        return basketLink.isDisplayed();
    }

    public boolean checkVisibilityLogo() {
        return logo.isDisplayed();
    }

    public void clickBasketLink() {
        basketLink.click();
    }

    public void clickLogo() {
        logo.click();
    }

    public boolean checkVisibilityPaveLogin() {
        return paveLogin.isDisplayed();
    }

    public boolean checkVisibilityPaveRegister() {
        return paveRegister.isDisplayed();
    }

    public void setloginUsername(String userName) {
        loginUsername.sendKeys(userName);
    }

    public void setLoginPassword(String password) {
        loginPassword.sendKeys(password);
    }

    public void setRegisterUsername(String userName) {
        registerUsername.sendKeys(userName);
    }

    public void setRegisterPassword(String password) {
        registerPassword.sendKeys(password);
    }

    public void clickloginButton() {
        loginButton.click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void clickRemeberMeCheckBox() {
        remeberMeCheckBox.click();
    }

    public void clickLostPassword() {
        lostPasswordLink.click();
    }

    public String getErrorMessageBlock() {
        return errorMessageBlock.getText();
    }

}