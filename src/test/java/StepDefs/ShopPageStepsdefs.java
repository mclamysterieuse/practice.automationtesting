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
        shopPage.cliquerSurAddToBasket();

    }

    @And("Je valide apparition du lien  {string} au-dessous article, si article n'est pas en stock")
    public boolean jeValideApparitionDuLienAuDessousArticleSiArticleNEstPasEnStock(String arg0) {
        return shopPage.verifierQueReadMoreEstVisible();
    }

    @When("Je valide  apparition du lien  {string} à la place du bouton {string}")
    public boolean jeValideApparitionDuLienÀLaPlaceDuBouton(String arg0, String arg1) {
        return shopPage.verifierQueViewBasketEstVisible();

    }

    @Then("je valide la présence de la liste des articles")
    public boolean jeValideLaPrésenceDeLaListeDesArticles() {
        return shopPage.validerLapresenceListeArticle();

    }

    @And("Je valide la présence du  bouton  {string}")
    public boolean jeValideLaPrésenceDuBouton(String arg0) {
        return shopPage.verifierQueAddToBasketEstVisible();
    }


    @And("je clique sur onglet {string}")
    public void jeCliqueSurOnglet(String arg0) {
        shopPage.cliquerSurShop();
    }

    @And("Le logo est bien présent sur la page Shop")
    public boolean leLogoEstBienPrésentSurLaPageShop() {
        return shopPage.checkVisibilityLogo();
    }

    @And("le basket link est present sur la page shop")
    public boolean leBasketLinkEstPresentSurLaPageShop() {
        return shopPage.checkVisibilityBasketLink();
    }

    @And("Je valide  apparition du lien  {string} a la place du bouton {string}")
    public boolean jeValideApparitionDuLienALaPlaceDuBouton(String arg0, String arg1) {
        return shopPage.verifierQueReadMoreEstVisible();
    }

    @Given("Je me trouve sur la page Shop via le lien {string}")
    public void jeMeTrouveSurLaPageShopViaLeLien(String lien) {
        Hooks.driver.get(lien);
    }

    @And("Un filtre permet d affiner la vue des articles par prix")
    public void unFiltrePermetDAffinerLaVueDesArticlesParPrix() {
        shopPage.verifierQuePeuxAffinerArticlePrix();
    }

    @And("Un filtre permet d affiner la vue des articles par thème")
    public void unFiltrePermetDAffinerLaVueDesArticlesParThème() {
        shopPage.verifierQuePeuxAffinerArticleTheme();
    }

    @And("Je clique sur le lien {string}")
    public void jeCliqueSurLeLien(String arg0) {
        shopPage.cliquerSurViewBasket();
    }

}