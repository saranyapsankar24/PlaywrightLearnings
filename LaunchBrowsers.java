package week2.day1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchBrowsers {
	public static void main(String[] args) {
		
		//Initialize playwright
		Playwright pw=Playwright.create();
		
		// Launch the browser
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		/*
		 * //MS Edge Browser browser = pw.chromium().launch(new
		 * BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false));
		 */
		
		/*
		 * Browser browser = pw.firefox().launch(new
		 * BrowserType.LaunchOptions().setHeadless(false));
		 */
		
		/*
		 * Browser browser = pw.webkit().launch(new
		 * BrowserType.LaunchOptions().setHeadless(false));
		 */
		
		
		//Open a new page
		Page page = browser.newPage();
		
		//Navigae to URL
		
		page.navigate("http://leaftaps.com/crmsfa/control/myHomeMain");
		
		browser.close();
		
		
		
		
		
		
	
	}

}
