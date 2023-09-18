package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {
    public static final Target ACCOUNT_ICON = Target.the("Icono de usuario para acceder al login o al apartado acount").
            locatedBy("//div[@class='myaccount']");

}
