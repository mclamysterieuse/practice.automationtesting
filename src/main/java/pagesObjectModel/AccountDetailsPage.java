package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean checkVisibilityBasketLink(){
        return basketLink.isDisplayed();
    }

    public boolean checkVisibilityLogo(){
        return logo.isDisplayed();
    }

    public void clickBasketLink(){
        basketLink.click();
    }

    public void clickLogo(){
        logo.click();
    }

    public void setCurrentPassword(String password){
        currentPassword.sendKeys(password);
    }

    public void setNewPassword(String password){
        newPassword.sendKeys(password);
    }

    public void setConfirmNewPassword(String password){
        confirmNewPassword.sendKeys(password);
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }

}
