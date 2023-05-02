package StepDefs;

import cucumber.api.java.en.And;
import pagesObjectModel.LogoutPage;

public class LogoutPageStepdefs {

    LogoutPage logoutPage = new LogoutPage(Hooks.driver);
    @And("je clique sur le lien {string}")
    public void jeCliqueSurLeLien(String arg0) {
        logoutPage.cliquerSurLogout();
    }
}
