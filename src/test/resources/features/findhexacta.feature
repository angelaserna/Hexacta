Feature: Como usuario requiero acceder en la pagina web de hexacta
  y buscar una palabra especifica

  @busqueda
  Scenario: Realizar una busqueda en la pagina web de hexacta
    Given Que el usuario quiere buscar una palabra en Hexacta
    When el realiza la busqueda la palabra Outsource
    Then el debe visualizar los resultados se encuentre el texto WHY OUTSOURCE IN ARGENTINA?