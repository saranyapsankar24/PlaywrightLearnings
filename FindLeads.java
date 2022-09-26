package week2.day1;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FindLeads {
	public static void main(String[] args) {
		
		GraphicsDevice gd =GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		gd.getDisplayMode().getWidth();
		gd.getDisplayMode().getHeight();
		
		
		Playwright pw=Playwright.create();
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page page = browser.newPage();
		page.navigate("http://leaftaps.com/opentaps/control/main");
		page.locator("#username").type("demosalesmanager");
		page.locator("#password").type("crmsfa");
		page.locator(".decorativeSubmit").click();
		page.locator("text=CRM/SFA").click();
		page.locator("a:has-text('Leads')").click();
		page.locator("//a[text()='Find Leads']").click();
		page.locator("//span[text()='Phone']").click();
		page.locator("//input[@name='phoneNumber']").type("9");
		page.locator("button:has-text('Find Leads')").click();
		page.locator("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		String companyName = page.locator("#viewLead_companyName_sp").innerText();
		System.out.println(companyName);
		 page.locator("a:has-text('Delete')").click();
		 page.locator("//a[text()='Find Leads']").click();
		 page.locator("//span[text()='Phone']").click();
		 page.locator("//input[@name='phoneNumber']").type(companyName);
		 page.locator("button:has-text('Find Leads')").click();
		 String noRecord = page.locator("//div[text()='No records to display']").innerText();
		 System.out.println(noRecord);
		 pw.close();
		 
			
		 
		
		
		
		
		
		
		
	}

}
