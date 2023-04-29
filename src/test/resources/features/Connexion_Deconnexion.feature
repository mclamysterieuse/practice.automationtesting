Feature: Connexion/Deconnexion

  @TEST_POEI23P2G4-33 @TESTSET_POEI23P2G4-87 @TNR
  Scenario Outline: Connexion OK
    Given je me redirige vers la page My Account

    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je clique sur le bouton Login

    Then Je suis connecté

    Examples:
      |login                  |password    |
      |boudouhomar00@gmail.com|Moijesuis2* |

  @TEST_POEI23P2G4-35 @TESTSET_POEI23P2G4-87 @TNR
  Scenario Outline: Connexion KO
    Given je me redirige vers la page My Account

    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je clique sur le bouton Login

    Then Je ne suis pas connecté
    And le message "<message>" s'affiche

    Examples:
      |login                   |password          |message|
      |boudouhomar00@gmail.com |mauvais_password  |Error: the password you entered for the username boudouhomar00@gmail.com is incorrect. Lost your password?|

  @TEST_POEI23P2G4-36  @TESTSET_POEI23P2G4-87 @TNR
  Scenario Outline: Affichage du Dashboard après connexion
    Given je me redirige vers la page My Account

    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je clique sur le bouton Login

    Then Je suis connecté
    And l'ecran Dashboard est affiché
    And le lien Orders est présent
    And le lien Download est présent
    And le lien Addresses est présent
    And le lien Account Details est présent
    And le lien Logout est présent

    Examples:
      |login                  |password    |
      |boudouhomar00@gmail.com|Moijesuis2* |

  @TEST_POEI23P2G4-38 @TESTSET_POEI23P2G4-87 @TNR
  Scenario Outline: Vérifier que la Case "Remember me" est coché pour prochaine connexion
    Given je me redirige vers la page My Account
    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je coche sur la case Remember me
    And je clique sur le bouton Login
    And je me deconnecte
    And je me redirige vers la page My Account
    Then le champ login est pré-rempli par le login "<login>"

    Examples:
      |login                  |password    |
      |boudouhomar00@gmail.com|Boudou@00   |

  @TEST_POEI23P2G4-39 @TESTSET_POEI23P2G4-87 @TNR
  Scenario Outline: Valider la présence du lien "Logout" dans l'espace "My Account"
    Given je me redirige vers la page My Account

    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je clique sur le bouton Login

    Then lien "Logout" est présent

    Examples:
      |login                  |password    |
      |boudouhomar00@gmail.com|Moijesuis2* |

  @TEST_POEI23P2G4-45 @TESTSET_POEI23P2G4-87 @TNR
  Scenario: Valider la présence du Pavé "Login"
    Given je me redirige vers la page My Account
    Then le pavé Login est affiché

  @TEST_POEI23P2G4-47 @TESTSET_POEI23P2G4-87 @TNR
  Scenario: Valider la présence du Pavé "Register"
    Given je me redirige vers la page My Account
    Then le pavé Register est présent dans l'espace My Account

  @TEST_POEI23P2G4-40 @TESTSET_POEI23P2G4-87 @TNR
  Scenario: Valider que le lien "Logout" me permet de me déconnecter
    Given je me redirige vers la page My Account
    When Je clique sur le lien Logout
    Then Je suis déconneté