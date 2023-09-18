package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccessoriesPage {
    public static final Target FIRST_PRODUCTO = Target.the("first result of the search")
            .locatedBy("//ul[contains(@class,'products ')]//li[1]//a/img");

    public static final Target BTN_ADD_WISHLIST = Target.the("btn to add products to the wishlist")
            .locatedBy("//span[@class='tinvwl_add_to_wishlist-text']");

}
