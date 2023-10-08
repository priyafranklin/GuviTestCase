package pagesBestBuy;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import BaseBestBuy.BaseClass;

public class menuPage extends BaseClass {

	static Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
			.pollingEvery(Duration.ofSeconds(100)).ignoring(NoSuchElementException.class);

	public static void TopDeals() throws InterruptedException {

		Thread.sleep(4000);

		WebElement menuSelectElement = wait.until(driver -> {
			return driver.findElement(By.xpath("//a[@data-lid=\"hdr_td_topdeals\"]"));
		});
		menuSelectElement.click();
	}

	public static void DealoftheDay() throws InterruptedException {
		Thread.sleep(4000);
		WebElement menuSelectElement1 = wait.until(driver -> {
		return driver.findElement(By.xpath("//a[@data-lid=\"hdr_dotd\"]"));
		});
		menuSelectElement1.click();
		}
	public static void CreditCards() throws InterruptedException {

		Thread.sleep(2000);
		WebElement menuSelectElement3 = wait.until(driver -> {
			return driver.findElement(By.xpath("//a[@data-lid=\"hdr_crd\"]"));
		});
		menuSelectElement3.click();
	}

	public static void Giftcards() throws InterruptedException {

		Thread.sleep(2000);
		WebElement menuSelectElement4 = wait.until(driver -> {
			return driver.findElement(By.xpath("//a[@data-lid=\"hdr_gift_cards\"]"));
		});
		menuSelectElement4.click();
	}
	
	public static void selectitem() throws InterruptedException {

		Thread.sleep(2000);
		WebElement menuSearch = wait.until(driver -> {
			return driver.findElement(By.xpath("//*[@id=\"gh-search-input\"]"));

		});
		menuSearch.sendKeys("Apple - AirPods Pro (2nd generation) - White");
		WebElement menuSearchResult1 = wait.until(driver -> {
			return driver.findElement(By.xpath("//*[@class=\"header-search-button\"]"));
		});

		menuSearchResult1.click();

		Thread.sleep(6000);
		WebElement addtocart = wait.until(driver -> {
			return driver.findElement(By.xpath("//button[@data-sku-id=\"4900964\"]"));

		});
		addtocart.click();

		Thread.sleep(6000);
		WebElement goToCart = wait.until(driver -> {
			return driver.findElement(By.xpath("//div[@class=\"go-to-cart-button\"]/a"));

		});
		goToCart.click();

		Thread.sleep(2000);
		WebElement checkOut = wait.until(driver -> {
			return driver.findElement(By.xpath("//button[@data-track=\"Checkout - Top\"]"));

		});
		checkOut.click();

		Thread.sleep(4000);
		WebElement continueAsGuest = wait.until(driver -> {
			return driver.findElement(By.xpath(
					"//button[@class=\"c-button c-button-secondary c-button-lg cia-guest-content__continue guest\"]"));

		});
		continueAsGuest.click();

	}

	public static void contactInformation() throws InterruptedException {

		Thread.sleep(4000);

		WebElement emailTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath("//input[@id=\"user.emailAddress\"]"));
		});
		emailTextElement.sendKeys("franklinmartinmoses@gmail.com");

		WebElement phoneNumberTextElement = wait.until(driver -> {
			return driver.findElement(By.xpath("//input[@id=\"user.phone\"]"));
		});
		phoneNumberTextElement.sendKeys("9444672613");

		WebElement continueOnPaymentInformation = wait.until(driver -> {
			return driver.findElement(By.xpath("//button[@class=\"btn btn-lg btn-block btn-secondary\"]"));
		});
		continueOnPaymentInformation.click();
	}

}
