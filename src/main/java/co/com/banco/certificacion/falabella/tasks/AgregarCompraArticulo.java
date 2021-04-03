package co.com.banco.certificacion.falabella.tasks;

import static co.com.banco.certificacion.falabella.userinterface.PaginaBolsaFalabella.BTN_IR_COMPRA;
import static co.com.banco.certificacion.falabella.userinterface.PaginaListaProductosFalabella.BTN_ASEGURAR_PRODUCTO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaListaProductosFalabella.BTN_VER_BOLSA_COMPRAS;

import co.com.banco.certificacion.falabella.interaction.SeleccionarArticulo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarCompraArticulo implements Task {

  private String referenciaArticulo;
  private String coberturaSeguro;

  public AgregarCompraArticulo(String referenciaArticulo, String coberturaSeguro) {
    this.referenciaArticulo = referenciaArticulo;
    this.coberturaSeguro = coberturaSeguro;
  }

  public static AgregarCompraArticulo conNombre(String referenciaArticulo, String coberturaSeguro) {
    return Tasks.instrumented(AgregarCompraArticulo.class, referenciaArticulo, coberturaSeguro);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(SeleccionarArticulo.conNombre(referenciaArticulo));
    actor.attemptsTo(
        Click.on(BTN_ASEGURAR_PRODUCTO.of(coberturaSeguro)),
        Click.on(BTN_VER_BOLSA_COMPRAS),
        Click.on(BTN_IR_COMPRA));
  }
}
