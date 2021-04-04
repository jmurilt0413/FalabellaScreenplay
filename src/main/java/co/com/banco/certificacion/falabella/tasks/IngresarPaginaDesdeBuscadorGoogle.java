package co.com.banco.certificacion.falabella.tasks;

import static co.com.banco.certificacion.falabella.userinterface.PaginaInicioGoogle.LINK_FALABELLA;
import static co.com.banco.certificacion.falabella.userinterface.PaginaInicioGoogle.TXT_BUSCADOR_GOOGLE;
import static co.com.banco.certificacion.falabella.userinterface.PaginaInicioFalabella.BTN_CERRAR_AVISO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaInicioFalabella.BTN_NO_GRACIAS_ALERTA_REGISTRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


public class IngresarPaginaDesdeBuscadorGoogle implements Task {

  private final String nombrePagina;

  public IngresarPaginaDesdeBuscadorGoogle(String nombrePagina) {
    this.nombrePagina = nombrePagina;
  }


  public static IngresarPaginaDesdeBuscadorGoogle Pagina(String nombrePagina) {
    return instrumented(IngresarPaginaDesdeBuscadorGoogle.class, nombrePagina);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(nombrePagina).into(TXT_BUSCADOR_GOOGLE).thenHit(Keys.ENTER),
        Click.on(LINK_FALABELLA),
        Click.on(BTN_CERRAR_AVISO),
        Click.on(BTN_NO_GRACIAS_ALERTA_REGISTRO));
  }
}
