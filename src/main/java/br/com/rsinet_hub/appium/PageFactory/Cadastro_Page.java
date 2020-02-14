package br.com.rsinet_hub.appium.PageFactory;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet_hub.appium.Util.AcoesTouchActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class Cadastro_Page {
	private AppiumDriver<MobileElement> driver;
	private WebDriverWait wait;
	private AcoesTouchActions acoes;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement Username;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement Email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement Password;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement ConfirmPassword;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private MobileElement FirstNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private MobileElement LastNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement Phone;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutCountry")
	private MobileElement Country;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement State;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private MobileElement City;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement Address;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private MobileElement Zip;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private MobileElement btnRegistrar;
	
public Cadastro_Page(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		wait = new WebDriverWait(this.driver, 10);
		acoes = new AcoesTouchActions((AndroidDriver<MobileElement>) this.driver);
	}

	public void passarNome(String texto) {
		wait.until(ExpectedConditions.visibilityOf(Username));
		Username.click();
		Username.sendKeys(texto);
	}

	public void passarEmail(String texto) {
		wait.until(ExpectedConditions.visibilityOf(Email));
		Email.click();
		Email.sendKeys(texto);
	}

	public void passarSenha(String texto) {
		wait.until(ExpectedConditions.visibilityOf(Password));
		Password.click();
		Password.sendKeys(texto);
	}

	public void passarConfirmacaoSenha(String texto) {
		wait.until(ExpectedConditions.visibilityOf(ConfirmPassword));
		ConfirmPassword.click();
		ConfirmPassword.sendKeys(texto);
	}

	public void passarPrimeiroNome(String texto) {
		wait.until(ExpectedConditions.visibilityOf(FirstNome));
		FirstNome.click();
		FirstNome.sendKeys(texto);
	}

	public void passarUltimoNome(String texto) {
		wait.until(ExpectedConditions.visibilityOf(LastNome));
		LastNome.click();
		LastNome.sendKeys(texto);
		@SuppressWarnings("rawtypes")
		TouchAction<?> touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(1053, 1743)).moveTo(PointOption.point(1050, 322)).perform();
	}

	public void passarNumeroTelefone(String texto) {
		wait.until(ExpectedConditions.visibilityOf(Phone));
		Phone.click();
		Phone.sendKeys(texto);
	}

	public void passarPais(String texto){
		wait.until(ExpectedConditions.visibilityOf(Country));
		Country.click();

		acoes.scrollNameClick(texto);
	}

	public void passarEstado(String texto) {
		wait.until(ExpectedConditions.visibilityOf(State));
		State.click();
		State.sendKeys(texto);
	}

	public void passarCidade(String texto) {
		wait.until(ExpectedConditions.visibilityOf(City));
		City.click();
		City.sendKeys(texto);
	}

	public void passarEndereco(String texto) {
		wait.until(ExpectedConditions.visibilityOf(Address));
		Address.click();
		Address.sendKeys(texto);
	}

	public void passarCEP(String texto) {
		wait.until(ExpectedConditions.visibilityOf(Zip));
		Zip.click();
		Zip.sendKeys(texto);
		acoes.scrollTextVisivel("REGISTER");
	}

	public void clicarBtnRegistrar() {
		wait.until(ExpectedConditions.visibilityOf(btnRegistrar));
		btnRegistrar.click();
		
	}
	
	

//	public boolean confirmandoSeAsSenhasEstaoErradas(String texto) {
//		acoes.scrollName(texto);
//		
//		if(driver.getPageSource().contains(texto))
//			return true;
//		return false;
//	}
}
