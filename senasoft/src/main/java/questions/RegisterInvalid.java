package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.LoginPage;

public class RegisterInvalid implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPage.TXT_ERROR_REGISTER).viewedBy(actor).asString();
    }

    public static RegisterInvalid registerInvalid () {
        return new RegisterInvalid();
    }
}
