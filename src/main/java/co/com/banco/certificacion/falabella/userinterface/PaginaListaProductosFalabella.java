package co.com.banco.certificacion.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class PaginaListaProductosFalabella {

  public static final Target LBL_ARTICULO_BUSCADO = Target.the("ArtÍculo a buscar")
      .locatedBy("//div[contains(@class,'search-results-list')]//b[contains(text(),'{0}')]");

  public static final Target BTN_SIGUIENTE_PAGINA = Target.the("Siguiente pagina de productos")
      .locatedBy("//i[contains(@class,'csicon-arrow_right')]");

  public static final Target BTN_AGREGAR_BOLSA_ARTICULO_BUSCADO = Target
      .the("Botón agregar bolsa artículo encontrado")
      .locatedBy(
          "//div[contains(@class,'search-results-list')]//b[contains(text(),'{0}')]/ancestor::div[@class='jsx-1585533350 search-results-list']//a//div[@class='jsx-1423318988 pod-action']");

  public static final Target BTN_VER_BOLSA_COMPRAS = Target.the("Botón ver bolsa de compras")
      .located(By.id("linkButton"));

}
