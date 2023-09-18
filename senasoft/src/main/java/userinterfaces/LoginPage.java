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

    public static final Target TXT_REGISTER_PASSWORD_2 = Target
            .the("enter the password")
            .locatedBy("//input[@id='reg_password']");

    public static final Target TXT_REGISTER_USERNAME = Target
            .the("enter the username")
            .locatedBy("//*[@id=\"reg_username\"]");

    public static final  Target TXT_REGISTER_EMAIL = Target
            .the("enter the email addres")
            .locatedBy("//input[@id='reg_email']");


    public static final Target CHECK_BOX = Target
            .the("click on check box")
            .locatedBy("//input[@id='privacy_policy_reg']");

    public static final Target BTN_REGISTER = Target
            .the("click on button register")
            .locatedBy("//button[@value='Registrarse']");


    // Login
    public static final Target TXT_ERROR_LOGIN = Target.the("Alerta de error al validar el logueo exitoso")
            .locatedBy("//div/ul[@class='woocommerce-error']");

    // Register

    public static final Target TXT_ERROR_REGISTER = Target.the("register title")
            .locatedBy("//*[@class='checkbox woocommerce-form__label woocommerce-form__label-for-checkbox checkbox']");

}
