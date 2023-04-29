package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pagesObjectModel.AddressPage;

public class AddressPageStepdefs {

    AddressPage addressPage = new AddressPage(Hooks.driver);
    @And("Je me redirige vers le site {string}  de la page Adresse")
    public void jeMeRedirigeVersLeSiteDeLaPageAdresse(String lien) {
        Hooks.driver.get(lien);
    }

    @Then("Le logo est bien présent sur la page Address")
    public void leLogoEstBienPrésentSurLaPageAddress() {
        addressPage.verifierLaPresenceDuLogo();

    }

    @And("je clique sur {string}")
    public void jeCliqueSur(String arg0) {
        addressPage.cliquequerSurAddresses();
    }
}
