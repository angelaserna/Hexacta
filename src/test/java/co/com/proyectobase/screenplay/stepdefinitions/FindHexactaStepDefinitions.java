package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.Verificar;
import co.com.proyectobase.screenplay.tasks.Buscar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.proyectobase.screenplay.ui.HexactaHomePage.RESULTADO_BUSQUEDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FindHexactaStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor actor = Actor.named("usuario");

    @Before
    public void configuracionInicial(){
        actor.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Que el usuario quiere buscar una palabra en Hexacta$")
    public void queElUsuarioQuiereBuscarUnaPalabraEnHexacta() {
        actor.wasAbleTo(Open.url("https://www.hexacta.com/"));
        //actor.wasAbleTo(Abrir.laPaginadeHexacta());
    }

    @When("^el realiza la busqueda la palabra (.*)$")
    public void elRealizaLaBusquedaLaPalabraOutsource(String palabra) {
        actor.attemptsTo(Buscar.laPalabra(palabra));
    }

    @Then("^el debe visualizar los resultados se encuentre el texto (.*)$")
    public void elDebeVisualizarLosResultadosSeEncuentreElTextoWhyOutsourceInArgentina(String resultadoEsperado)  {
        actor.should(seeThat(Verificar.contieneElResultado(resultadoEsperado, RESULTADO_BUSQUEDA)));
        //actor.should(seeThat(ElResultado.es(), equalTo(textoEsperado)));
    }
}
