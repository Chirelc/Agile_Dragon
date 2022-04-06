Feature: US_01

  En tant que Dragon smaug,
  Je souhaite demenager le dragon Dino de l'habitat
  Afin qu'il habite dans un nouvel habitat.
Scenario Outline: demenagement de smaug dans un nouvel habitat
Given un habitat1 qui comprend un lieu <lieu1>
And  une habitat2 qui comprend un lieu <lieu2>
And un habitat1 comprend  une liste de dragons  <listDragon1>
And les dragons smaug<Dragon> et dino<Dragon> sont dans <listDragon1>
And un habitat2 comprend  une liste de dragons  <listDragon2>
When smaug démenage
Then le système enlève smauge de habitat1 et le met dans habitat2.

Examples:
| lieu1  | lieu2 |
| "Grotte" | "Palais" |