package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccountPage {
    public static final Target TXT_ADDRESS = Target.the("Elemento de navegacion para editar direccion del usuario")
            .locatedBy("//*[contains(text(),'Mi saldo')]");
}
