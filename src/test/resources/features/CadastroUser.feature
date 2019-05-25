# language: pt

	Funcionalidade: Login

Contexto:
	Dado que eu esteja na tela de Home
    Quando acesso o menu Accounts E
    acesso o menu Suppliers
    então sou redirecionado para tela SUPPLIERS MANAGEMENT

	@Sprint5 @CadastrandoUsuario 
  Cenário: Efetuando Cadastro  
    Dado que eu esteja na tela SUPPLIERS MANAGEMENT
    Quando acesso o botão ADD e preencho os campos com dados validos  
    Então realizo o cadastro com sucesso
    	
    	Exemplos: 
    		|First Name	|Last Name	|Password	|Email			 |Mobile Number	|Address 1	  |Address 2|Name	|Assign Hotels|Assign Tours |Assign Cars|
    		|Caio		|1235		|erewrew	|Gmaild@gmail.com|11 987654321	|Rua margarida|	------	|hute	|Nordeste	  |Farol do mar |Velozter	|
    		|Carlos		|Fagundes	|asdfgg3@	|Gilmar@gmail.com|11 123456789	|Av Vidigal	  |Chao	  	|Magda	|Raio de sol  |Praia grande |Audi		|
    		|Italo		|Fernandes	|	4234	|Airton@gmail.com|11 543627189	|Centro Vila  |Brnaca  	|Edson	|Flor amarela |praça central|BMW		|
    		|234dw	 	|Juliano	|sdafg234	|Carlos@gmail.com|11 324156534	|Osasco		  |bolinha 	|		|Casa da vó	  |piramides    |Mercedez	|