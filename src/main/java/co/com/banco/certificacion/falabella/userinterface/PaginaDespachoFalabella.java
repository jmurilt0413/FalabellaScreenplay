package co.com.banco.certificacion.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaDespachoFalabella {

  public static final Target LBL_NOMBRE_CELULAR = Target.the("Nombre celular")
      .locatedBy("//*[@class='fbra_text fbra_test_orderSummary__itemProperty fbra_orderSummary__itemProperty__name']");

public static final Target LBL_MARCA_EMPRESA = Target.the("Nombre celular")
      .locatedBy("//*[@class='fbra_text fbra_test_orderSummary__itemProperty fbra_orderSummary__itemProperty']");

  public static final Target LBL_CANTIDAD_PRODUCTOS = Target.the("Cantidad productos")
      .locatedBy("//*[@class='fbra_text fbra_test_orderSummary__numberOfItems fbra_orderSummary__numberOfItems']/span");

  public static final Target LBL_CODIGO_PRODUCTO = Target.the("Codigo productos")
      .locatedBy("//*[@class='fbra_text fbra_orderSummary__itemProperty--no-capital fbra_test_orderSummary__quantity_and_sku']");

  public static final Target LBL_PRECIO_TOTAL_ARTICULO = Target.the("Precio total artículo")
      .locatedBy("//*[@class='fbra_text fbra_test_orderSummary__totalCostPrice fbra_orderSummary__totalCostPrice']");

  public static final Target LBL_PRECIOS_RESUMEN = Target.the("Precio total artículo")
      .locatedBy("//*[@class='fbra_text fbra_test_orderSummary__itemPrice fbra_orderSummary__itemPrice']");

  public static final Target LBL_PRECIOS_RESUMEN_2 = Target.the("Precios detalle")
      .locatedBy("//*[@class='fbra_text fbra_test_orderSummary__itemPrice fbra_orderSummary__itemPrice' and contains(text(),'{0}')]");


}
