package UnicaWebPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionsPage {
	private WebDriver driver;
	String string1,string2;
	
	public FunctionsPage(WebDriver driver) {
		this.driver = driver;
	}
	public void waitLoad(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public void insertStringOnSearch(String string) {
		driver.findElement(By.xpath("//*[@id=\"input-search\"]")).sendKeys(string);
	}
	public void pressENTER() {
		driver.findElement(By.xpath("//*[@id=\"input-search\"]")).sendKeys(Keys.RETURN);
	}
	public void clickFirstSmartphoneAfterSearch() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[3]/div/ul/li[4]/a/div[2]/img")).click();
	}
	
	public WebElement getFirstNameSmartphone() {
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/div/main/section[2]/div[2]/h1")));
		System.out.println(firstResult.getText());
		string1 = firstResult.getText();
		return firstResult;
	}
	
	public void goToMarket() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[7]/div[2]/button")).click();
	}
	public WebElement getSecondNameSmartphone() {
		WebElement secondResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div/a/p[1]")));
		System.out.println(secondResult.getText());
		string2 = secondResult.getText();
		return secondResult;
	}
	public void showIfTheFirstSmartphoneIsEqualWithSecond() {
		if 
		(string1.equals(string2)) System.out.println("equal"); else System.out.println("not"); 
	}
}
