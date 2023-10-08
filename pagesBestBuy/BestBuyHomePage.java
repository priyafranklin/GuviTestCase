package pagesBestBuy;

import org.testng.annotations.Test;

import BaseBestBuy.BaseClass;

//import org.testng.Assert;
//import org.testng.annotations.Test;

public class BestBuyHomePage extends BaseClass {


	String url = "https://www.bestbuy.com/";
	


	public void navigatedriver() throws Exception {

		if (linkExists(url)) {
			driver.get(url);
		} else {
			throw new Exception("Page not found");
		}

	}

}
