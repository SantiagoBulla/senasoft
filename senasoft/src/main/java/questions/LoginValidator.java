package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.AccountPage;

public class LoginValidator implements Question {

    //retornar el elemento con el cual se pretende hacer la validacion
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AccountPage.TXT_ADDRESS).viewedBy(actor).asString();
    }

    public static LoginValidator isAddressVisible(){
        return new LoginValidator();
    }
}
