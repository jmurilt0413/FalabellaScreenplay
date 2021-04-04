package co.com.banco.certificacion.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaInicioFalabella {

  public static final Target BTN_CERRAR_AVISO = Target.the("Botón cerrar aviso")
      .locatedBy("//*[@id= 'lightbox-close']");

  public static final Target BTN_NO_GRACIAS_ALERTA_REGISTRO = Target
      .the("Botón 'No gracias' alerta registro")
      .locatedBy("//*[@id='acc-alert-deny']");

  public static final Target TXT_BOX_BUSCAR = Target.the("Texto de busqueda")
      .locatedBy("//div[@class='flex-grow-1']//input[@data-testid='input-search-box']");

  public static final Target LBL_ARTICULO = Target.the("Texto de busqueda")
      .locatedBy("//a[@data-testid='first-suggestion']");
}
