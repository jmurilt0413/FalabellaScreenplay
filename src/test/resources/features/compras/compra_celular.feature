# language: es

Característica: Validar la compra de un celular en Falabella
  Yo como usuario de Falabella
  deseo comprar un celular
  para verificar el valor del mismo y el valor de protección de pantalla

  Escenario: Validar la compra de un celular en Fallabela
    Dado René ingresa a la página de Falabella desde el buscador de Google
    Cuando René busca por celulares
    Y compra un "Celular xiaomi poco x3 64gb 6gb ram gris" con seguro "Asegura tu Pantalla"
    Entonces el resumen de la orden es
      | Nombre Celular        | Celular Vivo V20 128GB |
      | Marca                 | XIAMI                  |
      | Valor total           | 1.449.800              |
      | Valor celular         | 1.349.900              |
      | Cantidad de productos | 1                      |
      | Codigo                | 11380938               |