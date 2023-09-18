package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ClickOnComponentElementInteraction implements Interaction {

    private final Target localor;

    public static ClickOnComponentElementInteraction componentClick(Target locator){
        return instrumented(ClickOnComponentElementInteraction.class,locator);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(localor));
    }
}
