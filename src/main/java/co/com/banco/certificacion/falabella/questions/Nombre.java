package co.com.banco.certificacion.falabella.questions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_REFERENCIA_CELULAR;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Nombre implements Question<String> {

  public static Nombre celular() {
    return new Nombre();
  }

  @Override
  public String answeredBy(Actor actor) {
    return LBL_REFERENCIA_CELULAR.resolveFor(actor).getText();
  }
}
