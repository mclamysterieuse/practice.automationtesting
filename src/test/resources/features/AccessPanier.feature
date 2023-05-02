Feature: AccessPanier

  @TEST_POEI23P2G4-60 @TESTSET_POEI23P2G4-89 @TNR
  Scenario: Valider la commande des articles dans la page Shop
    Given Je me trouve sur la page Shop via le lien "https://practice.automationtesting.in/shop/"
    And   Le logo est bien présent sur la page Shop
    And  le basket link est present sur la page shop
    When  Un filtre permet d affiner la vue des articles par thème
    And  Un filtre permet d affiner la vue des articles par prix
    And Je valide  apparition du lien  "READ MORE" a la place du bouton "ADD TO BASKET"
    And Je clique sur le bouton "ADD TO BASKET"
    And  Je valide apparition du lien  "VIEW BASKET" au-dessous article, si article n'est pas en stock
    And  Je clique sur le lien "View Basket"
    Then je me redirige vers le panier
    And  Chaque article contient une photo descriptive, un libellé et le prix affiché au-dessous

  @TEST_POEI23P2G4-78 @TESTSET_POEI23P2G4-89 @TNR
  Scenario: Valider la présence du bouton "ADD TO BASKET" dans la page Shop
    Given Je me trouve sur la page Shop via le lien "https://practice.automationtesting.in/shop/"
    Then je valide la présence de la liste des articles
    And Je valide la présence du  bouton  "ADD TO BASKET"


  @TEST_POEI23P2G4-49 @TESTSET_POEI23P2G4-89 @TNR
  Scenario: Vérifier la présence des informations détaillés de l'article
    Given je me redirige vers la page Detail de l'article via le lien "https://practice.automationtesting.in/product/mastering-javascript/"
    And   Le logo est bien présent sur la page Detail Article
    And  le basket link est present sur la page Detail Article
    Then l'article est présenté par une photographie
    And un détail déscriptif est present
    And le prix est present
    And le nombre d'exemplaires dispo est présent

  @TEST_POEI23P2G4-54 @TESTSET_POEI23P2G4-89 @TNR
  Scenario: Vérifié la possibilité d'ajouter un article au panier avec quantité
    Given je me redirige vers la page Detail de l'article via le lien "https://practice.automationtesting.in/product/mastering-javascript/"
    Then le bouton ADD TO BASKET est present
    And le champ pour le nombre d'exemplaire est present

  @TEST_POEI23P2G4-58 @TESTSET_POEI23P2G4-89 @TNR
  Scenario: Valider l'ajout d'article au panier
    Given je me redirige vers la page Detail de l'article via le lien "https://practice.automationtesting.in/product/mastering-javascript/"
    When je choisi la quantité d'exemplaire
    And je clique sur le bouton "ADD TO BASKET"
    Then le message "has been added to your basket" se affiche
    And le bouton "VIEW BASKET" est affiché au dessus de  article et redirige vers espace panier
#
  @TEST_POEI23P2G4-53 @TESTSET_POEI23P2G4-89 @TNR
  Scenario: Valider l'affichage récapitulatif page panier
    Given je me redirige vers la page Detail de l'article via le lien "https://practice.automationtesting.in/product/mastering-javascript/"
    And je clique sur le bouton "ADD TO BASKET"
    And je clique sur  bouton "View BASKET"
    And   Le logo est bien présent sur la page panier
    And  le basket link est present sur la page panier
    Then Je valide que la page panier affiche un récapitulatif des articles ajoutés spécifiant la quantité, le prix unitaire et le prix total
#
#
  @TEST_POEI23P2G4-56 @TESTSET_POEI23P2G4-89 @TNR
  Scenario: Valider la modification de la quantité d'article via champ quantité
    Given je me redirige vers la page Detail de l'article via le lien "https://practice.automationtesting.in/product/mastering-javascript/"
    And je clique sur le bouton "ADD TO BASKET"
    And je clique sur  bouton "View BASKET"
    When Je vérifie l'éxistance du champ quantité
    And Je modifie la quantité d'article via le champ quantité
    Then Je valide que la quantité de chaque article à bien été modifié par le champs quantité
#
#
  @TEST_POEI23P2G4-55 @TESTSET_POEI23P2G4-89 @TNR
  Scenario: valider la suppression d'article via un bouton
    Given je me redirige vers la page Detail de l'article via le lien "https://practice.automationtesting.in/product/mastering-javascript/"
    And je clique sur le bouton "ADD TO BASKET"
    And je clique sur  bouton "View BASKET"
    When Je cliquer sur le bouton supprimer l'article
    Then Je valide que l'article à bien été supprimer
#
#
  @TEST_POEI23P2G4-75 @TESTSET_POEI23P2G4-89 @TNR
  Scenario: Valider que "Basket Totals" spécifie le prix total et la taxe associée
    Given je me redirige vers la page Detail de l'article via le lien "https://practice.automationtesting.in/product/mastering-javascript/"
    And je clique sur le bouton "ADD TO BASKET"
    And je clique sur  bouton "View BASKET"
    When La page panier affiche un récapitulatif des articles ajoutés et les informations "Basket Totals"
    And un champ "Coupon code" et un bouton "APPLY COUPON" permettant d’apppliquer un code promotionnel sur la commande
    And Je clique sur le bouton de"Proceed to Checkout"
    Then Je suis redirigé vers la page de paiement pour finaliser ma commande

