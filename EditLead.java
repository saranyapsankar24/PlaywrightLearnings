package week2.day1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class EditLead {
public static void main(String[] args) {
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
	page.locator("(//input[@name='firstName'])[3]").type("Babu");
	page.locator("button:has-text('Find Leads')").click();
	page.locator("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	page.locator("a:has-text('Edit')").click();
	Locator firstName = page.locator("#updateLeadForm_firstName");
	firstName.fill("");
	firstName.type("Saranya");
	page.locator("text=Update").click();
	String updatedName = page.locator("span:has-text('Forename')").innerText();
	System.out.println(updatedName);
	
	
	
	
	
}
}
