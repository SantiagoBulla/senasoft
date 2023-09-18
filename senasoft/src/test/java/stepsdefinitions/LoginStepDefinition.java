package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.LoginModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.LoginValidator;
import taks.LoginTask;
import userinterfaces.MenuComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {
        //configurar el scenario
        OnStage.setTheStage(Cast.ofStandardActors());
        //crear el actor
        OnStage.theActorCalled("user");
        //dar habilidades para abrir el navegador
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    //convertir la data table en un objeto de tipo LoginModel
    @DataTableType
    public LoginModel userData(Map<String, String> value) {//metodo de configuracion para trabajar con data tables
        return new LoginModel(//constructor del modelo
                value.get("document"),
                value.get("password"));
    }

    @Given("that the user is the login page")
    public void thatTheUserIsTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
        OnStage.theActorInTheSpotlight().wasAbleTo(Click.on(MenuComponent.ACCOUNT_ICON));
    }

    @When("he enter the correct credentials")
    public void heEnterTheCorrectCredentials(List<LoginModel> credentialsList) {
        LoginModel credentials;
        credentials = credentialsList.get(0);//tomar los datos de la data table como valores para la validacion
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.validateCredentials(credentials));//llamar metodo task
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("he should be redirected to the main page")
    public void heShouldBeRedirectedToTheMainPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginValidator.isAddressVisible(),
                Matchers.is("MI SALDO")));//Validacion de logueo exitoso
        hisBrowser.quit();//matar el driver
    }


    //Escenario de logueo fallido
    @When("he enter an invalid credentials")
    public void heEnterAnInvalidCredentials() {

    }

    @Then("he should see an error alert")
    public void heShouldSeeAnErrorAlert() {
    }
}
