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
import taks.ClickOnUserIconTask;
import taks.GoToShoesSectionTask;

public class ShoesStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("that the user is on the shoes section")
    public void thatTheUserIsOnTheShoesSection() {
        OnStage.theActorInTheSpotlight().wasAbleTo(GoToShoesSectionTask.goToSection());
    }

    @When("the user clicks on heart button into a product card")
    public void theUserClicksOnHeartButtonIntoAProductCard() {

    }


    @And("the user go to wish list section")
    public void theUserGoToWishListSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnUserIconTask.clickuserIcon());
    }

    @Then("he should see the product added on the wish list")
    public void heShouldSeeTheProductAddedOnTheWishList() {

    }

}
