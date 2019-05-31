#language: pt

Funcionalidade: Cadastro de Usuario

Contexto:
	Dado que eu esteja na tela de login
    Quando faço login com o usuário "admin@phptravels.com" e senha "demoadmin"
    Então sou autenticado com sucesso
    
    @Sprint5 @TeladeCadastro
    Cenário: indo para tela de cadastro
    	Dado que eu esteja na tela home 
    	Quando acessar submenu supplies 
    	Então chego a tela de cadastro
    
    @Sprint4 @efetuandocadastro
    Cenário: Efetuando cadastro
    	Dado que eu esteja na tela cadastro
    	Quando preencher os campos validos
    	Então sou cadastrado com sucesso

    @Sprint3 @MenuPricing
     Cenário: Itens apresentados no menu Pricing
     Dado que eu esteja na tela Home
     Quando acesso o menu Pricing
     Então sao apresentados os itens do menu "  Dashboard", "Updates", " Modules", " General", " Accounts                ", "CMS", "Hotels" e "Flights"