package week2.day1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CreateLead {
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
	page.locator("text=Create Lead").click();
	page.locator("#createLeadForm_companyName").type("TestLeaf");
	page.locator("#createLeadForm_firstName").type("Saranya");
	page.locator("#createLeadForm_lastName").type("Sankar");
	page.locator("#createLeadForm_primaryPhoneNumber").type("9863587413");
	page.locator(".smallSubmit").click();
	String status = page.locator("#viewLead_statusId_sp").innerText();
	System.out.println(status);
	
	
}
}
