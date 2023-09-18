package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ShoesStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("that the user is on the shoes section")
    public void thatTheUserIsOnTheShoesSection() {

    }

    @When("the user clicks on heart button into a product card")
    public void theUserClicksOnHeartButtonIntoAProductCard() {

    }

    @And("the user clicks on user component to go to the account section")
    public void theUserClicksOnUserComponentToGoToTheAccountSection() {

    }

    @And("the user clicks on the wish list option")
    public void theUserClicksOnTheWishListOption() {

    }

    @Then("he should see the product added on the wish list")
    public void heShouldSeeTheProductAddedOnTheWishList() {

    }

}
