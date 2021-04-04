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

  private String nombreCecular;

  public String getNombreCecular() {
    return nombreCecular;
  }

  public void setNombreCecular(String nombreCecular) {
    this.nombreCecular = nombreCecular;
  }

  public String getMarcaEmpresa() {
    return marcaEmpresa;
  }

  public void setMarcaEmpresa(String marcaEmpresa) {
    this.marcaEmpresa = marcaEmpresa;
  }

  public String getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(String valorTotal) {
    this.valorTotal = valorTotal;
  }

  public String getValorCelular() {
    return valorCelular;
  }

  public void setValorCelular(String valorCelular) {
    this.valorCelular = valorCelular;
  }

  public String getValorSeguro() {
    return valorSeguro;
  }

  public void setValorSeguro(String valorSeguro) {
    this.valorSeguro = valorSeguro;
  }

  public String getCantidadProducto() {
    return cantidadProducto;
  }

  public void setCantidadProducto(String cantidadProducto) {
    this.cantidadProducto = cantidadProducto;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  private String marcaEmpresa;
  private String valorTotal;
  private String valorCelular;
  private String valorSeguro;
  private String cantidadProducto;
  private String codigo;

}
