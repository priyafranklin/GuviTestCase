package testcaseSpiceJet;

import pagesSpiceJet.HomePage;
import pagesSpiceJet.LoginPage;

public class TestCaseLoginPage {
	public static void main(String[] args) throws Exception {

		HomePage homepage = new HomePage();

	HomePage.intialize();
	HomePage.navigatedriver();
		
		
		

		LoginPage loginpage = new LoginPage();
		loginpage.openLoginPage();
		loginpage.loginInButton();
		loginpage.ticketBooking();		
	    loginpage.ticketBooking1();
		 loginpage.closeDriver();
	
		
			
	}
}
