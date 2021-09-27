package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Verificar {

    private Verificar(){}

    public static Question<Boolean> contieneElResultado(String resultadoEsperado, Target textoEnFront) {
        return new Resultado(resultadoEsperado, textoEnFront);
    }

}
