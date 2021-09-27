package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.proyectobase.screenplay.ui.HexactaHomePage.BOTON_BUSQUEDA;
import static co.com.proyectobase.screenplay.ui.HexactaHomePage.CAMPO_BUSQUEDA;

public class Buscar implements Task {

    private String palabra;

    public Buscar(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.elementIsVisible(3));
        actor.attemptsTo(Click.on(BOTON_BUSQUEDA));
        actor.attemptsTo(Enter.theValue(palabra).into(CAMPO_BUSQUEDA));
        CAMPO_BUSQUEDA.resolveFor(actor).sendKeys(Keys.ENTER);
    }

    public static Buscar laPalabra(String palabra) {
        return Tasks.instrumented(Buscar.class, palabra);
    }

}
