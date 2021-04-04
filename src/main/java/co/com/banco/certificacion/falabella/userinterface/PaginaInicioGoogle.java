package co.com.banco.certificacion.falabella.userinterface;


import net.serenitybdd.screenplay.targets.Target;

public final class PaginaInicioGoogle {

  public static final Target TXT_BUSCADOR_GOOGLE = Target.the("Buscador de google")
      .locatedBy("//*[@title='Buscar']");

  public static final Target LINK_FALABELLA = Target.the("Página de Falabella")
      .locatedBy("//*[@href='https://www.falabella.com.co/falabella-co/']");
}
