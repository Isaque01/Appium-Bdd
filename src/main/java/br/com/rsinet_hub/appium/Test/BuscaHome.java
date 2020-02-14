package br.com.rsinet_hub.appium.Test;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;

import br.com.rsinet_hub.appium.Container.Contexto;
import br.com.rsinet_hub.appium.PageFactory.Home_Page;
import br.com.rsinet_hub.appium.PageFactory.Produto_Page;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BuscaHome {
	
	private Contexto contexto;
	private Home_Page homeScreen;
	private Produto_Page searchScreen;
	private AppiumDriver<MobileElement> driver;

	public BuscaHome(Contexto contexto) throws MalformedURLException {
		this.contexto = contexto;
		homeScreen = this.contexto.getPageObjectManager().getHomePage();
		searchScreen = this.contexto.getPageObjectManager().getProdutoPage();
		driver = this.contexto.getWebDriverManager().getDriver();
	}

	@Quando("^clico em um produto \"([^\"]*)\"$")
	public void clicoEmUmProduto(String texto) throws InterruptedException {
		Thread.sleep(3000);
		homeScreen.clickProdutosHome(texto.toUpperCase());
	}

	@Quando("^clico em um modelo \"([^\"]*)\"$")
	public void clicoEmUmModelo(String texto) {
		searchScreen.clicandoNoProduto(texto);
	}

	@Entao("^estarei na tela do produto \"([^\"]*)\"$")
	public void estareiNaTelaDoProduto(String texto) {
		assertTrue(driver.getPageSource().contains(texto));
	}

	@Quando("^clico em filtro$")
	public void clicoEmFiltro() throws InterruptedException {
		Thread.sleep(3000);
		searchScreen.clicandoNoFiltro();
	}

	@Quando("^clico em um filtro especifico \"([^\"]*)\"$")
	public void clicoEmUmFiltroEspecifico(String texto) throws InterruptedException{
		Thread.sleep(3000);
		searchScreen.clicandoComponenteFiltro(texto.toUpperCase());
	}
	
	@Quando("^clico em outro  \"([^\"]*)\"$")
	public void clicoEmOutro(String texto) {
		searchScreen.clicandoComponenteFiltro(texto.toUpperCase());
	}
	
	@Quando("^clico na opcao do filtro  \"([^\"]*)\"$")
	public void clicoNaOpcaoDoFiltro(String texto) {
		searchScreen.clicandoComponenteFiltro(texto);
	}
		
	@Quando("^clico na opcao \"([^\"]*)\" atraves de index$")
	public void clicoNaOpcaoAtravesDeIndex(String texto)throws InterruptedException {
	    searchScreen.clicandoComponenteFiltro(texto);
	    
	    searchScreen.clicandoEmAplicarFiltro();
	}

	@Entao("^terei a seguinte mensagem \"([^\"]*)\"$")
	public void tereiASeguinteMensagem(String texto) {
		assertTrue(driver.getPageSource().contains(texto));
	}
}