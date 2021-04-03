package co.com.banco.certificacion.falabella.tasks;

import static co.com.banco.certificacion.falabella.userinterface.PaginaGoogle.LINK_FALABELLA;
import static co.com.banco.certificacion.falabella.userinterface.PaginaGoogle.TXT_BUSCADOR_GOOGLE;
import static co.com.banco.certificacion.falabella.userinterface.PaginaInicioFalabella.BTN_CLOSE_AVISO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaInicioFalabella.BTN_DENEGAR_ALERTA_REGISTRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


public class IngresarDesdeGoogle implements Task {

  private String nombrePagina;

  public IngresarDesdeGoogle(String nombrePagina) {
    this.nombrePagina = nombrePagina;
  }


  public static IngresarDesdeGoogle ToPagina(String nombrePagina) {
    return instrumented(IngresarDesdeGoogle.class, nombrePagina);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(nombrePagina).into(TXT_BUSCADOR_GOOGLE).thenHit(Keys.ENTER),
        Click.on(LINK_FALABELLA),
        Click.on(BTN_CLOSE_AVISO),
        Click.on(BTN_DENEGAR_ALERTA_REGISTRO));
  }
}
