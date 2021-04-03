package co.com.banco.certificacion.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaInicioFalabella {

  public static final Target BTN_CLOSE_AVISO = Target.the("Boton cerrar aviso")
      .locatedBy("//*[@id= 'lightbox-close']");

  public static final Target BTN_DENEGAR_ALERTA_REGISTRO = Target
      .the("Boton denegar alerta registro")
      .locatedBy("//*[@id='acc-alert-deny']");

  public static final Target TXT_BOX_BUSCAR = Target.the("Texto de busqueda")
      .locatedBy("//div[@class='flex-grow-1']//input[@data-testid='input-search-box']");
}
