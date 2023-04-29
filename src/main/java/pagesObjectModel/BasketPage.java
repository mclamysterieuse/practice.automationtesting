package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasketPage {

    WebDriver driver;
    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css = ".shop_table")
    WebElement summaryBasket;

    @FindBy(css = ".quantity")
    WebElement quantity;

    @FindBy(css = "td.product-price")
    WebElement articlePrice;

    // prix total par article
    @FindBy(css = "td.product-subtotal")
    WebElement articleTotalPrice;

    @FindBy(css = "td.product-remove")
    WebElement deleteButton;

    @FindBy(css = ".coupon_code")
    WebElement couponCodeField;

    @FindBy(css = "div.coupon > .button")
    WebElement applyCodeButton;

    //prix total de tout le panier
    @FindBy(css = "tr.cart-subtotal > td >.amount")
    WebElement basketTotalPrice;

    @FindBy(css = "tr.tax-rate > td >.amount")
    WebElement tax;

    //prix total du panier taxé
    @FindBy(css = "tr.order-total > td > strong >.amount")
    WebElement taxedTotalPrice;

    By quantityBy = By.cssSelector(".quantity");

    public BasketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void cliquerSurApplyCoupon() {
        applyCodeButton.click();
    }

    public boolean verifierQueApplyCouponEstVisible() {
        return applyCodeButton.isDisplayed();
    }

    public boolean verifierQueLePrixTotalEstVisible() {
        return articleTotalPrice.isDisplayed();
    }

    public boolean verifierQueLePrixTotalEstVisibleDansLePanier() {
        return basketTotalPrice.isDisplayed();
    }

    public boolean verifierQueLePrixDeLarticleEstVisible() {
        return articlePrice.isDisplayed();
    }

    public boolean verifierQueLeDeleteButtonEstVisible() {
        return deleteButton.isDisplayed();
    }

    public void verifierQueLePanierLinkEstCliquable() {
        basketLink.click();
    }

    public boolean verifierQueSummaryBasketIsVisible() {
        return summaryBasket.isDisplayed();
    }

    public boolean verifierQueUpdateQuantityIsVisible() {
        return quantity.isDisplayed();
    }

    public boolean verifierQueCouponCodeFieldIsVisible() {
        return couponCodeField.isDisplayed();
    }

    public boolean verifierQueLePrixTotalApresTaxeIsVisible() {
        return taxedTotalPrice.isDisplayed();
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

    public boolean verifierQueLeChampsTaxEstVisible() {
        return tax.isDisplayed();
    }

    public Object updateQuantity(int productIndex, int newQuantity) {
        WebElement quantitySelectTag = driver.findElements(quantityBy).get(productIndex);
        Select dropdownQuantity = new Select(quantitySelectTag);
        dropdownQuantity.selectByIndex(newQuantity);
        return this;
    }
}
