package curso.treinamento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import curso.treinamento.setup.Hooks;

public class CadUserPage {
	
	HomePage HomePage = new HomePage (Hooks.getDriver());
	
	public CadUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//titulo da tela de pré Cadastro
		@FindBy(xpath = "//div[@id='content']/form/div[@class = 'panel panel-default']/div[1]")
		WebElement tituloPreCadastro;
		
// Campos para Formulario de Cadastro de suario
		
		@FindBy(xpath = "//input[@class='form-control'] [@placeholder='First name']")
		WebElement campoFistNome;
		
		@FindBy(xpath = "//input[@class='form-control'] [@placeholder='Last name']")
		WebElement campoLastNome;
		
		@FindBy(xpath = "//input[@name='email']")
		WebElement campoEmail;
		
		@FindBy(xpath = "//input[@name='password']")
		WebElement CampoPassword;
		
		@FindBy(xpath = "//input[@name='mobile']")
		WebElement campoNumeroMobile;
		
//Combobox Country
		
		@FindBy(xpath = "//a[@class='select2-choice']")
		WebElement country;
		
		//itens Combobox Country
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'ZW']")
		WebElement Afghanistan;

		@FindBy(xpath = "//select[@name='country']/ option[@value = 'AL']")
		WebElement Albania;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'DZ']")
		WebElement Algeria;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'AS']")
		WebElement American_Samoa;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'AR']")
		WebElement Argentina;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'AU']")
		WebElement Australia;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'AZ']")
		WebElement Azerbaijan;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'BH']")
		WebElement Bahrain;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'BR']")
		WebElement Brazil;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'BD']")
		WebElement Bangladesh;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'BY']")
		WebElement Belarus;
		
		@FindBy(xpath = "//select[@name='country']/ option[@value = 'BE']")
		WebElement Belgium;
	
		@FindBy(xpath = "//input [@name='address1']")
		WebElement campoAddress1;
		
		@FindBy(xpath = "//input [@name='address2']")
		WebElement campoAddress2;
		
		
//Combobox Status
		@FindBy(xpath ="//select[@name = 'status']")
		WebElement statusEnabled;
		
		//Itens Combobox Status	
		@FindBy(xpath ="//select [@name='status']/option[@value = 'yes']")
		WebElement statusyes;

		@FindBy(xpath ="//select [@name='status']/option[@value = 'no']")
		WebElement statusno;
		
//Combobox Supplier For
		
		@FindBy(xpath = "//select[@name = 'applyfor']")
		WebElement comboBoxApplyFor1;
		
		//Itens Combobox Supplier For
		
		@FindBy(xpath = "//select[@name='applyfor']/ option[@value = 'Hotels']")
		WebElement applyFor1;
		
		@FindBy(xpath = "//select[@name='applyfor']/ option[@value = 'Tours']")
		WebElement applyFor2;
		
		@FindBy(xpath = "//select[@name='applyfor']/ option[@value = 'Cars']")
		WebElement applyFor3;
		
		@FindBy(xpath = "//input[@name = 'itemname']")
		WebElement campoItemname;
		
		@FindBy(xpath = "//input [@name='newssub']")
		WebElement selectNewssub;
		
		
//ComboBox Assign Hotels
		
		@FindBy(xpath = "//li[@class=\"select2-search-field\"]/input[@id=\"s2id_autogen4\"]")
		WebElement comboBoxAssignHotels;
		
		//Itens Combobox Assign Hotels
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='83']")
		WebElement optionAssingHotel1;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='82']")
		WebElement optionAssingHotel2;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='80']")
		WebElement optionAssingHotel3;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='79\'")
		WebElement optionAssingHotel4;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='78']")
		WebElement optionAssingHotel5;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='77']")
		WebElement optionAssingHotel6;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='76']")
		WebElement optionAssingHotel7;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='74']")
		WebElement optionAssingHotel8;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='73']")
		WebElement optionAssingHotel9;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='72']")
		WebElement optionAssingHotel10;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='71']")
		WebElement optionAssingHotel11;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='40']")
		WebElement optionAssingHotel712;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='39']")
		WebElement optionAssingHotel13;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='38']")
		WebElement optionAssingHotel14;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='37']")
		WebElement optionAssingHotel15;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='36']")
		WebElement optionAssingHotel16;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='34']")
		WebElement optionAssingHotel17;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='32']")
		WebElement optionAssingHotel18;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='31']")
		WebElement optionAssingHotel19;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='30']")
		WebElement optionAssingHotel20;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value='29']")
		WebElement optionAssingHotel21;
		
		@FindBy(xpath = "//select [@name='hotels[]']/option[@ value=\"28\"]")
		WebElement optionAssingHotel22;
		
				
		
		
//Menu ADD 
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'addHotels']")
		WebElement addOptHotels;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'addTours']")
		WebElement addOptTours;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'addCars']")
		WebElement addOptCars;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'addbooking']")
		WebElement addOptBookings;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'addlocations']")
		WebElement addOptLocations;
		
//Menu Edit
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'editHotels']")
		WebElement editOptHotels;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'editTours']")
		WebElement editOptTours;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'editCars']")
		WebElement editOptCars;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'editbooking']")
		WebElement editOtBookings;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'editlocations']")
		WebElement editOptLocations;
		
//Menu Remove
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'deleteHotels']")
		WebElement removeOptHotels;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'deleteTours']")
		WebElement removeOptTours;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'deleteCars']")
		WebElement removeOptCars;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'deletebooking']")
		WebElement removeOtBookings;
		
		@FindBy(xpath = "//ul[@class = 'list-unstyled']/li/label/div[@class='icheckbox_square-grey']/input[@value = 'deletelocations']")
		WebElement removeOptLocations;


//Botão de Cadastrar Usuario
		
		@FindBy(xpath = "//button[@class = 'btn btn-primary']")
		WebElement botaoSubmit;

//check apos login
		@FindBy(xpath = "//a[@href = 'mailto:c@gmail.com.br']")
		WebElement Emailcadastrado;
		
//Metodos 
		//Garantindo qu esteja na tela do formulario de cadastro 
		public boolean CheckPaginaPreCadastro(String TituloTelaPréCadastro) {
			
			return tituloPreCadastro.getText().equals(TituloTelaPréCadastro);
		}
		
		
		//Realizando o cadastro do usuario
		public void realizarCadastro(String primeiroNome, String segundoNome, String Email, String Senha, String NumeroTelefone, String Endereco1, String Endereco2) {
			campoFistNome.sendKeys(primeiroNome);
			campoLastNome.sendKeys(segundoNome);
			campoEmail.sendKeys(Email);
			CampoPassword.sendKeys(Senha);
			campoNumeroMobile.sendKeys(NumeroTelefone);
			campoAddress1.sendKeys(Endereco1);
			campoAddress2.sendKeys(Endereco2);
			statusEnabled.isSelected();
			selectNewssub.click();
			botaoSubmit.click();
			WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), 10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='content']/form/div[@class = 'panel panel-default']/div[1]")));
		}				
		//Validando o cadastro após o preenchimento do formulario
		public boolean checkCadastro(String UsuarioCadastrado) {
			
			
			return Emailcadastrado.getText().equals(UsuarioCadastrado);			
		}
		
		
}
