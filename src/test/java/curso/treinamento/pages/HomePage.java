package curso.treinamento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import curso.treinamento.setup.Hooks;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy (xpath="//div[@class='wrapper']/nav[@id='sidebar']/div[@class='root']/a/p/strong")
    WebElement perfilUsuario;

	//Opções do Menu 
	
	@FindBy (xpath="//*[@href='https://www.phptravels.net/admin-portal/admin']/i[@class='fa fa-desktop']")
    WebElement  Dashboard;
	
	@FindBy (xpath=" //*[@href=\"https://www.phptravels.net/admin-portal/admin/updates/\"]")
    WebElement Update;
	
	@FindBy (xpath=" //*[@class='fa fa-cube']")
    WebElement Modules;
	
	@FindBy (xpath="//a[@class='collapsed']")
    WebElement General;
	
//Elementos_Menu_para_o_cadastro
	
	@FindBy(xpath = "//a[@data-toggle='collapse'][@href='#ACCOUNTS']")
	WebElement menuAcconts;  
		
	@FindBy(xpath = "//ul[@id = 'ACCOUNTS']/li/a[@href='https://www.phptravels.net/admin-portal/admin/accounts/suppliers/']")
	public WebElement submenuSuppliers;
		
		
//Botão_de_Adicionar_Novos_Usuarios 
		
	@FindBy(xpath = "//button[@type='submit'][@class='btn btn-success']")
	WebElement BtnAdd;	
		
	@FindBy(xpath = "//form/div[@class = 'panel panel-default']/div[1]")
	WebElement Titulocadastro;						

//demais funcionalidades do menu	
	
	@FindBy ( xpath = "//ul[@class= 'collapse wow fadeIn animated list-unstyled'] [@id='CMS']")
	WebElement CMS;
	
	@FindBy (xpath="//i[@class= 'w30 fa fa-building-o']")
    WebElement Hotels;
	
	@FindBy (xpath="//i[@class= 'w30 fa fa-plane']")
    WebElement Flights;
	
	@FindBy (xpath="//ul[@id = 'Tours']")
    WebElement Tours;
	
	@FindBy (xpath="//i [@class = 'w30 fa fa-car']")
    WebElement Cars;
	
	@FindBy (xpath="//ul[@id='Blog']")
    WebElement Blog;
	
	@FindBy (xpath="//ul[@id='Locations']")
    WebElement Locations;
	
	@FindBy (xpath="//ul[@id='SPECIAL_OFFERS']")
    WebElement SPECIALOFFERS;
	
	@FindBy (xpath="//i [@class = 'fa fa-asterisk']")
    WebElement Coupons;
	
	@FindBy (xpath="//i [@class = 'fa fa-envelope']")
    WebElement Newsletter;
	
	@FindBy (xpath="//i [@class = 'fa fa-list w30']")
    WebElement Bookings;
	
	@FindBy (xpath="// a [@class = 'article']")
    WebElement Documentation;
	
	
	//Métodos 
	
	public void IraTelaCadastro() {		
		menuAcconts.click();
		submenuSuppliers.click();
		BtnAdd.click();
		WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), 7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/div[@class = 'panel panel-default']/div[1]")));
		
	}
	
	public boolean CheckTelaCadastro(String TituloCadastro) {
		
		return Titulocadastro.getText().equals(TituloCadastro);
	}
	
	public boolean checkAposLogin() {
		return perfilUsuario.isDisplayed();		
	}
}
