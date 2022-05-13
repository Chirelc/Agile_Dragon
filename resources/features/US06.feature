Feature:US_06
  En tant qu'utilisateur final
  je souhaite calculer le nombre total de fenetres dun batiment
  pour  pouvoir concevoir le batiment.

  Scenario Outline: calcul le nombre total de fenêtres
    Given le nombre d'etages <nbEtage> et le nombre de fenetres <nbFenetre> dun batiment
    When l'utilisateur demande le calcul du nombre total de fenetres
    Then le <produit> doit etre retourné.

    Examples:
      | nbEtage | nbFenetre | produit |
      | 5       | 6         | 30      |
      | 3       | 4         | 12      |
