package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesObjectModel.AuthentificationPage;
import pagesObjectModel.MyAccountPage;

import java.time.Duration;

import static StepDefs.Hooks.driver;

public class AuthentificationPageStepdefs {

    public AuthentificationPage authentificationPage = new AuthentificationPage(driver);
    public MyAccountPage myAccoutPage = new MyAccountPage(driver);


    public AuthentificationPageStepdefs() {
        PageFactory.initElements(driver, this);
    }

    @Given("je me redirige vers la page My Account")
    public void jeMeRedirigeVersLaPageMyAccount() {
        authentificationPage.accesAuthentificationPage();
    }

    @When("je saisis mon login {string}")
    public void jeSaisisMonLogin(String login) {
        authentificationPage.setloginUsername(login);
    }

    @And("je saisis mon password {string}")
    public void jeSaisisMonPassword(String password) {
        authentificationPage.setLoginPassword(password);
    }

    @And("je clique sur le bouton Login")
    public void jeCliqueSurLeBoutonLogin() {
        authentificationPage.clickloginButton();
    }

    @Then("Je ne suis pas connecté")
    public void jeNeSuisPasConnecté() {
        Assert.assertTrue("Le mot Hello est présent sur la page",!authentificationPage.body.getText().contains("Hello"));
    }

    @And("le message {string} s'affiche")
    public void leMessageSAffiche(String message) {
       Assert.assertEquals("Le message d'erreur n'est pas présent",message,authentificationPage.getErrorMessageBlock());
    }

    @And("je coche sur la case Remember me")
    public void jeCocheSurLaCaseRememberMe() {
        authentificationPage.clickRemeberMeCheckBox();
    }

    @Then("le champ login est pré-rempli par le login {string}")
    public void leChampLoginEstPréRempliParLeLogin(String login) {
        Assert.assertEquals("Le champ n'est pas pré-rempli",login,authentificationPage.loginUsername.getAttribute("value"));

    }

    @And("le pavé Login est affiché")
    public void lePavéLoginEstAffiché() {
        Assert.assertTrue("Le pavé login n'est pas présent",authentificationPage.paveLogin.isDisplayed());
    }



    @Then("le pavé Register est présent dans l'espace My Account")
    public void lePavéRegisterEstPrésentDansLEspaceMyAccount() {
        Assert.assertTrue("Le pavé register n'est pas présent",authentificationPage.paveRegister.isDisplayed());
    }

    @Then("Je suis déconneté")
    public void jeSuisDéconneté() {
        Assert.assertTrue("Je suis encore connecté",authentificationPage.paveLogin.isDisplayed());
    }

    @And("je saisis un mot de passe composé à minima de sept caractères, une majuscule, une minuscule et un chiffre spécial {string}")
    public void jeSaisisUnMotDePasseComposéÀMinimaDeSeptCaractèresUneMajusculeUneMinusculeEtUnChiffreSpécial(String password) {
        authentificationPage.setLoginPassword(password);
    }

    @And("je clique sur le bouton REGISTER")
    public void jeCliqueSurLeBoutonREGISTER() {
        Hooks.cliquer();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.name("register")));
        authentificationPage.registerButton.click();
    }

    @And("je saisis un mot de passe {string} invalide")
    public void jeSaisisUnMotDePasseInvalide(String password) {
    }


    @When("Je clique sur le lien Lost your password?")
    public void jeCliqueSurLeLienLostYourPassword() {
        authentificationPage.lostPasswordLink.click();
    }

    @Then("Je valide la présence du lien Lost your password?")
    public void jeValideLaPrésenceDuLienLostYourPassword() {
        Assert.assertTrue("Le lien Lost your password est absent",authentificationPage.lostPasswordLink.isDisplayed());

    }


    @When("je saisis mon login du pave register {string}")
    public void jeSaisisMonLoginDuPaveRegister(String login) {
        authentificationPage.setRegisterUsername(login);
    }

    @And("je saisis mon password du pave register {string}")
    public void jeSaisisMonPasswordDuPaveRegister(String password) {
        authentificationPage.setRegisterPassword(password);
    }
}
