package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.RegisterModel;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import taks.Register;

import java.util.List;

public class RegisterStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("the user is in the login page")
    public void theUserIsInTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/mi-cuenta/"));
    }

    @When("the user enter the credentials")
    public void theUserEnterTheCredentials() {
        /* RegisterModel registerModel;
        registerModel = registerModelList.get(0);*/
        /*OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.bon-bonite.com/mi-cuenta/"));*/
        OnStage.theActorInTheSpotlight().attemptsTo(Register.Enter());
    }

    @Then("the user should be redirect to the main page")
    public void theUserShouldBeRedirectToTheMainPage() {

    }

}
