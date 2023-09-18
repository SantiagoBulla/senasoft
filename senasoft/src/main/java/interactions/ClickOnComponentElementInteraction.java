package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnComponentElementInteraction implements Interaction {

    private final Target LOCATOR;

    public ClickOnComponentElementInteraction(Target locator) {
        LOCATOR = locator;
    }

    public static ClickOnComponentElementInteraction componentClick(Target LOCATOR){
        return instrumented(ClickOnComponentElementInteraction.class,LOCATOR);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOCATOR));
    }
}
