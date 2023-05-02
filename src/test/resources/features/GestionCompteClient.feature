Feature: Gestion du compte client

  @TEST_POEI23P2G4-2 @TESTSET_POEI23P2G4-90 @TNR
  Scenario Outline: Valider la création de compte client
    Given je me redirige vers la page My Account
    When je saisis mon login du pave register "<login>"
    And je saisis mon password du pave register "<password>"
    And je clique sur le bouton REGISTER
    Then Je possede un compte client

    Examples:
      | login              | password          |
      | client001@gmail.com |Bon_password@0000|

  @TEST_POEI23P2G4-21 @TESTSET_POEI23P2G4-90 @TNR
  Scenario Outline: Echec de création de compte client
    Given je me redirige vers la page My Account
    When je saisis mon login du pave register "<login>"
    And je saisis mon password du pave register "<password>"
    And je clique sur le bouton REGISTER
    Then Je ne cree pas mon compte

    Examples:
      |login                  |password         |
      |client002@gmail.com      |MauvaisPassword00|


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
      |login           |password|
      | client001@gmail.com | Bon_password@0000 |

  @TEST_POEI23P2G4-43 @TESTSET_POEI23P2G4-90 @TNR
  Scenario Outline: Valider le changement du mot de passe actuel
    Given je me redirige vers la page My Account
    And le pavé Login est affiché
    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je clique sur le bouton Login
    And je clique sur le lien Account Détails
    And je saisie mon prenom "<prenom>"
    And je saisie mon nom "<nom>"
    And je saisis mon password actuel "<password>"
    And je saisis mon nouveau password "<newPassword>"
    And je resaisis mon nouveau password "<newPassword>"
    And je clique sur le bouton confirmer
    Then le message "<message>" est affiché

    Examples:
      |login             |newPassword |password    |message|prenom|nom|
      |client001@gmail.com |Bon_password01|Bon_password@0000|Account details changed successfully.|omar|boudouh|



  @TEST_POEI23P2G4-44 @TESTSET_POEI23P2G4-90 @TNR
  Scenario Outline: Echec de changement le mot de passe actuel suite à un mauvais mot de passe actuel
    Given je me redirige vers la page My Account
    And le pavé Login est affiché
    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je clique sur le bouton Login
    And je clique sur le lien Account Détails
    And je saisis mon password actuel "<mauvaisPassword>"
    And je saisis mon nouveau password "<newPassword>"
    And je resaisis mon nouveau password "<newPassword>"
    And je clique sur le bouton confirmer

    Then le message d'erreur "<message>" est affiché

    Examples:
      |login                    |newPassword   |password    |mauvaisPassword|message|
      |client001@gmail.com       |Bon_password00|Bon_password01|mauvaisPassword|Your current password is incorrect.|

  @TEST_POEI23P2G4-46 @TESTSET_POEI23P2G4-90 @TNR
  Scenario Outline: Echec de changement  du mot de passe actuel suite à une mauvaise confirmation de nouveau mot de passe
    Given je me redirige vers la page My Account
    And le pavé Login est affiché
    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je clique sur le bouton Login
    And je clique sur le lien Account Détails
    When je saisis mon password actuel "<password>"
    And je saisis mon nouveau password "<newPassword>"
    And je resaisis mon nouveau password "<confirmPassword>"
    And je clique sur le bouton confirmer
    Then le message d'erreur "<message>" est affiché

    Examples:
      |login                    |newPassword    |password    |confirmPassword|message|
      |client001@gmail.com       |Bon_password00|Bon_password01|mauvaisPassword|New passwords do not match.|

  @TEST_POEI23P2G4-79 @TESTSET_POEI23P2G4-90 @TNR
  Scenario: Valider la présence du lien "Lost your Password?"
    Given je me redirige vers la page My Account
    Then  Je valide la présence du lien Lost your password?
