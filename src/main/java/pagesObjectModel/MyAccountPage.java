package pagesObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class MyAccountPage {

    public  WebDriver driver;

    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css = ".woocommerce-message")
    public WebElement messagePasswordChanged;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--customer-logout > a ")
    public WebElement logoutLink;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--dashboard > a")
    public WebElement dashboardLink;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--orders > a")
    public WebElement ordersLink;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--downloads > a")
    public WebElement downloadsLink;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--edit-address > a")
    public WebElement addressLink;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--edit-account > a")
    public WebElement accountLink;


    @FindBy(css = ".woocommerce-message")
    public WebElement message;

    @FindBy(tagName = "body")
    public WebElement body;


    @FindBy(tagName = "html")
    public WebElement html;

    public MyAccountPage(WebDriver driver) {


    @FindBy (tagName = "html")
    private WebElement tagHtmlSelector;


    public MyAccountPage(WebDriver driver) {
>>>>>>> 55e1ef94e88a130c74d3b00486a36d214d7d2c46
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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions action =  new Actions(driver);
        action.moveToElement(tagHtmlSelector);
        action.moveByOffset(-400, 0).click().build().perform();
        logo.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        action.moveToElement(tagHtmlSelector);
        action.moveByOffset(-400, 0).click().build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickAccountDetailLink(){

        accountLink.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(html);
        // Click at an offset of 400px to the left of the element
        actions.moveByOffset(-400, 0).click().build().perform();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
