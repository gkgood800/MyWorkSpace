package KeywordsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountPractice {

	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser Is Lounched");
	}
	
	@AfterClass 
	public void ClosedBrowser(){
		System.out.println("Browser Is Closed");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("Logged-in to the Application");
	}
	
	@AfterMethod 		
	public void Logout() {
		System.out.println("Logged-out in to the Application");
	}
	
	@Test (priority=1)
	public void HomePageTest() {
		System.out.println("Checked the HomePage of Application");
	}
	
	@Test (priority=2, invocationCount = 5)
	public void NotificationPageTest() {
		System.out.println("Checked the Notification Page of Application");
	}
	 
}
