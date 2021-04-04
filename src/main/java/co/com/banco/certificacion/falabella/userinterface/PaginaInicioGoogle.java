package co.com.banco.certificacion.falabella.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://google.com")
public class PaginaInicioGoogle extends PageObject {

  public static final Target TXT_BUSCADOR_GOOGLE = Target.the("Buscador de google")
      .locatedBy("//*[@title='Buscar']");

  public static final Target LINK_FALABELLA = Target.the("Página de Falabella")
      .locatedBy("//*[@href='https://www.falabella.com.co/falabella-co/']");
}
