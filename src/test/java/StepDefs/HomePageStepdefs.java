package StepDefs;
import cucumber.api.java.en.Then;
import pagesObjectModel.HomePage;

public class HomePageStepdefs {

HomePage homePage = new HomePage(Hooks.driver);
    @Then("Je suis redirigé vers la page d'acceuil")
    public boolean jeSuisRedirigéVersLaPageDAcceuil() {
       return  homePage.verifierQueJesuissurlaHomePage();

    }
}