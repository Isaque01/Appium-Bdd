package br.com.rsinet_hub.appium.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import br.com.rsinet_hub.appium.Container.Contexto;
import br.com.rsinet_hub.appium.PageFactory.Cadastro_Page;
import br.com.rsinet_hub.appium.PageFactory.Home_Page;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Cadastro {
	private Contexto contexto;
	private AppiumDriver<MobileElement> driver;
	private Home_Page home_page;
	private Cadastro_Page cadastro_page;

	public Cadastro(Contexto contexto) throws MalformedURLException {
		this.contexto = contexto;
		cadastro_page = this.contexto.getPageObjectManager().getCadastroPage();
		home_page = this.contexto.getPageObjectManager().getHomePage();
		driver = this.contexto.getWebDriverManager().getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Quando("^clico no botao logar$")
	public void clicoNoBotaoLogar() {
		home_page.clickMenu();
		home_page.clickLogin();
	}

	@Quando("^clico em Criar uma nova conta$")
	public void clicoEmCriarUmaNovaConta() {
		home_page.clickCriarConta();
	}

	@Quando("^passo o username \"([^\"]*)\"$")
	public void passoousername(String texto) {
		cadastro_page.passarNome(texto);
	}

	@Quando("^passo o email \"([^\"]*)\"$")
	public void passooOEmail(String texto) {
		cadastro_page.passarEmail(texto);
	}

	@Quando("^passo a senha \"([^\"]*)\"$")
	public void passoaSenha(String texto) {
		cadastro_page.passarSenha(texto);
	}

	@Quando("^passo a confirmacao da senha \"([^\"]*)\"$")
	public void passoaConfirmacaoDaSenha(String texto) {
		cadastro_page.passarConfirmacaoSenha(texto);
	}

	@Quando("^passo o primeiro nome \"([^\"]*)\"$")
	public void passooOPrimeiroNome(String texto) {
		cadastro_page.passarPrimeiroNome(texto);
	}

	@Quando("^passo o ultimo nome \"([^\"]*)\"$")
	public void passooUltimoNome(String texto) {
		cadastro_page.passarUltimoNome(texto);
	}

	@Quando("^passo o telefone \"([^\"]*)\"$")
	public void passooTelefone(String texto) {
		cadastro_page.passarNumeroTelefone(texto);
	}

	@Quando("^passo o Pais \"([^\"]*)\"$")
	public void passooPais(String texto) {
		cadastro_page.passarPais(texto);
	}

	@Quando("^passo o estado \"([^\"]*)\"$")
	public void passooEstado(String texto) {
		cadastro_page.passarEstado(texto);
	}

	@Quando("^passo o endereco \"([^\"]*)\"$")
	public void passooEndereco(String texto) {
		cadastro_page.passarEndereco(texto);
	}

	@Quando("^passo a cidade \"([^\"]*)\"$")
	public void passoaCidade(String texto) {
		cadastro_page.passarCidade(texto);
	}

	@Quando("^passo o CEP \"([^\"]*)\"$")
	public void passooCEP(String texto) {
		cadastro_page.passarCEP(texto);
	}

    @Quando("^clico em registrar$")
	public void clicoEmRegistrar() {
		cadastro_page.clicarBtnRegistrar();
	}

	@Entao("^o meu usuario aparece conectado como \"([^\"]*)\"$")
	public void oMeuUsuarioApareceConectadoComo(String texto) throws InterruptedException {
		Thread.sleep(2000);
		home_page.clickMenu();
		
		//assertTrue(home_page.getUserExistente().contains(texto));
	}

}
