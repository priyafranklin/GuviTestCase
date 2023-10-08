package testcaseBestBuy;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainTestCases {
	@Test
		
	public void bestbuywebpage(){
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")).click();
		
	}
	public void bestbuyloginwebpage(){	
		ChromeDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//*[@id=\"account-menu-account-button\"]/span"));
	driver.findElement(By.id("priyafranklin1988@gmail.com"));
	driver.findElement(By.id("Zarah@1988"));
	driver.findElement(By.id("SignIn")).click();
	
	
		
	}
}
