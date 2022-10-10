package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {

	@BeforeClass(alwaysRun = true)
	public void openBrowser() {
		System.out.println("Browser Opened");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser Closed");
	}
	
	@Test(groups = "Smoke")
	public void Test4() {
		System.out.println("Executing Test4");
	}
	
	@Test(groups = "Functional")
	public void Test5() {
		System.out.println("Executing Test5");
	}
	
	@Test(groups = {"Functional","Regression"})
	public void Test6() {
		System.out.println("Executing Test6");
	}
}
