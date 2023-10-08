package pagesSpiceJet;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.lowagie.text.List;

import baseSpiceJet.BaseClass;

public class LoginPage extends BaseClass {

	static Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
			.pollingEvery(Duration.ofSeconds(100)).ignoring(NoSuchElementException.class);
	private static WebElement[] allDates;

	public void openLoginPage() throws InterruptedException {
		Thread.sleep(2000);
		WebElement accountDropDown = wait.until(driver -> {
			return driver.findElement(By.xpath("//div[@class=\"css-76zvg2 r-jwli3a r-ubezar\"]"));
		});
		accountDropDown.click();
	}

	public void loginInButton() throws InterruptedException {

		Thread.sleep(2000);

		WebElement emailTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath("//input[@data-testid=\"user-mobileno-input-box\"]"));
		});
		emailTextElement.sendKeys("7338851713");
		Thread.sleep(2000);
		WebElement passwordTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath("//input[@data-testid=\"password-input-box-cta\"]"));
		});
		passwordTextElement.sendKeys("Johannah@1988");
		Thread.sleep(2000);
		WebElement signInButton = wait.until(driver -> {
			return driver.findElement(By.xpath("//div[@data-testid=\"login-cta\"]"));
		});
		signInButton.click();
	}

	public static void ticketBooking() throws InterruptedException {

		Thread.sleep(2000);
		WebElement placeTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath(
					"//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input"));
		});
		placeTextElement.sendKeys("CHE");
		Thread.sleep(3000);

		WebElement placeToTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath(
					"//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input"));
		});
		placeToTextElement.sendKeys("DEL");
		Thread.sleep(3000);
	}

	public static void ticketBooking1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dateFromTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath(
					"//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[6]/div/div[3]/div[1]/div[3]/div/div"));
		});
		dateFromTextElement.click();
		Thread.sleep(3000);

		WebElement dateToText = wait.until(driver -> {
			return driver.findElement(By.xpath("//div[@data-testid=\"return-date-dropdown-label-test-id\"]"));
		});
		dateToText.click();
		Thread.sleep(2000);
		WebElement dateToTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath(
					"//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[6]/div/div[3]/div[1]/div[5]/div"));

		});
		dateToTextElement.click();
		Thread.sleep(4000);

		WebElement searchFlightTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]"));
		});
		searchFlightTextElement.click();

		Thread.sleep(8000);

		WebElement continueButton = wait.until(driver -> {
			return driver.findElement(By.xpath("//div[@data-testid=\"continue-search-page-cta\"]"));
				
		
		});
		continueButton.click();

		Thread.sleep(8000);

		WebElement firstName = wait.until(driver -> {
			return driver.findElement(
					By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/input"));
		});
		firstName.sendKeys("Padmapriya");

		Thread.sleep(3000);

		WebElement lastName = wait.until(driver -> {
			return driver.findElement(
					By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[3]/div/div/div[2]/input"));
		});
		lastName.sendKeys("Franklin");

		Thread.sleep(3000);

		WebElement mobileno = wait.until(driver -> {
			return driver.findElement(By
					.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[4]/div/div[1]/div/div[2]/input"));
		});
		mobileno.sendKeys("7338851713");

		Thread.sleep(3000);

		WebElement cotinueButton = wait.until(driver -> {
			return driver.findElement(By.xpath("//*[@id=\"travellers-view\"]/div[2]/div/div/div[2]"));
		});
		cotinueButton.click();
	}

}
