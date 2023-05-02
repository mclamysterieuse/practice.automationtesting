package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

   public  WebDriver driver;

    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-address > a")
    private WebElement addresseLink;

    public AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean  checkVisibilityLogo() {
       return logo.isDisplayed();
    }

    public boolean  checkVisibilityBasket() {
        return basketLink.isDisplayed();
    }

    public void cliquerSurAddresses() {
        addresseLink.click();
    }
}