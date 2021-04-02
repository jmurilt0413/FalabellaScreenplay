# language: es

Característica: Validar la compra de un celular en Falabella
  Yo como usuario de Fallabela
  deseo comprar un celular
  para verificar el valor del mismo y el valor de protección de pantalla

  Escenario: Validar la compra de un celular en Fallabela
    Dado René ingresa a la pagina de Fallabela desde el buscador de google
    Cuando filtra por celulares
    Y selecciona el celular "Nombre de celular"
    Y asegura su producto con "asegura tu pantalla"
    Entonces el resumen de la orden es
      | Nombre Celular        | Celular xiaomi redmi note 9 pro 64gb 6gb |
      | Marca                 | XIAMI                                    |
      | Valor total           | 1.449.800                                |
      | Valor celular         | 1.349.900                                |
      | Cantidad de productos | 1                                        |
      | Codigo                | 11380938                                 |