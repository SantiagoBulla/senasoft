package taks;

import interactions.ClickOnElementPageInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import userinterfaces.MenuComponent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToShoesSectionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOnElementPageInteraction.componentClick(MenuComponent.SHOES_LINK));
    }

    public static GoToShoesSectionTask goToSection(){
        return instrumented(GoToShoesSectionTask.class);
    }
}
