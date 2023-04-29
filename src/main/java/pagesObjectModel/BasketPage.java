package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

    public WebDriver driver;

    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css= ".shop_table")
    WebElement summaryBasket;

    @FindBy(css=".quantity")
    WebElement quantity;

    @FindBy(css="td.product-price")
    WebElement articlePrice;

    // prix total par article
    @FindBy(css="td.product-subtotal")
    WebElement articleTotalPrice;

    @FindBy(css="td.product-remove")
    WebElement deleteButton;

    @FindBy(css=".coupon_code")
    WebElement couponCodeField;

    @FindBy(css="div.coupon > .button")
    WebElement applyCodeButton;

    //prix total de tout le panier
    @FindBy(css="tr.cart-subtotal > td >.amount")
    WebElement basketTotalPrice;

    @FindBy(css="tr.tax-rate > td >.amount")
    WebElement tax;

    //prix total du panier taxé
    @FindBy(css="tr.order-total > td > strong >.amount")
    WebElement taxedTotalPrice;


    public BasketPage(WebDriver driver) {
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
