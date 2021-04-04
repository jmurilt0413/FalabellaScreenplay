package co.com.banco.certificacion.falabella.tasks;

import static co.com.banco.certificacion.falabella.userinterface.PaginaBolsaFalabella.BTN_IR_COMPRA;
import static co.com.banco.certificacion.falabella.userinterface.PaginaBolsaFalabella.LST_COBERTURAS_SEGURO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaBolsaFalabella.OPCION_COBERTURAS_SEGURO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaListaProductosFalabella.BTN_VER_BOLSA_COMPRAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.banco.certificacion.falabella.interaction.SeleccionarArticuloBolsa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarArticuloDespacho implements Task {

  private final String nombreArticulo;
  private final String coberturaSeguro;

  public AgregarArticuloDespacho(String nombreArticulo, String coberturaSeguro) {
    this.nombreArticulo = nombreArticulo;
    this.coberturaSeguro = coberturaSeguro;
  }

  public static AgregarArticuloDespacho conDatos(String nombreArticulo,
      String coberturaSeguro) {
    return instrumented(AgregarArticuloDespacho.class, nombreArticulo, coberturaSeguro);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(SeleccionarArticuloBolsa.conNombre(nombreArticulo));
    actor.attemptsTo(
        Click.on(BTN_VER_BOLSA_COMPRAS),
        Click.on(LST_COBERTURAS_SEGURO),
        Click.on(OPCION_COBERTURAS_SEGURO.of(coberturaSeguro)),
        Click.on(BTN_IR_COMPRA));
  }
}
