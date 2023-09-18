package taks;

import models.RegisterModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.LoginPage;

public class Register implements Task {

   RegisterModel credentials;


    public Register(RegisterModel credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getDocument()).into(LoginPage.TXT_REGISTER_USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getEmail()).into(LoginPage.TXT_REGISTER_EMAIL));
        actor.attemptsTo(Scroll.to(LoginPage.TXT_REGISTER_EMAIL));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_REGISTER_PASSWORD_2));
        actor.attemptsTo(Scroll.to(LoginPage.TXT_REGISTER_PASSWORD_2));
        actor.attemptsTo(Click.on(LoginPage.CHECK_BOX));
        actor.attemptsTo(Click.on(LoginPage.BTN_REGISTER));
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
