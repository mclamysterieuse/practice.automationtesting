package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthentificationPage {
    WebDriver driver;

    @FindBy(css = ".u-column1")
    public WebElement paveLogin;

    @FindBy(css = ".u-column2")
    public WebElement paveRegister;

    @FindBy(css = "#username")
    public WebElement inputUsername;

    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(css = "form > p:nth-child(3) > input.woocommerce-Button")
    public WebElement loginButton;

    @FindBy(tagName = "body")
    public WebElement body;


    public AuthentificationPage(WebDriver driver) {
        this.driver = driver;
    }
}
