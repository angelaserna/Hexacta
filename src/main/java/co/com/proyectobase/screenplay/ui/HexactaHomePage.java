package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//@DefaultUrl("https://www.hexacta.com/")
public class HexactaHomePage extends PageObject {

    public static final Target BOTON_BUSQUEDA = Target.the("Boton de busqueda")
            .located(By.xpath("//*[@id='menu-social-menu']/li/ul/li[1]/a"));

    public static final Target CAMPO_BUSQUEDA = Target.the("Campo de busqueda")
            .located(By.id("search-field"));

    public static final Target RESULTADO_BUSQUEDA = Target.the("Resultado de busqueda - Why outsource in Argentina?")
            .locatedBy("//*[@id='post-16474']/div[2]/header/h1/a");
}
