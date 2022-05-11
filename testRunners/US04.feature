Feature: US_04
En tant que Maire de l'île au dragon,
Je souhaite déménager un dragon de logement1 à logement2

Scenario Outline: déménagement d'un  dragon de logement1 à logement2
Given un logementAdaptator1  avec un lieu <lieu> et un dragon qui y loge
And un logementAdaptator2  avec un lieu <lieu2>
And un batiment2 avec 10 etages et 4 fenetres et 30 portes
When le maire décide de déménager le dragon dans un plus grand logement2
Then le système met à jour  le logement du dragon et  calcul du nombre total de fenetres <nbrTotal> du batiment2

Examples:
|dragon | lieu       | nbrDragon |lieu2| nbrTotal|
|"Spyro" | "3 rue du feu"   | 1|"4 rue des ailes " |40|