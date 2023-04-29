@REQ_POEI23P2G4-11
Feature: Vérification de la présence du Logo du site "AT"

	@TEST_POEI23P2G4-22 @TESTSET_POEI23P2G4-86 @TNR
	Scenario: Vérifier la présence du logo du Site "AT" 
		Given je me redirige vers la page My Account via le lien "https://practice.automationtesting.in/my-account/"
		    When Je saisis mon username
		    And je saisis mon password
		    And Je clique sur login
		    And je clique sur "adresse"
		    And je clique sur le lien  "downloads"
		    And je clique sur onglet "shop"
		    Then Le logo est bien présent sur la page Address
		    And  Le logo est bien présent sur la page Downloads
		    And Le logo est bien présent sur la page My Account
	        And  Le logo est bien présent sur la page Shop

		#	@TEST_POEI23P2G4-23 @TESTSET_POEI23P2G4-86 @TNR
#	Scenario Outline: Valider que le lien dans logo redirige vers la page d'accueil
#		Given Je me redirige vers la page "<url>" du site
#						And je clique sur le logo
#						And je ferme le popup
#						Then Je suis redirigé vers la page d'acceuil
#
#				Examples:
#					| url                                                                     |
#					| https://practice.automationtesting.in/shop/                             |
#					| https://practice.automationtesting.in/my-account/                       |

