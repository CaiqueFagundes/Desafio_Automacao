package curso.treinamento.steps;

import org.junit.Assert;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.E;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.pages.MenuCadPage;
import curso.treinamento.setup.Hooks;

public class CadastroSteps {

	private LoginPage loginPage = new LoginPage(Hooks.getDriver());
	private HomePage  HomePage = new  HomePage(Hooks.getDriver());
	private MenuCadPage MenuCadPage= new MenuCadPage(Hooks.getDriver());

	@Dado("^que eu esteja na tela de Home$")
	public void queEuEstejaNaTelaDeHome() {
	
		Assert.assertTrue("Página Login não foi apresentada", HomePage.checkAposLogin());
	}

	@Quando("Slececionar o submenu Accounts")
	public void AcessarMenuAccounts(){
		
		MenuCadPage.clicarMenuACCOUNTS();
	}
	
	@E("Quando acessar submenu supplies")
	public void AcessarSubmenuSupplies(){
		
		MenuCadPage.clicarMenuSubSupplier();;		
	}
		
	@Então("^sou Direcionado para tela de  \"([^\"]*)\"$")
	public void souDirecionadoParaTelaMANAGEMENT(String TextoVariavel) {
		
		Assert.assertTrue("Mensagem '" + TextoVariavel + "' não foi apresentada.", MenuCadPage.CheckTelaCadastro(TextoVariavel));
	}

	
	@Então("^é apresenta a mensagem \"([^\"]*)\"$")
	public void éApresentaAMensagem(String mensagemLoginIncorreto) {
		
		Assert.assertTrue("Mensagem '" + mensagemLoginIncorreto+ "' não foi apresentada.", loginPage.checkMsgLoginIncorreto(mensagemLoginIncorreto));
	}

}
