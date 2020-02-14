package br.com.rsinet_hub.appium.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import br.com.rsinet_hub.appium.Container.Contexto;
import cucumber.api.java.pt.Dado;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class EntrarNaHome {
	
	private Contexto contexto;
	private AppiumDriver<MobileElement> driver;
	
	public EntrarNaHome(Contexto contexto) {
		this.contexto = contexto;
	}

	@Dado("^que estou no menu da tela home$")
	public void queEstouNoMenuDaTelaHome() throws MalformedURLException {
		driver = contexto.getWebDriverManager().getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Dado("^que estou na tela home$")
	public void clicoEmNOReceberOfertasEPromocoes() throws Throwable {
		driver = contexto.getWebDriverManager().getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
