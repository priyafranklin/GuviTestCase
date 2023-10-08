package testcaseBestBuy;

import org.testng.annotations.Test;

import pagesBestBuy.BestBuyHomePage;
import pagesBestBuy.BestBuyLoginPage;
import pagesBestBuy.menuPage;

public class menuPageTestCase {
@Test

	public static void main(String[] args) throws Exception {

		BestBuyHomePage homepage = new BestBuyHomePage();
		homepage.intialize();
		homepage.navigatedriver();

		BestBuyLoginPage loginpage = new BestBuyLoginPage();
		loginpage.setCountry();
		menuPage.TopDeals();
		menuPage.DealoftheDay();
		menuPage.CreditCards();
		menuPage.Giftcards();
		menuPage.selectitem();
		menuPage.contactInformation();

		//loginpage.closeDriver();

	}

}
