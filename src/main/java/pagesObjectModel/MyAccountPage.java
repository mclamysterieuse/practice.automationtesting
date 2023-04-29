package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyAccountPage {

    @FindBy(css=".woocommerce-message")
    public WebElement message;

    @FindBy(css="input#username")
    public WebElement usernameTextBox;

    @FindBy(css="input#password")
    public WebElement passwordTextBox;

    @FindBy(css="input.woocommerce-Button[name=login]")
    public WebElement loginButton;



    @FindBy(css="#site-logo > a > img")
    public WebElement logoButton;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifierLaPresenceDuLogo(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logoButton.isDisplayed();
    }
    public void entrerMonUsername(String username){
        usernameTextBox.sendKeys(username);
    }

    public void entrerMonPassword(String password){
        passwordTextBox.sendKeys(password);
    }

    public void cliquerSurLogin(){
        loginButton.click();
    }



}
