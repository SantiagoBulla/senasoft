package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {
    public static final Target ACCOUNT_ICON = Target.the("Icono de usuario para acceder al login o al apartado acount").
            locatedBy("//div[@class='myaccount']");


    public static final Target ACCESSORIES_LINK = Target.the("link to accessories module")
            .locatedBy("//div[@class='categories_menu']/div//li[4]//a");



}
