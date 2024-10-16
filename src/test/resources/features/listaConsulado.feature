
Feature: Búsqueda de consulado

  @listaConsulado
  Scenario: Búsqueda de consulado existente
    Given que ingreso al portal de Reniec
    When doy clic en la opcion Peruanos en el Extranjero
    And doy clic en la opcion CONSULADOS EN EL MUNDO
    And doy clic en la opción Lista de Consulados en el mundo
    And realizo la busqueda de la palabra "cuenca"
    And doy clic en busqueda
    Then se muestra oficinas de consulado relacionada a la busqueda
    And regreso a la pestaña principal

