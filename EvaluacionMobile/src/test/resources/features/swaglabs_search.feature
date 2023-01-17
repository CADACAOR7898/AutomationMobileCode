Feature: Búsqueda en SauceLabs

  @test
  Scenario: Búsqueda simple de producto

    Given que me encuentro en la página de login de Saucedemo
    When inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
    Then valido que debería aparecer el título de "PRODUCTS"
    And también valido que el item "Sauce Labs Bike Light" existe