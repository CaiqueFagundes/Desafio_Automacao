package curso.treinamento.pages;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadUserPage {

	//Botão de Adicionar novos usuarios 
		@FindBy(xpath = "//button[@type='submit'][@class='btn btn-success']")
		WebElement btnADD;
		
		// Campos para cadastro de usuario
		
		@FindBy(xpath = "//input[@class='form-control'] [@placeholder='First name']")
		WebElement fistNome;
		
		@FindBy(xpath = "//input[@class='form-control'] [@placeholder='Last name']")
		WebElement lastNome;
		
		@FindBy(xpath = "//input[@name='email']")
		WebElement email;
		
		@FindBy(xpath = "//input[@name='password']")
		WebElement password;
		
		@FindBy(xpath = "//input[@name='mobile']")
		WebElement mobile;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'BR']")
		WebElement country;
		
		@FindBy(xpath = "//input [@name='address1']")
		WebElement address1;
		
		@FindBy(xpath = "//input [@name='address2']")
		WebElement address2;
		
		@FindBy(xpath ="//select [@name='status']/option[@value = 'yes']")
		WebElement status1;
		
		@FindBy(xpath ="//select [@name='status']/option[@value = 'no']")
		WebElement status2;
			
		@FindBy(xpath = "//select[@name='applyfor']/ option[@value = 'Hotels']")
		WebElement applyfor1;
		
		@FindBy(xpath = "//select[@name='applyfor']/ option[@value = 'Tours']")
		WebElement applyfor2;
		
		@FindBy(xpath = "//select[@name='applyfor']/ option[@value = 'Cars']")
		WebElement applyfor3;
		
		@FindBy(xpath = "//input[@name = 'itemname']")
		WebElement itemname;
		
		@FindBy(xpath = "//input [@name='newssub']")
		WebElement newssub;	
		
		//Metodos 
		public void clicarADDUser(){
			btnADD.click();		
		}

}
