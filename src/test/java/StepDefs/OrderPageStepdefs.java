package StepDefs;

import cucumber.api.java.en.And;
import pagesObjectModel.OrderPage;

public class OrderPageStepdefs {

    OrderPage orderPage = new OrderPage(Hooks.driver);
    @And("Le logo est bien présent sur la page order")
    public void leLogoEstBienPrésentSurLaPageOrder() {
        orderPage.checkVisibilityLogo();
    }

    @And("je clique sur le lien de  {string}")
    public void jeCliqueSurLeLienDe(String arg0) {
        orderPage.clickOrderLink();
    }
}
