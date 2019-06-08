package curso.treinamento.steps;

import java.awt.Menu;

import org.junit.Assert;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.CadUserPage;
import curso.treinamento.pages.HomePage;
import curso.treinamento.setup.Hooks;

public class CadastroSteps {

//PageObjectis
	//private LoginPage loginPage = new LoginPage(Hooks.getDriver());
	private CadUserPage CadUserPage = new  CadUserPage(Hooks.getDriver());
	private HomePage HomePage = new HomePage (Hooks.getDriver()); 	

//Cenário: Efetuando cadastro	
	
	@Dado("que eu esteja na tela cadastro")
	public void CheckPaginaCadastro(String TituloCadastro) {	
		
		HomePage.CheckTelaCadastro(TituloCadastro);
	}
	
	@Quando("Quando preencher os campos validos")
	public void Preenchercadastro(String primeiroNome, String segundoNome, String Email, String Senha, String NumeroTelefone, String Pais, String Endereco1, String Endereco2) {
		
		CadUserPage.realizarCadastro(primeiroNome, segundoNome, Email, Senha, NumeroTelefone, Endereco1, Endereco2);
	}
	
	@Então("^sou cadastrado com sucesso\"([^\"]*)\"$")
	public void CheckCadastro (String nomeCadastrado) {
		
		Assert.assertTrue("Usuario '" + nomeCadastrado + "' não foi apresentado.", CadUserPage.checkCadastro(nomeCadastrado));
	}
}
