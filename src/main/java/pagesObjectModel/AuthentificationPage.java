package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class AuthentificationPage {

    WebDriver driver;

    @FindBy(tagName = "html")
    public WebElement html;

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


    @FindBy(name = "register")
    public WebElement registerButton;


    @FindBy(css = "#rememberme")
    public WebElement remeberMeCheckBox;


    @FindBy(css = ".lost_password > a")
    public WebElement lostPasswordLink;


    @FindBy(css = ".woocommerce-error > li")
    public WebElement errorMessageBlock;

    @FindBy(tagName = "body")
    public WebElement body;

    public AuthentificationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void accesAuthentificationPage(){
        driver.get("https://practice.automationtesting.in/my-account/");
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