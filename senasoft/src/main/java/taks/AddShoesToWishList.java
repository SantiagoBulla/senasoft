package taks;

import interactions.ClickOnComponentElementInteraction;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;
import userinterfaces.MenuComponent;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AddShoesToWishList implements Task {

    public static AddShoesToWishList addToWishList(){
        return instrumented(AddShoesToWishList.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOnComponentElementInteraction.componentClick(MenuComponent.SHOES_LINK));

    }
}
