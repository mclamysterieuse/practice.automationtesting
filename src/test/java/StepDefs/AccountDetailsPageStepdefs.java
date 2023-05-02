package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesObjectModel.AccountDetailsPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static StepDefs.Hooks.driver;

public class AccountDetailsPageStepdefs {

    AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);


    @And("Le logo est bien présent sur la page Account")
    public void leLogoEstBienPrésentSurLaPageAccount() {
        accountDetailsPage.checkVisibilityLogo();
    }

    @Then("Je suis redirigé vers mes informations de comptes")
    public void jeSuisRedirigéVersMesInformationsDeComptes() {
        Assert.assertTrue("Je ne suis pas redirigé vers la page de mes informations",accountDetailsPage.confirmNewPassword.isDisplayed());
    }

    @And("je saisis mon password actuel {string}")
    public void jeSaisisMonPasswordActuel(String password) {

        accountDetailsPage.setCurrentPassword(password);
    }

    @And("je saisis mon nouveau password {string}")
    public void jeSaisisMonNouveauPassword(String password) {
        accountDetailsPage.setNewPassword(password);

    }
    @And("je resaisis mon nouveau password {string}")
    public void jeResaisisMonNouveauPassword(String password) {
        accountDetailsPage.setConfirmNewPassword(password);
    }

    @And("je clique sur le bouton confirmer")
    public void jeCliqueSurLeBoutonConfirmer() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        accountDetailsPage.clickSaveButton();
    }
    @Then("le message d'erreur {string} est affiché")
    public void leMessageDErreurEstAffiché(String message) {
        Assert.assertEquals("Le changement de mot de passe s'est éfféctué",message,accountDetailsPage.errorMessage.getText());
    }

    @And("je saisie mon prenom {string}")
    public void jeSaisieMonPrenom(String prenom) {
        accountDetailsPage.setPrenom(prenom);
    }

    @And("je saisie mon nom {string}")
    public void jeSaisieMonNom(String nom) {
        accountDetailsPage.setNom(nom);
    }
}
