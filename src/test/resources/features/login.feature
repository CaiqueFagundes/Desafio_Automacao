# language: pt

	Funcionalidade: Login

  @Login
  Cenário: Realizar login
    Dado que eu esteja na tela de login
    Quando faço login com o usuário "admin@phptravels.com" e senha "demoadmin"
    Então sou autenticado com sucesso
    
  @LoginIncorreto
  Esquema do Cenário: Tentativa de Login
  	Dado que eu esteja na tela de login
    Quando faço login com o usuário "<usuario>" e senha "<senha>"
    Então é apresenta a mensagem "The Email field must contain a valid email address"
    	
    	Exemplos: 
    		|usuario|senha|
    		|admin  |1235 |    
    		|12334  |admin|
    		|       |admin|
    		|admin  |     |