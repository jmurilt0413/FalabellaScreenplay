package co.com.banco.certificacion.falabella.userinterface;


import net.serenitybdd.screenplay.targets.Target;

public final class PaginaGoogle {

  public static final Target TXT_BUSCADOR_GOOGLE = Target.the("Buscador google")
      .locatedBy("//*[@title='Buscar']");
  public static final Target LINK_FALABELLA = Target.the("Página Falabella")
      .locatedBy("//*[@href='https://www.falabella.com.co/falabella-co/']");
  public static final Target BTN_BUSCAR_GOOGLE = Target.the("Boton buscar con google")
      .locatedBy("//input[@value='Buscar con Google']");

}
