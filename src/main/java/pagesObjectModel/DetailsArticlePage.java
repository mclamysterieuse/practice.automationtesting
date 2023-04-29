package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsArticlePage {


    public WebDriver driver;

    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css=".attachment-shop_single")
    WebElement articlePhotographie;

    @FindBy(css="#tab-description")
    WebElement descriptionDetails;

    @FindBy(css="p.price")
    WebElement articlePrice;

    @FindBy(css=".in-stock")
    WebElement stock;

    @FindBy(css=".single_add_to_cart_button")
    WebElement addToBasketButton;

    @FindBy(css=".quantity")
    WebElement quantityField;

    @FindBy(css=".woocommerce-message")
    WebElement addedToBaksetMessage;

    @FindBy(css=".wc-forward")
    WebElement viewBasketButton;


    public DetailsArticlePage(WebDriver driver) {
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
