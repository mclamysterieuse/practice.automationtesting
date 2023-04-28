package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

    WebDriver driver;

    @FindBy(css = "#site-logo > a > img")
    private WebElement logoIcon;
    @FindBy(css = "#wpmenucartli > a > i")
    private WebElement basketIcon;
    @FindBy(css = "div.woocommerce > div > p")
    private WebElement message;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}