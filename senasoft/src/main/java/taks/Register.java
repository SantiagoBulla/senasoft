package taks;

import models.RegisterModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.RegisterPage;

public class Register implements Task {

   RegisterModel credentials;


    public Register(RegisterModel credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getDocument()).into(RegisterPage.TBL_USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getEmail()).into(RegisterPage.LBL_EMAIL));
        actor.attemptsTo(Scroll.to(RegisterPage.TBL_USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(RegisterPage.LBL_PASSWORD));
        actor.attemptsTo(Scroll.to(RegisterPage.LBL_PASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.CHECK_BOX));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Register Enter(RegisterModel credentials){
        return Tasks.instrumented(Register.class,credentials);
    }
}
