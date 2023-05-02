package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pagesObjectModel.MyAccountPage;

public class MyAccountPageStepdefs {

  MyAccountPage myAccountPage = new MyAccountPage(Hooks.driver);


  @Given("je me redirige vers la page My Account via le lien {string}")
  public void jeMeRedirigeVersLaPageMyAccountViaLeLien(String lien) {
    Hooks.driver.get(lien);
  }

  @And("Le logo est bien présent sur la page My Account")
  public void leLogoEstBienPrésentSurLaPageMyAccount() {
    myAccountPage.checkVisibilityLogo();
  }


  @Then("Je suis connecté")
  public void jeSuisConnecté() {
    Assert.assertTrue("La connexion de s'est pas faite",myAccountPage.body.getText().contains("Hello"));
  }

  @And("l'ecran Dashboard est affiché")
  public void lEcranDashboardEstAffiché() {
    Assert.assertTrue(myAccountPage.dashboardLink.isDisplayed());
  }

  @And("le lien Orders est présent")
  public void leLienOrdersEstPrésent() {
    Assert.assertTrue(myAccountPage.ordersLink.isDisplayed());
  }

  @And("le lien Download est présent")
  public void leLienDownloadEstPrésent() {
    Assert.assertTrue(myAccountPage.downloadsLink.isDisplayed());
  }

  @And("le lien Addresses est présent")
  public void leLienAddressesEstPrésent() {
    Assert.assertTrue(myAccountPage.addressLink.isDisplayed());
  }

  @And("le lien Account Details est présent")
  public void leLienAccountDetailsEstPrésent() {
    Assert.assertTrue(myAccountPage.addressLink.isDisplayed());
  }

  @And("le lien Logout est présent")
  public void leLienLogoutEstPrésent() {
    Assert.assertTrue(myAccountPage.logoutLink.isDisplayed());
  }

  @And("je me deconnecte")
  public void jeMeDeconnecte() {
    myAccountPage.logoutLink.click();
  }

  @And("je clique sur le lien Account Détails")
  public void jeCliqueSurLeLienAccountDétails() {

    myAccountPage.clickAccountDetailLink();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }


  @When("Je clique sur le lien Logout")
  public void jeCliqueSurLeLienLogout() {
    myAccountPage.logoutLink.click();
  }

  @Then("Je possede un compte client")
  public void jePossedeUnCompteClient() {
    Assert.assertTrue("La création ne s'est pas faite",myAccountPage.body.getText().contains("Hello"));
  }

  @Then("Je ne cree pas mon compte")
  public void jeNeCreePasMonCompte() {
    Assert.assertTrue("La création s'est faite",!myAccountPage.body.getText().contains("Hello"));
  }

    @Then("le message {string} est affiché")
    public void leMessageEstAffiché(String message) {
        Assert.assertEquals("Le changement de mot de passe ne s'est pas éfféctué",message,myAccountPage.message.getText());
    }

}
