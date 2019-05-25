#language: pt

Funcionalidade: Itens do Menu

Contexto:
	Dado que eu esteja na tela de login
    Quando faço login com o usuário "admin" e senha "admin"
    Então sou autenticado com sucesso
    
    @Sprint3 @MenuCatalog
    Cenário: Itens apresentados no menu Catalog
    	Dado que eu esteja na tela Home
    	Quando acesso o menu Catalog
    	Então são apresentados os itens "Catalogs", "Categories", "Base Product", "All Products", "Product Bundles", "Add-on Products", "Product Groups", "Product Options", "Cart Rules", "Manage Inventory" e "Locations"

    @Sprint4 @MenuPricing
     Cenário: Itens apresentados no menu Pricing
     Dado que eu esteja na tela Home
     Quando acesso o menu Pricing
     Então sao apresentados os itens do menu "Offers", "Price Lists", "Contracts", "Sales" e "Offer Codes" 