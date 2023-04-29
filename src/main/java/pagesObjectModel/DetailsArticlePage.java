package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsArticlePage {

    @FindBy(css = "td.product-name > a")
    private WebElement detailArticleView;

    @FindBy(css = "p.in-stock")
    private WebElement stockView;

    @FindBy(css = "button.single_add_to_cart_button")
    private WebElement addToBasket;



    public DetailsArticlePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void cliquerSurDetailArticle(){
        detailArticleView.click();
    }
    public void verifierQueLestockDesArticlesEstVisible(){
        stockView.isDisplayed();
    }
    public void verifierQueAddToBasketEstVisible(){
        addToBasket.isDisplayed();
    }


}
