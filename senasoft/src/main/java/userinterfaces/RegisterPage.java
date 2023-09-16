package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target TBL_USERNAME = Target
            .the("enter the username")
            .locatedBy("//*[@id=\"reg_username\"]");

    public static final  Target LBL_EMAIL = Target
            .the("enter the email addres")
            .locatedBy("//input[@id='reg_email']");

    public static final Target LBL_PASSWORD = Target
            .the("enter the password")
            .locatedBy("//input[@id='reg_password']");

    public static final Target CHECK_BOX = Target
            .the("click on check box")
            .locatedBy("//*[@id=\"newsletter_authorization\"]");

    public static final Target BTN_REGISTER = Target
            .the("click on button register")
            .locatedBy("//button[@value='Registrarse']");
}
