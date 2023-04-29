package StepDefs;

import cucumber.api.java.en.And;
import pagesObjectModel.AccountDetailsPage;

public class AccountDetailsPageStepdefs {

    AccountDetailsPage accountDetailsPage = new AccountDetailsPage(Hooks.driver);

    @And("Le logo est bien présent sur la page Account")
    public void leLogoEstBienPrésentSurLaPageAccount() {
        accountDetailsPage.checkVisibilityLogo();
    }
}
