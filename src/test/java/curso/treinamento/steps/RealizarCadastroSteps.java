package curso.treinamento.steps;

import static org.junit.Assert.*;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.CadUserPage;
//import curso.treinamento.pages.CadUserPage;
import curso.treinamento.pages.HomePage;
import curso.treinamento.setup.Hooks;

public class RealizarCadastroSteps {

	

		//private CadUserPage CadUserPage = new  CadUserPage(Hooks.getDriver());
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
}
