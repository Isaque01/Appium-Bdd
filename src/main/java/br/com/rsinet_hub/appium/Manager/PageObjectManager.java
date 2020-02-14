package br.com.rsinet_hub.appium.Manager;

import br.com.rsinet_hub.appium.PageFactory.Cadastro_Page;
import br.com.rsinet_hub.appium.PageFactory.Home_Page;
import br.com.rsinet_hub.appium.PageFactory.Produto_Page;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PageObjectManager {
	

	private AppiumDriver<MobileElement> driver;

	private Home_Page home_page;

	private Cadastro_Page cadastro_page;

	private Produto_Page produto_page;

	public PageObjectManager(AppiumDriver<MobileElement> driver) {

		this.driver = driver;

	}

	public Home_Page getHomePage() {

		return (home_page == null) ? home_page = new Home_Page(driver) : home_page;

	}

	public Cadastro_Page getCadastroPage() {

		return (cadastro_page == null) ? cadastro_page = new Cadastro_Page(driver) : cadastro_page;

	}

	public Produto_Page getProdutoPage() {

		return (produto_page == null) ? produto_page = new Produto_Page(driver) : produto_page;

	}
		
	}

