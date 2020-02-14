package br.com.rsinet_hub.appium.Container;

import java.net.MalformedURLException;

import br.com.rsinet_hub.appium.Manager.PageObjectManager;
import br.com.rsinet_hub.appium.Manager.WebDriverManager;

public class Contexto {
	private WebDriverManager manager;
	private PageObjectManager pageObjectManager;

	public Contexto() throws MalformedURLException {
		manager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(manager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return manager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}
