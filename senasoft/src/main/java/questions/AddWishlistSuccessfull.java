package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.AccessoriesPage;
import userinterfaces.SubMenuComponent;

public class AddWishlistSuccessfull implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AccessoriesPage.BTN_ADD_WISHLIST).viewedBy(actor).asString();
    }

    public static AddWishlistSuccessfull confirm (){
        return new AddWishlistSuccessfull();
    }
}
