package taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import userinterfaces.MenuComponent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnUserIconTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.ACCOUNT_ICON));
    }

    public static ClickOnUserIconTask clickuserIcon(){
        return instrumented(ClickOnUserIconTask.class);
    }
}
