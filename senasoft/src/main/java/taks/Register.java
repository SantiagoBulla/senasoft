package taks;

import models.RegisterModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.RegisterPage;

public class Register implements Task {

   /* RegisterModel registerModel;

    public Register(RegisterModel registerModel) {
        this.registerModel = registerModel;
    }*/


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("1231231").into(RegisterPage.TBL_USERNAME));
        actor.attemptsTo(Enter.theValue("josue@gmail.com").into(RegisterPage.LBL_EMAIL));
        actor.attemptsTo(Enter.theValue("@eueur_@renj").into(RegisterPage.LBL_PASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.CHECK_BOX));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Register Enter(){
        return Tasks.instrumented(Register.class);
    }
}
