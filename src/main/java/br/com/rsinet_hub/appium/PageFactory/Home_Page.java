package br.com.rsinet_hub.appium.PageFactory;

import java.time.Duration;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet_hub.appium.Util.AcoesTouchActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Page {

	private AppiumDriver<MobileElement> driver;
	private WebDriverWait wait;
	private AcoesTouchActions acoes;
	
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private MobileElement Logado;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private MobileElement Menu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private MobileElement login;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private MobileElement existe;
	
	@FindBy(how = How.ID, using = "android:id/button2")
	private MobileElement deslogar;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewSingUpToday")
	private MobileElement CreateConta;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private MobileElement BuscaLupa;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private MobileElement clickLupa;
	
	
	
	public Home_Page(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		wait = new WebDriverWait(this.driver, 10);
		acoes =  new AcoesTouchActions(this.driver);
	}
	
	public String getUserLogado() {
		wait.until(ExpectedConditions.visibilityOf(Logado));
		return Logado.getText();
	}
	
	public String getUserExistente() {
		wait.until(ExpectedConditions.visibilityOf(existe));
		return existe.getText();
	}
	
	
	public void clickMenu() {
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Menu));
		Menu.click();
	}
	
	
	public void clickLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(login));
		if(getUserLogado().equals("LOGIN")) {
			login.click();
		}else {
			login.click();
			deslogar.click();
			clickMenu();
			login.click();
		}
		
	}
	
	public void clickCriarConta() {
		wait.until(ExpectedConditions.elementToBeClickable(CreateConta));
		CreateConta.click();
	}
	
	public void clickProdutosHome(String texto) {
		acoes.scrollNameClick(texto);
	}
	
	public void pesquisarProdutoLupa(String texto) {
		wait.until(ExpectedConditions.visibilityOf(BuscaLupa));
		BuscaLupa.click();
		BuscaLupa.sendKeys(texto);	
	}
	
	public void clicandoParaPesquisar() {
		clickLupa.click();
	}
	
	
	
}
