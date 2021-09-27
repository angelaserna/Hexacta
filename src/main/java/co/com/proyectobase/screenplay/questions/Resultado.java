package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Resultado implements Question<Boolean> {

    private String resultadoEsperado;
    private Target textoEnFront;

    public Resultado(String resultadoEsperado, Target textoEnFront) {
        this.resultadoEsperado = resultadoEsperado;
        this.textoEnFront = textoEnFront;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(textoEnFront, WebElementStateMatchers.isVisible()));
        String obtainedResult = textoEnFront.resolveFor(actor).getText();
        return obtainedResult.contains(resultadoEsperado);
    }
}
