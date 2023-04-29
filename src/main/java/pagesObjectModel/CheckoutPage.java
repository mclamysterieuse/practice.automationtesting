package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    WebDriver driver;
    @FindBy(css = "#site-logo > a > img")
    private WebElement logoIcon;

    @FindBy(css = "#wpmenucartli > a > i")
    private WebElement basketIcon;

    @FindBy(css = "p.woocommerce-thankyou-order-received")
    private WebElement orderMessage ;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
