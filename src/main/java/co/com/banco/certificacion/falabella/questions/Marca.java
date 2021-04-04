package co.com.banco.certificacion.falabella.questions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_MARCA_CELULAR;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Marca implements Question<String> {

  public static Marca empresa() {
    return new Marca();
  }

  @Override
  public String answeredBy(Actor actor) {
    return LBL_MARCA_CELULAR.resolveFor(actor).getText();
  }
}
