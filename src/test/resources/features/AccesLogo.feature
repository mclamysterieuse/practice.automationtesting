Feature: Accès au logo

  @TEST_POEI23P2G4-22 @TESTSET_POEI23P2G4-86 @TNR
  Scenario Outline: Vérifier la présence du logo du Site "AT"
    Given je me redirige vers la page My Account
    And le pavé Login est affiché
    When je saisis mon login "<login>"
    And je saisis mon password "<password>"
    And je clique sur le bouton Login
    And Je me redirige vers la page "<url>" du site
    Then Le logo est bien présent sur le site "AT

    Examples:
      | url                                                                      |login|password|
      | https://practice.automationtesting.in/                                   |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/shop/                              |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/my-account/                        |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/my-account/orders/                 |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/my-account/downloads/              |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/my-account/dashboard/              |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/my-account/edit-address/           |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/my-account/edit-account/           |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/checkout/                          |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/basket/                            |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/checkout/order-received/           |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/product/android-quick-start-guide/ |boudouhomar00@gmail.com|Moijesuis2*|
      | https://practice.automationtesting.in/product/html5-webapp-develpment/   |boudouhomar00@gmail.com|Moijesuis2*|

  @TEST_POEI23P2G4-23 @TESTSET_POEI23P2G4-86 @TNR
  Scenario Outline: Valider que le lien dans logo redirige vers la page d'accueil

    Given Je me redirige vers la page "<url>" du site
    And je clique sur le logo
    And je ferme le popup
    Then Je suis redirigé vers la page d'acceuil

    Examples:
      | url                                                                      |
      | https://practice.automationtesting.in/shop/                              |
      | https://practice.automationtesting.in/my-account/                        |
      | https://practice.automationtesting.in/basket/                            |
      | https://practice.automationtesting.in/product/android-quick-start-guide/ |


