package co.com.banco.certificacion.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaListaProductosFalabella {

  public static final Target LISTA_ARTICULOS = Target.the("Lista artículos")
      .locatedBy("//*[@class='jsx-1585533350 search-results-list']");

}
