# language: es

Característica: Validar la compra de un celular en Falabella
  Yo como usuario de Falabella
  deseo comprar un celular
  para verificar el estado del resumen de la orden

  Escenario: Validar el resumen de la orden para la compra de un celular
    Dado que René ingresa a la página de Falabella desde el buscador de Google
    Cuando René busca por celulares
    E inicia una intención de compra para un "Celular xiaomi redmi 9 32gb verde" con seguro "Asegura tu Pantalla"
    Entonces el resumen de la orden es
      | Referencia celular    | Celular xiaomi redmi 9 32gb verde |
      | Marca                 | XIAOMI                            |
      | Valor total           | 477.800                           |
      | Valor celular         | 427.900                           |
      | Valor seguro          | 49.900                            |
      | Cantidad de productos | 1                                 |
      | Codigo                | 9763388                           |