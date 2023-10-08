package pagesSpiceJet;

import baseSpiceJet.BaseClass;

public class HomePage extends BaseClass {
		
		static String url = "https://www.spicejet.com/";
		
		public static void navigatedriver() throws Exception{
			
			
			if(linkExists(url)) {
				driver.get(url);
			}else {
				throw new Exception("Page not found");
			}
			
		}

	}