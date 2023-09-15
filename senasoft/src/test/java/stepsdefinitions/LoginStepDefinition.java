package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class LoginStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        //configurar el scenario
        OnStage.setTheStage(Cast.ofStandardActors());
        //crear el actor
        OnStage.theActorCalled("user");
        //dar habilidades para abrir el navegador
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("that the user is the login page")
    public void thatTheUserIsTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }
    @When("he enter the correct credentials")
    public void heEnterTheCorrectCredentials(Map<String, String> userData) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }
    @Then("he should be redirected to the main page")
    public void heShouldBeRedirectedToTheMainPage() {

    }


}
