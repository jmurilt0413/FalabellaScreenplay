package co.com.banco.certificacion.falabella.questions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.PRECIO_TOTAL_ARTICULO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PrecioTotal implements Question<String> {

  public static PrecioTotal conValor() {
    return new PrecioTotal();
  }

  @Override
  public String answeredBy(Actor actor) {
    return PRECIO_TOTAL_ARTICULO.resolveFor(actor).getText().replace("$", "");
  }
}
