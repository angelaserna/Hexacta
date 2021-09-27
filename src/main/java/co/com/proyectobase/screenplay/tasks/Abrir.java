package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.HexactaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    HexactaHomePage hexactaHomePage;

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(hexactaHomePage));
    }

    public static Abrir laPaginadeHexacta() {
        return Tasks.instrumented(Abrir.class);
    }
}
