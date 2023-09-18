package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccountPage {
    //Mapeo de localizadores del apartado 'www.bon-bonite.com/mi-cuenta/'
    public static final Target TXT_ADDRESS = Target.the("Elemento de navegacion para editar direccion del usuario")
            .locatedBy("//*[contains(text(),'Mi saldo')]");
}
