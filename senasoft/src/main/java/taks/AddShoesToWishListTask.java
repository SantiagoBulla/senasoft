package taks;

import interactions.ClickOnComponentElementInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import userinterfaces.MenuComponent;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AddShoesToWishListTask implements Task {

    public static AddShoesToWishListTask addToWishList(){
        return instrumented(AddShoesToWishListTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


    }
}
