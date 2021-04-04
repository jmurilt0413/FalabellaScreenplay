package co.com.banco.certificacion.falabella.questions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_PRECIOS_RESUMEN;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PrecioArticulo implements Question<String> {


  public static PrecioArticulo valor() {
    return new PrecioArticulo();
  }

  @Override
  public String answeredBy(Actor actor) {
    return LBL_PRECIOS_RESUMEN.resolveAllFor(theActorInTheSpotlight()).get(0)
        .getText().replace("$", "");

  }
}
