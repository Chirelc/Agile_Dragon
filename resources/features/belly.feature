Feature: My US
  As a utilisateur final
  I want calculer le nombre total de fenetres dun batiment
  So that pouvoir concevoir le batiment.


  Scenario Outline: calcul le nombre total de fenêtres
    Given le nombre d'etages <nbEtage> et le nombre de fenetres <nbFenetre> dun batiment
    When lutilisateur demande le calcul du nombre total de fenetres
    Then le <produit> doit etre retourné.

    Examples: 
      | nbEtage  | nbFenetre | produit  |
      | 5 | 6 | 30|
      | 3 | 4 | 12 |
