package br.com.rsinet_hub.appium.PageFactory;

import java.util.NoSuchElementException;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet_hub.appium.Util.AcoesTouchActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Produto_Page {
	
	private AppiumDriver<MobileElement> driver;
	private WebDriverWait wait;
	private AcoesTouchActions acoes;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewFilter")
	private MobileElement filtro;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private MobileElement aplicarFiltro;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private MobileElement elementParaEsperaDaMensagemNoResults;
	
	
	
	public Produto_Page(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		wait = new WebDriverWait(this.driver, 10);
		acoes = new AcoesTouchActions(this.driver);
	}

	public void clicandoNoFiltro() {
		wait.until(ExpectedConditions.visibilityOf(filtro));
		filtro.click();
	}

	public void clicandoNoProduto(String texto) {
		acoes.scrollNameClick(texto);
	}


	public void clicandoEmAplicarFiltro()  {
		wait.until(ExpectedConditions.visibilityOf(aplicarFiltro));
		aplicarFiltro.click();
	}

	public void clicandoComponenteFiltro(String texto) {
		MobileElement element;
		try {
			element =((AndroidDriver<MobileElement>) driver)
					.findElementByAndroidUIAutomator("new UiSelector().text(\"" + texto + "\")");
			//wait.until(ExpectedConditions.elementToBeClickable(element));
			
			element.click();

		} catch (NoSuchElementException e) {
			((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CANCEL\")")
			.click();
			clicandoNoFiltro();
			element = ((AndroidDriver<MobileElement>) driver)
					.findElementByAndroidUIAutomator("new UiSelector().text(\"" + texto + "\")");

			//wait.until(ExpectedConditions.elementToBeClickable(element));

			element.click();

		}
	}

	public boolean capturarMessage(String texto) {
		wait.until(ExpectedConditions.textToBePresentInElement(elementParaEsperaDaMensagemNoResults, "- No results for \"" + texto + "\" -" ));
		if(driver.getPageSource().contains("- No results for \"" + texto + "\" -")) {
			return true;
		}
		return false;
	}

}
