# language: es

Característica: Validar la compra de un celular en Falabella
  Yo como usuario de Falabella
  deseo comprar un celular
  para verificar el estado del resumen de la orden

  Escenario: Validar el resumen de la orden para la compra de un celular
    Dado que René ingresa a la página de Falabella desde el buscador de Google
    Cuando René busca por celulares
    E inicia una intención de compra para un "Celular xiaomi poco x3 64gb 6gb ram gris" con seguro "Asegura tu Pantalla"
    Entonces el resumen de la orden es
      | Nombre Celular        | Celular xiaomi poco x3 64gb 6gb ram gris |
      | Marca                 | XIAOMI                                   |
      | Valor total           | 1.399.800                                |
      | Valor celular         | 1.299.900                                |
      | Valor seguro          | 99.900                                   |
      | Cantidad de productos | 1                                        |
      | Codigo                | 11801115                                 |