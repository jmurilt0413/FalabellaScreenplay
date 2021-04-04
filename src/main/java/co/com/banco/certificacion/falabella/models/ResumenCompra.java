package co.com.banco.certificacion.falabella.models;

public class ResumenCompra {

  @Override
  public String toString() {
    return "ResumenCompra{" +
        "nombreCecular='" + nombreCecular + '\'' +
        ", marcaEmpresa='" + marcaEmpresa + '\'' +
        ", valorTotal='" + valorTotal + '\'' +
        ", valorCelular='" + valorCelular + '\'' +
        ", valorSeguro='" + valorSeguro + '\'' +
        ", cantidadProducto='" + cantidadProducto + '\'' +
        ", codigo='" + codigo + '\'' +
        '}';
  }

  public ResumenCompra(String nombreCecular, String marcaEmpresa, String valorTotal,
      String valorCelular, String valorSeguro, String cantidadProducto, String codigo) {
    this.nombreCecular = nombreCecular;
    this.marcaEmpresa = marcaEmpresa;
    this.valorTotal = valorTotal;
    this.valorCelular = valorCelular;
    this.valorSeguro = valorSeguro;
    this.cantidadProducto = cantidadProducto;
    this.codigo = codigo;
  }

  private final String nombreCecular;
  private final String marcaEmpresa;
  private final String valorTotal;
  private final String valorCelular;
  private final String valorSeguro;
  private final String cantidadProducto;
  private final String codigo;

}
