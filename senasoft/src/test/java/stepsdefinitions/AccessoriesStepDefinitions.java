package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AccessoriesStepDefinitions{

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("the user is the Accessories page")
    public void theUserIsTheAccessoriesPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo();
    }

    @When("the user clicks on waller option")
    public void theUserClicksOnWallerOption() {

    }

    @When("the user see the result of their search")
    public void theUserSeeTheResultOfTheirSearch() {

    }


    @When("the user Clicks on wallet option and Sees the result of their search")
    public void theUserClicksOnWalletOptionAndSeesTheResultOfTheirSearch() {

    }


    @And("the user Clicks the favorite option")
    public void theUserClicksTheFavoriteOption() {

    }
    @And("the user Clicks on añadir a la lista de deseos")
    public void theUserClicksOnAñadirALaListaDeDeseos() {

    }
    @Then("the product is added to the wishlist")
    public void theProductIsAddedToTheWishlist() {

    }

    @After
    public void tearDown(){
        hisBrowser.quit();
    }

}
