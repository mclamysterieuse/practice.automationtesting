package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagesObjectModel.ShopPage;

public class ShopPageStepsdefs {

    ShopPage shopPage = new ShopPage(Hooks.driver);

    @When("Je clique sur le bouton {string}")
    public void jeCliqueSurLeBouton(String arg0) {
        shopPage.cliquequerSurShop();

    }

    @And("Je valide apparition du lien  {string} au-dessous article, si article n'est pas en stock")
    public void jeValideApparitionDuLienAuDessousArticleSiArticleNEstPasEnStock(String arg0) {

    }

    @And("Je valide  apparition du lien  {string} à la place du bouton {string}")
    public void jeValideApparitionDuLienÀLaPlaceDuBouton(String arg0, String arg1) {

    }

    @And("Je valide  apparition du lien  {string} a la place du bouton {string}")
    public void jeValideApparitionDuLienALaPlaceDuBouton(String arg0, String arg1) {
    }

    @Then("je valide la présence de la liste des articles")
    public void jeValideLaPrésenceDeLaListeDesArticles() {

    }

    @And("Je valide la présence du  bouton  {string}")
    public void jeValideLaPrésenceDuBouton(String arg0) {

    }

    @Given("Je me trouve sur la page Shop via le lien {string}")
    public void jeMeTrouveSurLaPageShopViaLeLien(String arg0) {
    }

    @And("je clique sur onglet {string}")
    public void jeCliqueSurOnglet(String arg0) {

    }

    @And("Le logo est bien présent sur la page Shop")
    public void leLogoEstBienPrésentSurLaPageShop() {
        shopPage.verifierLaPresenceDuLogo();
    }
}