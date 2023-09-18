package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnElementPageInteraction implements Interaction {

    private final Target LOCATOR;

    public ClickOnElementPageInteraction(Target locator) {
        LOCATOR = locator;
    }

    public static ClickOnElementPageInteraction componentClick(Target LOCATOR){
        return instrumented(ClickOnElementPageInteraction.class,LOCATOR);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOCATOR));
    }
}
