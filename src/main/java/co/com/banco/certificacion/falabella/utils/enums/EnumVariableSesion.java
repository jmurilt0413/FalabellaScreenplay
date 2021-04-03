package co.com.banco.certificacion.falabella.utils.enums;

public enum EnumVariableSesion {
  PRECIO_ARTICULO_PAGINA("Precio artículo"),
  PRECIO_SEGURO_PAGINA("Precio seguro");

  private final String variableSesion;

  public String getVariableSesion() {
    return variableSesion;
  }

  EnumVariableSesion(String variableSesion) {
    this.variableSesion = variableSesion;
  }
}
