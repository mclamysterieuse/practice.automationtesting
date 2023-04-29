package pagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage {
    @FindBy(css = "#site-logo > a > img")
    private WebElement logoIcon;

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--downloads > a")
    private WebElement downloadLink;


    public DownloadPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean verifierLaPresenceDuLogo() {
        return logoIcon.isDisplayed();
    }

    public void cliquequerSurDownloads() {
        downloadLink.click();
    }

}
