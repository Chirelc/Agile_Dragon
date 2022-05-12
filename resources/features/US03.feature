
Feature: US_03

  En tant que Maire de l'île au dragon,
  Je souhaite loger un dragon provenant de l'ile voisine dans un logementAdaptator
  Scenario Outline: affectation d'un  dragon dans un logement
    Given un logementAdaptator  avec un lieu <lieu>
    And un batiment avec les valeurs standards d'etages, de portes et de  fenetres
    When le maire décide de loger un  dragon <dragon>
    Then le système met à jour le nombre de dragons <nbrDragon> dans  le  logementAdaptator.

    Examples:
     |dragon | lieu       | nbrDragon |
     |"spyro" | "3 rue du feu"   | 1|






