package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//div[@class='resultlogin']/div[@class ='alert alert-danger loading wow fadeIn animated animated']")
    WebElement texto;	
	
	
	
	public boolean checkAposLogin() {
		return texto.isDisplayed();
		
	}
}
