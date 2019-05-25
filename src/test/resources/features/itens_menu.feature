#language: pt

Funcionalidade: Itens do Menu

Contexto:
	Dado que eu esteja na tela de login
    Quando faço login com o usuário "admin@phptravels.com" e senha "demoadmin"
    Então sou autenticado com sucesso
    
    @Sprint3 @SubMenuAccounts
    Cenário: Itens apresentados no menu Principal
    	Dado que eu esteja na tela Home
    	Quando acesso o menu Accounts
    	Então são apresentados os itens "Admins", "Suppliers", "Customers", "GuestCustomers"

    @Sprint4 @MenuPricing
     Cenário: Itens apresentados no menu Pricing
     Dado que eu esteja na tela Home
     Quando acesso o menu Pricing
     Então sao apresentados os itens do menu "  Dashboard", "Updates", " Modules", " General", " Accounts                ", "CMS", "Hotels" e "Flights"  