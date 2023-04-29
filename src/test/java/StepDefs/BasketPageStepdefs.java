package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasketPageStepdefs {


    @And("Je clique sur le lien {string}")
    public void jeCliqueSurLeLien(String arg0) {
    }

    @Then("je me redirige vers le panier")
    public void jeMeRedirigeVersLePanier() {

    }

    @And("Un filtre permet d affiner la vue des articles par prix")
    public void unFiltrePermetDAffinerLaVueDesArticlesParPrix() {

    }

    @And("Un filtre permet d affiner la vue des articles par thème")
    public void unFiltrePermetDAffinerLaVueDesArticlesParThème() {

    }

    @And("Chaque article contient une photo descriptive, un libellé et le prix affiché au-dessous")
    public void chaqueArticleContientUnePhotoDescriptiveUnLibelléEtLePrixAffichéAuDessous() {

    }

    @When("Je selectionne l'article")
    public void jeSelectionneLArticle() {

    }

    @Given("La page panier affiche un récapitulatif des articles ajoutés et les informations {string}")
    public void laPagePanierAfficheUnRécapitulatifDesArticlesAjoutésEtLesInformations(String arg0) {

    }

    @And("Je cliquer sur le bouton supprimer l'article")
    public void jeCliquerSurLeBoutonSupprimerLArticle() {

    }

    @Then("Je valide que l'article à bien été supprimer")
    public void jeValideQueLArticleÀBienÉtéSupprimer() {

    }

    @Given("Je me redirige vers la page panier")
    public void jeMeRedirigeVersLaPagePanier() {

    }

    @When("Je vérifie l'éxistance du champ quantité")
    public void jeVérifieLÉxistanceDuChampQuantité() {

    }

    @And("Je modifie la quantité d'article via le champ quantité")
    public void jeModifieLaQuantitéDArticleViaLeChampQuantité() {

    }

    @Then("Je valide que la quantité de chaque article à bien été modifié par le champs quantité")
    public void jeValideQueLaQuantitéDeChaqueArticleÀBienÉtéModifiéParLeChampsQuantité() {

    }

    @Given("La page panier contient un article")
    public void laPagePanierContientUnArticle() {

    }

    @Then("Je valide que la page panier affiche un récapitulatif des articles ajoutés spécifiant la quantité, le prix unitaire et le prix total")
    public void jeValideQueLaPagePanierAfficheUnRécapitulatifDesArticlesAjoutésSpécifiantLaQuantitéLePrixUnitaireEtLePrixTotal() {

    }

    @When("je choisie la quantité d'exemplaire")
    public void jeChoisieLaQuantitéDExemplaire() {
    }

    @Given("un article se trouve dans la page panier")
    public void unArticleSeTrouveDansLaPagePanier() {

    }

    @And("je clique sur le bouton {string}")
    public void jeCliqueSurLeBouton(String arg0) {

    }

    @Then("le message {string} est affiché")
    public void leMessageEstAffiché(String arg0) {

    }

    @And("le bouton {string} est affiché au dessus de  article et redirige vers espace panier")
    public void leBoutonEstAffichéAuDessusDeArticleEtRedirigeVersEspacePanier(String arg0) {
    }
}
