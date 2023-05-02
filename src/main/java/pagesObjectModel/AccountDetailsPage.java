package pagesObjectModel;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class AccountDetailsPage {

    WebDriver driver;


    @FindBy(tagName = "html")
    public WebElement html;

    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css = "#password_current")
    public WebElement currentPassword;

    @FindBy(css = "#password_1")
    public WebElement newPassword;

    @FindBy(css = "#password_2")
    public WebElement confirmNewPassword;

    @FindBy(css = ".woocommerce-Button")
    public WebElement saveButton;

    @FindBy(css = ".woocommerce-error")
    public WebElement errorMessage;

    @FindBy(css="#account_first_name")
    public WebElement prenomField;

    @FindBy(css="#account_last_name")
    public WebElement nomField;

    public AccountDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
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

    public void setCurrentPassword(String password) {

        currentPassword.sendKeys(password);
    }

    public void setNewPassword(String password) {
        newPassword.sendKeys(password);
    }

    public void setConfirmNewPassword(String password) {
        confirmNewPassword.sendKeys(password);
    }

    public void clickSaveButton() {

        Actions action =  new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        saveButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void setPrenom(String prenom){
        prenomField.sendKeys(prenom);
    }
    public void setNom(String nom){
        nomField.sendKeys(nom);
    }

}
