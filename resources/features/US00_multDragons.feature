Feature: US_00

  En tant que Maire de l'île au dragon,
  Je souhaite loger deux dragons dans un habitat
  Un habitat peut habriter un ou plusieurs dragons.

  Scenario Outline: affectation d'un groupe de dragon dans un habitat
    Given un habitat qui comprend un lieu <lieu>
    And  une  liste de dragon comprend deux dragons
    And un habitat comprend  une liste de dragons  <listDragon>
    When le maire décide de loger un dragon
    Then le système met à jour le nombre de dragons dans  l'habitat <nbrDragon>.

    Examples:
      | lieu     | nbrDragon |
      | "grotte" | 2         |






