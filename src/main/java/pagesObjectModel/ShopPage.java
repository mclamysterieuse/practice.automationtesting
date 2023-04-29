package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
    @FindBy(css = "#site-logo")
    private WebElement logo;

    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;
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
        logo.isDisplayed();
    }

    public void cliquequerSurShop(){
        shopLink.click();
    }
    public void cliquequerSurAddToBasket(){
        addToBasket.click();
    }
    public boolean verifierQueAddToBasketEstVisible(){
        return addToBasket.isDisplayed();
    }
    public boolean verifierQueReadMoreEstVisible(){
        return readMore.isDisplayed();
    }
    public boolean verifierQueViewBasketEstVisible(){ return viewBasket.isDisplayed();
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
