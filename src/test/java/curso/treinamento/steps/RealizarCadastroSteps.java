package curso.treinamento.steps;

import static org.junit.Assert.*;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.CadUserPage;
//import curso.treinamento.pages.CadUserPage;
import curso.treinamento.pages.HomePage;
import curso.treinamento.setup.Hooks;

public class RealizarCadastroSteps {

		private CadUserPage CadUserPage = new  CadUserPage(Hooks.getDriver());
		private HomePage HomePage = new HomePage (Hooks.getDriver());
		
//Step IraTeladeCadastro
		
		@Dado("^que esteja na tela Home$")
		public void queEstejaNaTelaHome() throws Throwable {
			HomePage.checkAposLogin();		    
		}

		@Quando("^acessar submenu supplies$")
		public void acessarSubmenuSupplies() throws Throwable {
			HomePage.IraTelaCadastro();
		    
		}

		@Então("^chego a tela de cadastro \"([^\"]*)\"$")
		public void chegoATelaDeCadastro(String TextoVariavel) throws Throwable {
			
			Assert.assertTrue("Mensagem '" + TextoVariavel + "' não foi apresentada.", HomePage.CheckTelaCadastro(TextoVariavel));			
			
		}
		
		@E("^Preencho os campos first_Name com \"([^\"]*)\" e Last Name com \"([^\"]*)\" e Email com \"([^\"]*)\" e Password com \"([^\"]*)\" e Mobile Number com \"([^\"]*)\" e AddressPrimari com \"([^\"]*)\" e AddresSecond com \"([^\"]*)\"$")
		
		public void preenchoOsCampos(String Nome, String SNome, String Email, String Senha, String NumeroTelefone, String Endereco1, String Endereco2){
		    
			CadUserPage.realizarCadastro(Nome, SNome, Email, Senha, NumeroTelefone, Endereco1, Endereco2);    
		}
		
		@Então("^meu nome \"([^\"]*)\" é cadastrado com sucesso$")
		public void CadastradoComSucesso(String NomeCadastrado) {
		    	
			Assert.assertTrue("Usuario '" + NomeCadastrado + "' não foi cadastrado.", CadUserPage.checkCadastro(NomeCadastrado));			
		}
		
		
}
