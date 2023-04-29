package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(css = ".wpmenucartli > a")
    public WebElement headerBasketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css="#n2-ss-6-align")
    WebElement slide;

    @FindBy(css=".add_to_cart_button")
    WebElement addToBasketButton;

    @FindBy(css=".woocommerce-LoopProduct-link")
    WebElement articleCards;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean checkVisibilityBasketLink(){
        return headerBasketLink.isDisplayed();
    }

    public boolean checkVisibilityLogo(){
        return logo.isDisplayed();
    }

    public void clickBasketLink(){
        headerBasketLink.click();
    }

    public void clickLogo(){
        logo.click();
    }
}
