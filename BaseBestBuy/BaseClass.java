package BaseBestBuy;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void intialize() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Padma\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void closeDriver() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public static boolean linkExists(String URLName) {
		try {
			HttpURLConnection.setFollowRedirects(false);
			HttpURLConnection con = (HttpURLConnection) new URL(URLName).openConnection();
			con.setRequestMethod("HEAD");
			return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}