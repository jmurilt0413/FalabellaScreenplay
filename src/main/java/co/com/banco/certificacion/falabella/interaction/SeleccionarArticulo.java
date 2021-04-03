package co.com.banco.certificacion.falabella.interaction;

import static co.com.banco.certificacion.falabella.userinterface.PaginaListaProductosFalabella.ARTICULO_BUSCADO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaListaProductosFalabella.BTN_AGREGAR_BOLSA_ARTICULO_BUSCADO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaListaProductosFalabella.SIGUIENTE_PAGINA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarArticulo implements Interaction {

  private String referenciaArticulo;

  public SeleccionarArticulo(String referenciaArticulo) {
    this.referenciaArticulo = referenciaArticulo;
  }

  public static SeleccionarArticulo conNombre(String referenciaArticulo) {
    return Tasks.instrumented(SeleccionarArticulo.class, referenciaArticulo);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    while (!ARTICULO_BUSCADO.of(referenciaArticulo).resolveFor(actor).isVisible()) {
      actor.attemptsTo(Click.on(SIGUIENTE_PAGINA));
    }
    actor.attemptsTo(Click.on(BTN_AGREGAR_BOLSA_ARTICULO_BUSCADO.of(referenciaArticulo)));
  }

}