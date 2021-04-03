package co.com.banco.certificacion.falabella.questions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_CANTIDAD_PRODUCTOS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Cantidad implements Question<String> {

  public static Cantidad productos() {
    return new Cantidad();
  }

  @Override
  public String answeredBy(Actor actor) {
    return LBL_CANTIDAD_PRODUCTOS.resolveFor(actor).getText().replace("(", "").replace(")", "");
  }
}
