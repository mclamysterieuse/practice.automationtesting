package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReceivePage {

    WebDriver driver;
    @FindBy(css = "#site-logo > a > img")
    private WebElement logoIcon;
    @FindBy(css = ".button.view")
    private WebElement viewButton;
    @FindBy(css = "div.woocommerce > div > h2")
    private WebElement orderDetailsView;


    public OrderReceivePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
