Feature: Store
  @LoginStore
  Scenario: Validación del Precio de un Producto
    Given estoy en la página de la tienda
    And hago clic en el botón de Login
    Then valido el titulo la ventana de login sea "Iniciar sesión con su cuenta"
    And me logueo con mi usuario "jamilhfc16@gmail.com" y clave "Avatec292**"
    And hago clic en el botón "INICIAR SESIÓN" para iniciar sesión
    Then valido el nombre del usuario logeado "Jamil Flores"
    When navego a la categoría "Clothes"
    And selecciono la subcategoría "Men"
    And agrego 2 unidades del primer producto al carrito
    And hago clic en el boton Añadir al carrito
    Then valido en el popup la confirmación del producto agregado sea "Producto añadido correctamente a su carrito de compra"
    And valido en el popup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido el titulo de la pagina del carrito sea "CARRITO"
    And Y vuelvo a validar el calculo de precios en el carrito
