Feature: Gestion du compte client

  @TEST_POEI23P2G4-41 @TESTSET_POEI23P2G4-90 @TNR
  Scenario Outline: Vérifier que le lien "Account Détails" redirige vers les infos perso
    Given je me redirige vers la page My Account
    And le pavé Login est affiché
    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je clique sur le bouton Login
    And je clique sur le lien Account Détails
    Then Je suis redirigé vers mes informations de comptes


    Examples:
      |login                  |password    |
      |boudouhomar00@gmail.com|Moijesuis2* |

  @TEST_POEI23P2G4-43 @TESTSET_POEI23P2G4-90 @TNR
  Scenario Outline: Valider le changement du mot de passe actuel
    Given je me redirige vers la page My Account
    And le pavé Login est affiché
    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je clique sur le bouton Login
    And je clique sur le lien Account Détails
    And je saisis mon password actuel "<password>"
    And je saisis mon nouveau password "<newPassword>"
    And je resaisis mon nouveau password "<newPassword>"
    And je clique sur le bouton confirmer
    Then le message "<message>" est affiché

    Examples:
      |login      |newPassword            |password    |message|
      |goog@hot.fr|Boudouh@01             |Moijesuis2* |Account details changed success|