package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SubMenuComponent {

    public static final Target WALLET_LINK = Target.the("link to accessories sub-module")
            .locatedBy("//div[@class='product_cats']//li[2]/a");


}