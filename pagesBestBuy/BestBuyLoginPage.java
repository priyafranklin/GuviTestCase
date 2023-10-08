package pagesBestBuy;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import BaseBestBuy.BaseClass;


public class BestBuyLoginPage extends BaseClass {


	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
			.pollingEvery(Duration.ofSeconds(100)).ignoring(NoSuchElementException.class);


	public void setCountry() {

		WebElement locationLink = wait.until(driver -> {
			return driver.findElement(By.className("us-link"));
		});
		locationLink.click();
	}


	public void openLoginPage() throws InterruptedException {

		WebElement accountDropDown = wait.until(driver -> {
			return driver.findElement(By.xpath("//button[@data-lid=\"hdr_signin\"]"));
		});
		accountDropDown.click();

		Thread.sleep(2000);

		WebElement loginLink = wait.until(driver -> {
			return driver.findElement(By.xpath("//a[text()='Sign In']"));
		});
		loginLink.click();
	}


	public void signInButton() throws InterruptedException {

		Thread.sleep(2000);

		WebElement emailTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath("//input[@id=\"fld-e\"]"));
		});
		emailTextElement.sendKeys("priyafranklin1988@gmail.com");

		WebElement passwordTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath("//input[@id=\"fld-p1\"]"));
		});
		passwordTextElement.sendKeys("Zarah@1988");

		WebElement signInButton = wait.until(driver -> {
			return driver.findElement(By.xpath("//button[@data-track=\"Sign In\"]"));
		});
		signInButton.click();
	}

	public void previousPage() throws InterruptedException {

		Thread.sleep(2000);
		WebElement previousPage = wait.until(driver -> {
			return driver.findElement(By.xpath("//a[@class=\"mini-header__nav\"]"));
		});
	}
}
