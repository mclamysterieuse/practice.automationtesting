package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DetailsArticlePage {

    public WebDriver driver;


    @FindBy(css = ".wpmenucartli > a")
    public WebElement basketLink;

    @FindBy(css = "#site-logo")
    public WebElement logo;

    @FindBy(css = ".attachment-shop_single")
    WebElement articlePhotographie;

    @FindBy(css = "#tab-description")
    WebElement descriptionDetails;

    @FindBy(css = "p.price")
    WebElement articlePrice;

    @FindBy(css = ".in-stock")
    WebElement stock;

    @FindBy(css = ".single_add_to_cart_button")
    WebElement addToBasketButton;

    @FindBy(css = ".quantity")
    WebElement quantityField;

    @FindBy(css = ".woocommerce-message")
    WebElement addedToBaksetMessage;

    @FindBy(css = ".wc-forward")
    WebElement viewBasketButton;

    @FindBy(css = "td.product-name > a")
    private WebElement detailArticleView;

    By quantityBy = By.cssSelector(".quantity");


    public DetailsArticlePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void cliquerSurDetailArticle() {
        detailArticleView.click();
    }

    public boolean verifierQueLestockDesArticlesEstVisible() {
        return stock.isDisplayed();
    }

    public boolean verifierQueAddToBasketEstVisible() {
        return addToBasketButton.isDisplayed();
    }

    public boolean verifierQueLeMessageEstPresent() {
        return addedToBaksetMessage.isDisplayed();
    }

    public boolean verifierQueLaDescriptionDeLarticleEstPresent() {
        return descriptionDetails.isDisplayed();
    }

    public boolean verifierQueLaPhotoDeLarticleEstPresent() {
        return articlePhotographie.isDisplayed();
    }

    public boolean verifierQueLePrixDeLarticleEstPresent() {
        return articlePrice.isDisplayed();
    }

    public boolean verifierQueLeLienViewBasketEstPresent() {
        return viewBasketButton.isDisplayed();
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

    public Object updateQuantity(int productIndex, int newQuantity) {
        WebElement quantitySelectTag = driver.findElements(quantityBy).get(productIndex);
        Select dropdownQuantity = new Select(quantitySelectTag);
        dropdownQuantity.selectByIndex(newQuantity);
        return this;
    }

}
