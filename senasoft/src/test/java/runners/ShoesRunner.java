package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/shoes.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "stepsdefinitions"

)
public class ShoesRunner {
}
