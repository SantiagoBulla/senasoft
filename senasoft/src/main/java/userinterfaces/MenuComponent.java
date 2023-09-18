package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {
    public static final Target ACCOUNT_ICON = Target.the("User icon to access login or account section")
            .locatedBy("//div[@class='myaccount']");

    public static final Target SHOES_LINK = Target.the("link element to access the shoes section")
            .locatedBy("//div/ul/li[@id='menu-item-10']");
}
