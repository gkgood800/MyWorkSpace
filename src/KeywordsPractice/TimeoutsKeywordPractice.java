package KeywordsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeoutsKeywordPractice {

	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser is Launched.");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser is closed.");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("logged in to the application.");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logged out from the application");
	}
	
	@Test (priority = 1, timeOut = 5000)
	public void HomePageTest() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Checked the homepage of the application");
	}
	
	@Test(priority = 2,invocationCount = 5)
	public void NotificationPageTest() {
		System.out.println("Checked the notification page of the application");
	}
}
