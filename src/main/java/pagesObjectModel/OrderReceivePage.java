package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReceivePage {

    WebDriver driver;

    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    public OrderReceivePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean checkVisibilityBasketLink() {
        return basketLink.isDisplayed();
    }

    public boolean checkVisibilityLogo() {
        return logo.isDisplayed();
    }

    public void clickBasketLink() {
        basketLink.click();
    }

    public void clickLogo() {
        logo.click();
    }

}
