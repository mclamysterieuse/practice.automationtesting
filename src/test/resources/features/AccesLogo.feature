@REQ_POEI23P2G4-11
Feature: Vérification de la présence du Logo du site "AT"

  @TEST_POEI23P2G4-22 @TESTSET_POEI23P2G4-86 @TNR
  Scenario: Vérifier la présence du logo du Site "AT"
    Given je me redirige vers la page My Account via le lien "https://practice.automationtesting.in/my-account/"
    When Je saisis mon username
    And je saisis mon password
    And Je clique sur login
    And je clique sur "adresse"
    Then Le logo est bien présent sur la page Address
    And Le logo est bien présent sur la page My Account
    And  le basket link est present sur la page My Account
    And le basket link est present sur la page Address


  @TEST_POEI23P2G4-23 @TESTSET_POEI23P2G4-86 @TNR
  Scenario: Valider que le lien dans logo redirige vers la page d'accueil
    Given je me redirige vers la page My Account via le lien "https://practice.automationtesting.in/my-account/"
    When je clique sur le logo
    Then Je suis redirigé vers la page d'acceuil

