package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

    WebDriver driver;
    @FindBy(css = "#site-logo > a > img")
    private WebElement logoIcon;

    @FindBy(css = "#wpmenucartli > a > i")
    private WebElement basketIcon;
    @FindBy(css = ".button.view")
    private WebElement viewButton;

    @FindBy(css = "th.order-number > span")
    private WebElement orderView;



    public OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
