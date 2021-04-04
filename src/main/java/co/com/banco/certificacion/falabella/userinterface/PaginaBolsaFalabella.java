package co.com.banco.certificacion.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaBolsaFalabella {

  public static final Target BTN_IR_COMPRA = Target.the("Boton ir a compra")
      .locatedBy("//div[@class='fb-order-status__cta']");

  public static final Target LST_COBERTURAS_SEGURO = Target.the("lista de coberturas a asegurar")
      .locatedBy(
          "//*[@class='fb-warranty-dropdown fb-inline-dropdown__link js-inline-dropdown__link']");

  public static final Target OPCION_COBERTURAS_SEGURO = Target.the("Opción cobertura seguro")
      .locatedBy(
          "//*[@class='fb-inline-dropdown__item-link' and contains(text(),'{0}')]");
}
