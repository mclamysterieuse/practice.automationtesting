package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
    @FindBy(css = "a.added_to_cart.wc-forward")
    private WebElement viewBasket;

    @FindBy(css = "input.button[name =apply_coupon]")
    private WebElement applyCoupon;

    public BasketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void cliquerSurAddToBasket(){
        viewBasket.click();
    }

    public void cliquerSurApplyCoupon(){
        applyCoupon.click();
    }

    public void verifierQueApplyCouponEstVisible(){
        applyCoupon.isDisplayed();
    }


}
