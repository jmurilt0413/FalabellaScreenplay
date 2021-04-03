package co.com.banco.certificacion.falabella.questions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_CODIGO_PRODUCTO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Codigo implements Question<String> {

  public static Codigo numero() {
    return new Codigo();
  }

  @Override
  public String answeredBy(Actor actor) {
    return LBL_CODIGO_PRODUCTO.resolveFor(actor).getText().replace("Código: ", "");
  }
}
