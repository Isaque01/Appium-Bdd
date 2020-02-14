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

public class BuscaProdutoLupa {

	private Contexto contexto;
	private AppiumDriver<MobileElement> driver;
	private Produto_Page produto_page;
	private Home_Page home_page;
	
	public BuscaProdutoLupa(Contexto contexto) throws MalformedURLException {
		this.contexto = contexto;
		home_page = this.contexto.getPageObjectManager().getHomePage();
	    produto_page = this.contexto.getPageObjectManager().getProdutoPage();
		driver = this.contexto.getWebDriverManager().getDriver();
	}
	

	@Quando("^pesquiso pelo modelo \"([^\"]*)\"$")
	public void pesquisoPeloModelo(String texto) {
		home_page.pesquisarProdutoLupa(texto);
	}

	@Quando("^clico na lupa$")
	public void clicoNaLupa()  {
		home_page.clicandoParaPesquisar();
	}

	@Quando("^clico no modelo \"([^\"]*)\"$")
	public void clicoNoModelo(String texto) {
		produto_page.clicandoComponenteFiltro(texto);
	}

	@Entao("^estarei na tela do modelo \"([^\"]*)\"$")
	public void estareiNaTelaDoModelo(String texto)  {
		assertTrue(driver.getPageSource().contains(texto.toUpperCase()));
	}

	@Entao("^aparecera uma mensagem de produto nao encontrado \"([^\"]*)\"$")
	public void apareceraUmaMensagemDeProdutoNaoEncontrado(String texto) {
		
		assertTrue(produto_page.capturarMessage(texto));
	}
}
