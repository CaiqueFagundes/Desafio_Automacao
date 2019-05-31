package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.setup.Hooks;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	MenuCadPage MenuPage = new MenuCadPage (Hooks.getDriver());
	
	
	@FindBy (xpath="//div[@class='wrapper']/nav[@id='sidebar']/div[@class='root']/a/p/strong")
    WebElement texto;

	//Opções do Menu 
	
	@FindBy (xpath="//*[@href='https://www.phptravels.net/admin-portal/admin']/i[@class='fa fa-desktop']")
    WebElement  Dashboard;
	
	@FindBy (xpath=" //*[@href=\"https://www.phptravels.net/admin-portal/admin/updates/\"]")
    WebElement Update;
	
	@FindBy (xpath=" //*[@class='fa fa-cube']")
    WebElement Modules;
	
	@FindBy (xpath="//a[@class='collapsed']")
    WebElement General;
	
	@FindBy (xpath="//a [@href='#ACCOUNTS']")
    WebElement  Accounts;
	
	@FindBy (xpath="//a[@href='https://www.phptravels.net/admin-portal/admin/accounts/suppliers/']")
    WebElement  Suppliers;	
	
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
	
	public void subMenuGeneral() {		
		General.click();
	}
	
	public boolean checkAposLogin() {
		return texto.isDisplayed();		
	}
}
