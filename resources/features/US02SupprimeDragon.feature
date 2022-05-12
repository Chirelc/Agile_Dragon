Feature: US_02

  En tant que Maire de l'île au dragon,,
  Je souhaite enregistrer la mort du dragon Dino
Scenario Outline: Suppression du dragon dino
Given un dragon dino <Dragon>
And  Ce dragon loge dans un habiat situé à <lieu>
When dino meure
Then le système enlève dino de l'habitat et la lise de dragons se met à jour <nbrDragon>
Examples:
| lieu  | nbrDragon |
| "grotte" | 0 |