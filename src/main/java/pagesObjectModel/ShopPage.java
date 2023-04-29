package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
    @FindBy(css = "#site-logo > a > img")
    private WebElement logoIcon;
    @FindBy (css = "#menu-item-40 > a")
    private WebElement shopLink;
    @FindBy (css = "a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
    private WebElement addToBasket;

    @FindBy (css = "a.button.product_type_simple.ajax_add_to_cart")
    private WebElement readMore;

    @FindBy (css = "a.added_to_cart.wc-forward")
    private WebElement viewBasket;


    public ShopPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifierLaPresenceDuLogo(){
        logoIcon.isDisplayed();
    }

    public void cliquequerSurShop(){
        shopLink.click();
    }
    public void cliquequerSurAddToBasket(){
        addToBasket.click();
    }
    public void verifierQueAddToBasketEstVisible(){
        addToBasket.isDisplayed();
    }
    public void verifierQueReadMoreEstVisible(){
        readMore.isDisplayed();
    }
    public void verifierQueViewBasketEstVisible(){
        viewBasket.isDisplayed();
    }

}
