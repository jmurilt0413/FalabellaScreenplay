package co.com.banco.certificacion.falabella.questions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_PRECIO_TOTAL_ARTICULO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PrecioTotalArticulo implements Question<String> {

  public static PrecioTotalArticulo valor() {
    return new PrecioTotalArticulo();
  }

  @Override
  public String answeredBy(Actor actor) {
    return LBL_PRECIO_TOTAL_ARTICULO.resolveFor(actor).getText().replace("$", "");
  }
}
