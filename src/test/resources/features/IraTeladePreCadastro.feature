#language: pt

Funcionalidade: Cadastro de Usuario

Contexto:
	Dado que eu esteja na tela de login
    Quando faço login com o usuário "admin@phptravels.com" e senha "demoadmin"
    Então sou autenticado com sucesso
    
    @IraTeladeCadastro
    Cenário: indo para tela de cadastro
    	Dado que esteja na tela Home 
    	Quando acessar submenu supplies 
    	Então chego a tela de cadastro "ADD SUPPLIER"
    
    @Cadastro
    Cenário: Efetuando cadastro
    	Dado que eu esteja na tela cadastro
    	Quando preencher os campos validos
    	Então sou cadastrado com sucesso

    