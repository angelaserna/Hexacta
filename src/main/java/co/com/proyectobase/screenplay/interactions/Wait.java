package co.com.proyectobase.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Wait implements Interaction {
	
	private int seconds; 	

	public Wait(int seconds) {		
		this.seconds = seconds;
	}

	public static Wait elementIsVisible(int var) {
		return instrumented(Wait.class, var);
	}	

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			TimeUnit.SECONDS.sleep(this.seconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
	}

}
