package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pagesObjectModel.MyAccountPage;

public class MyAccountPageStepdefs {

  MyAccountPage myAccountPage = new MyAccountPage(Hooks.driver);


  @Given("je me redirige vers la page My Account via le lien {string}")
  public void jeMeRedirigeVersLaPageMyAccountViaLeLien(String lien) {
    Hooks.driver.get(lien);
  }

  @And("Le logo est bien présent sur la page My Account")
  public boolean leLogoEstBienPrésentSurLaPageMyAccount() {
    return myAccountPage.checkVisibilityLogo();
  }

  @When("Je saisis mon username")
  public void jeSaisisMonUsername() {
    myAccountPage.entrerMonUsername("christine.alega@aims-cameroon.org");

  }

  @And("je saisis mon password")
  public void jeSaisisMonPassword() {
    myAccountPage.entrerMonPassword("Devalon@1991");
  }

  @And("Je clique sur login")
  public void jeCliqueSurLogin() {
    myAccountPage.cliquerSurLogin();
  }

  @And("le basket link est present sur la page My Account")
  public boolean leBasketLinkEstPresentSurLaPageMyAccount() {
    return myAccountPage.checkVisibilityBasketLink();
  }

    @And("je clique sur le logo")
    public void jeCliqueSurLeLogo() {
    myAccountPage.clickLogo();
    }
}
