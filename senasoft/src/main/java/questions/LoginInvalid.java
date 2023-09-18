package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.LoginPage;

public class LoginInvalid implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(LoginPage.TXT_ERROR_LOGIN).viewedBy(actor).resolve();//retorna true si el target esta activo

    }

    public static LoginInvalid rejectLogin(){
        return new LoginInvalid();
    }
}
