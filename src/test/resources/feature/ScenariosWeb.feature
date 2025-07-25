# language: es

@prueba @ui
Característica: Ingreso Login Exitoso

  @Login2 @smoke
  Escenario: Login exitoso con credenciales válidas
    Dado que estoy en la página de login
    Cuando ingreso el bolso Cartera en cuero en el carrito
    Entonces valido que en el carrito este "Cartera en cuero metal arena" en la pagina principal



