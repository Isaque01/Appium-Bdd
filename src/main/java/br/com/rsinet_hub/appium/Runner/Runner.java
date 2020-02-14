package br.com.rsinet_hub.appium.Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet_hub.appium.Manager.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

	

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "features",
			glue = {"br.com.rsinet_hub.appium.Test" }, 
		    monochrome = true,
			snippets = SnippetType.CAMELCASE,
			plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"} ,
			tags = {"@cadastroSucesso, @cadastroFalha, @PesquisaLupaSucesso,  @PesquisaLupaFalha ,@PesquisaSucesso , @PesquisaFalha"}
	)
	public class Runner {
		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
			

			
		}
	}

