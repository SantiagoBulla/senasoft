package taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.MenuComponent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    public static LoginTask validateCredentials(){
        return instrumented(LoginTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
