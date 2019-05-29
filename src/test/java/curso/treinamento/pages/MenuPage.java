
package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

	public MenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
	//Menus
	@FindBy(xpath = "//a[@data-toggle='collapse'][@href='#ACCOUNTS']")
	WebElement menuCadastro;
	
	//a[@href='https://www.phptravels.net/admin/accounts/suppliers/'][@'Suppliers']
	
   //Elementos Menu 
	
	@FindBy(xpath = ".//*[text() = 'Suppliers']")
	public WebElement subMenuCadastro;
	
	//Botão de Adicionar novos usuarios 
	@FindBy(xpath = "//button[@type='submit'][@class='btn btn-success']")
	WebElement btnADD;	
	
	//Metodos
	public void clicarMenuCadastro() { 
		menuCadastro.click();
	}
	
	public void clicarMenuSubCadastro() { 
		subMenuCadastro.click();
	}
	
	
}