package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    //Login locators
    public static final Target TXT_USERNAME = Target.the("Campo para ingreso de cedula en el login")
            .locatedBy("//input[@id='username']");
    public static final Target TXT_PASSWORD = Target.the("Campo para ingreso de la contraseña en el login")
            .locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN_SUBMIT = Target.the("Boton para el ingreso al sitio web")
            .locatedBy("//button[@name='login']");

    //Register locators
    public static final Target TXT_REGISTER_PASSWORD = Target.the("Campo para ingreso de la contraseña en el registro")
            .locatedBy("//input[@id='reg_email']");
}
