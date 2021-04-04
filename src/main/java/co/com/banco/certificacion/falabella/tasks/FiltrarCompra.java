package co.com.banco.certificacion.falabella.tasks;

import static co.com.banco.certificacion.falabella.userinterface.PaginaInicioFalabella.LBL_ARTICULO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaInicioFalabella.TXT_BOX_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FiltrarCompra implements Task {

  private String nombreProducto;

  public FiltrarCompra(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public static FiltrarCompra porArticulo(String nombreProducto) {
    return instrumented(FiltrarCompra.class, nombreProducto);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(nombreProducto).into(TXT_BOX_BUSCAR),
        Click.on(LBL_ARTICULO));
  }
}
