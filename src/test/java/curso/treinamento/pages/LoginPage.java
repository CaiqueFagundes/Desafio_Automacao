package curso.treinamento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import curso.treinamento.setup.Hooks;

public class LoginPage {

	HomePage HomePage = new HomePage (Hooks.getDriver());
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//objetos da tela login
	@FindBy(xpath = "//input[@type='text'][@name='email']")
	WebElement campoUsuario;

	@FindBy(xpath = "//input[@type='password'][@name='password']")
	WebElement campoPassword;

	@FindBy(xpath = "//button[@type='submit'][@class='btn btn-primary btn-block ladda-button fadeIn animated']")
	WebElement botaoSign;

	@FindBy(xpath = "//div[@class='resultlogin']/div[@class ='alert alert-danger loading wow fadeIn animated animated']/p")
	WebElement msgLoginIncorreto;

	
	
	//Metodos da tela login 
	
	public boolean checkPage() {
		return botaoSign.isDisplayed();
	}

	public void realizarLogin(String user, String pass) {
		campoUsuario.sendKeys(user);
		campoPassword.sendKeys(pass);
		botaoSign.click();
		WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), 7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='resultlogin']/div[@class ='alert alert-danger loading wow fadeIn animated animated']/p")));
	}

	public boolean checkMsgLoginIncorreto(String mensagem) {
		return msgLoginIncorreto.getText().equals(mensagem);
	}
}