package StepDefs;

import cucumber.api.java.en.And;
import org.openqa.selenium.Alert;
import pagesObjectModel.DownloadPage;

import static StepDefs.Hooks.driver;

public class DownloadStepdefs {

    DownloadPage downloadPage = new DownloadPage(driver);

    @And("Je me redirige vers le site {string}  de la page Downloads")
    public void jeMeRedirigeVersLeSiteDeLaPageDownloads(String lien) {

        if (driver.switchTo().alert() != null) {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.dismiss(); // alert.accept();
        }

        driver.get(lien);
    }

    @And("Le logo est bien présent sur la page Downloads")
    public void leLogoEstBienPrésentSurLaPageDownloads() {
        downloadPage.verifierLaPresenceDuLogo();
    }

    @And("je clique sur le lien  {string}")
    public void jeCliqueSurLeLien(String arg0) {
        driver.switchTo().alert().accept();
        downloadPage.cliquequerSurDownloads();
    }
}

