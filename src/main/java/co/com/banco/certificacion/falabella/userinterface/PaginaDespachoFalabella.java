package co.com.banco.certificacion.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaDespachoFalabella {

  public static final Target LBL_REFERENCIA_CELULAR = Target.the("Referencia del celular")
      .locatedBy(
          "//*[@class='fbra_text fbra_test_orderSummary__itemProperty fbra_orderSummary__itemProperty__name']");

  public static final Target LBL_MARCA_CELULAR = Target.the("Marca del celular")
      .locatedBy(
          "//*[@class='fbra_text fbra_test_orderSummary__itemProperty fbra_orderSummary__itemProperty']");

  public static final Target LBL_CANTIDAD_PRODUCTOS = Target
      .the("Cantidad de productos en resumen")
      .locatedBy(
          "//*[@class='fbra_text fbra_test_orderSummary__numberOfItems fbra_orderSummary__numberOfItems']/span");

  public static final Target LBL_CODIGO_PRODUCTO = Target.the("Código de producto")
      .locatedBy(
          "//*[@class='fbra_text fbra_orderSummary__itemProperty--no-capital fbra_test_orderSummary__quantity_and_sku']");

  public static final Target LBL_PRECIO_TOTAL_ARTICULO = Target.the("Precio total del artículo")
      .locatedBy(
          "//*[@class='fbra_text fbra_test_orderSummary__totalCostPrice fbra_orderSummary__totalCostPrice']");

  public static final Target LBL_PRECIOS_RESUMEN = Target
      .the("Etiqueta con precios articulo/seguro")
      .locatedBy(
          "//*[@class='fbra_text fbra_test_orderSummary__itemPrice fbra_orderSummary__itemPrice']");
}
