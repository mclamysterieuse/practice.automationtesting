package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LostPasswordPage {
    WebDriver driver;

    @FindBy(css="#user_login")
    public WebElement emailField;

    @FindBy(css=".button")
    public WebElement resetPasswordButton;


    public LostPasswordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setEmailField(String email){
        emailField.sendKeys(email);
    }

    public void clickResetPasswordButton(){
        resetPasswordButton.click();
    }
}
