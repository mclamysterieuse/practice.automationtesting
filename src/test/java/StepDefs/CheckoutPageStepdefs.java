package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pagesObjectModel.CheckoutPage;

public class CheckoutPageStepdefs {

    CheckoutPage checkoutpage = new CheckoutPage(Hooks.driver);

    @Then("Je suis redirigé vers la page de paiement pour finaliser ma commande")
    public boolean jeSuisRedirigéVersLaPageDePaiementPourFinaliserMaCommande() {
        return checkoutpage.checkVisibilityOfPlaceOrder();

    }

    @And("Je clique sur le bouton de{string}")
    public void jeCliqueSurLeBoutonDe(String arg0) {
        checkoutpage.clickCheckout();
    }
}