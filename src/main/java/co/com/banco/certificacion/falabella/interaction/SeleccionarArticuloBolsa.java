package co.com.banco.certificacion.falabella.interaction;

import static co.com.banco.certificacion.falabella.userinterface.PaginaListaProductosFalabella.LBL_ARTICULO_BUSCADO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaListaProductosFalabella.BTN_AGREGAR_BOLSA_ARTICULO_BUSCADO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaListaProductosFalabella.BTN_SIGUIENTE_PAGINA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarArticuloBolsa implements Interaction {

  private final String nombreArticulo;

  public SeleccionarArticuloBolsa(String nombreArticulo) {
    this.nombreArticulo = nombreArticulo;
  }

  public static SeleccionarArticuloBolsa conNombre(String nombreArticulo) {
    return instrumented(SeleccionarArticuloBolsa.class, nombreArticulo);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    while (!LBL_ARTICULO_BUSCADO.of(nombreArticulo).resolveFor(actor).isVisible()) {
      actor.attemptsTo(Click.on(BTN_SIGUIENTE_PAGINA));
    }
    actor.attemptsTo(Click.on(BTN_AGREGAR_BOLSA_ARTICULO_BUSCADO.of(nombreArticulo)));
  }

}