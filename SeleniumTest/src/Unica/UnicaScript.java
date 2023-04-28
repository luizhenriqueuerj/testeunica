package Unica;

import org.openqa.selenium.chrome.*;

import UnicaWebPages.FunctionsPage;


public class UnicaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.magazineluiza.com.br/");
		//carrega uma webpage de funções
		FunctionsPage functions = new FunctionsPage(driver);
		//função de espera de load da página
		//functions.waitLoad(2);
		functions.insertStringOnSearch("celular");
		functions.waitLoad(2);
		functions.pressENTER();
		functions.waitLoad(2);
		functions.clickFirstSmartphoneAfterSearch();
		functions.getFirstNameSmartphone();
		functions.waitLoad(10);
		functions.goToMarket();
		functions.waitLoad(5);
		functions.getSecondNameSmartphone();
		functions.showIfTheFirstSmartphoneIsEqualWithSecond();
		driver.quit();
	}
}
