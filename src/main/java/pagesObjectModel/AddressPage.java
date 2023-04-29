package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

    WebDriver driver;

    @FindBy(css = "#site-logo > a > img")
    private WebElement logoIcon;
    @FindBy(css = "div.woocommerce > div > p")
    private WebElement message;

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-address > a")
    private WebElement addresseLink;

    public AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifierLaPresenceDuLogo(){
        logoIcon.isDisplayed();
    }
    public void cliquequerSurAddresses(){
        addresseLink.click();
    }
}