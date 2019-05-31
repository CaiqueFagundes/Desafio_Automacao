
package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuCadPage {

	public MenuCadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
	//Elementos_Menu_para_o_cadastro
	
	@FindBy(xpath = "//a[@data-toggle='collapse'][@href='#ACCOUNTS']")
	WebElement menuACCOUNTS;  
	
	@FindBy(xpath = "//ul[@id = 'ACCOUNTS']/li/a[@href='https://www.phptravels.net/admin-portal/admin/accounts/suppliers/']")
	public WebElement Suppliers;
	
	
	//Botão_de_Adicionar_Novos_Usuarios 
	
	@FindBy(xpath = "//button[@type='submit'][@class='btn btn-success']")
	WebElement BtnAdd;	
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	WebElement Message;
	
	//Metodos
	
	
	public void clicarMenuACCOUNTS() { 
		menuACCOUNTS.click();
	}
	
	public void clicarMenuSubSupplier() { 
		Suppliers.click();
	}
	
	public void clicarBtnADD() { 
		BtnAdd.click();
	}
	
	public void checkCadastro () { 
		Message.getText().contentEquals("SUPPLIERS MANAGEMENT"); 
	}

}