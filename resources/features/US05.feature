Feature: US_05
  En tant que Maire de l'île au dragon,
  je souhaite loger un dragon dans un logement remplis

  Scenario Outline:loger un dragon dans un logement remplis
    Given un logementAdaptator1  avec un lieu <lieu>
    And un batiment avec 1 etage ,  2 fenetres et 1 porte
    And un dragon qui attend d'être loger
    And un dragon <dragon1> y loge
    When on ajoute le dragon <dragon2> dans le logement
    Then celui ci n'est pas ajouté à la liste de dragons du logement

    Examples:
      | dragon1 | dragon2 | lieu           |
      | "spyro" | "mushu" | "3 rue du feu" |