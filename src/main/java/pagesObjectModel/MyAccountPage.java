package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    public WebDriver driver;

    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css=".woocommerce-message")
    public WebElement messagePasswordChanged;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--customer-logout")
    public WebElement logoutLink;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--dashboard")
    public WebElement dashboardLink;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--orders")
    public WebElement ordersLink;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--downloads")
    public WebElement downloadsLink;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--edit-address")
    public WebElement addressLink;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--edit-account")
    public WebElement accountLink;

    public MyAccountPage(WebDriver driver) {
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
}
