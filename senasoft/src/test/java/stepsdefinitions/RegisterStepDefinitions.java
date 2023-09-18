package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.RegisterModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.LoginValidator;
import questions.RegisterInvalid;
import taks.RegisterTask;

import java.util.List;
import java.util.Map;

public class RegisterStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    // con esto traigo los datos del datatable
    @DataTableType
    public RegisterModel userData(Map<String, String> value) {//metodo de configuracion para trabajar con data tables
        return new RegisterModel(//constructor del modelo
                value.get("document"),
                value.get("email"),
                value.get("password"));
    }

    @Given("the user is in the login page")
    public void theUserIsInTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/mi-cuenta/"));
    }

    @When("the user enter the credentials")
    public void theUserEnterTheCredentials(List<RegisterModel> credentialsList) {
        RegisterModel credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.Enter(credentials));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Asercion
    @Then("the user should be redirect to the main page")
    public void theUserShouldBeRedirectToTheMainPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginValidator.isAddressVisible()
        , Matchers.is("MI SALDO")));
        hisBrowser.quit();
    }

    // register Failed

    @When("the user enters the failed credentials")
    public void theUserEntersTheFailedCredentials(List<RegisterModel> credentialsList) {
        RegisterModel credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.Enter(credentials));
    }

    @Then("the user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegisterInvalid.registerInvalid()
        , Matchers.is("Autorizo el tratamiento de mis datos personales *")));
        hisBrowser.quit();
    }

    @After
    public void tearDown(){
        hisBrowser.quit();
    }

}
