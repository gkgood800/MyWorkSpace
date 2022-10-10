package TestAnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {

		
		@BeforeClass
		public void openBrowser() {
			System.out.println("Browser is open");
		}
		
		@AfterClass
		public void closeBrowser() {
			System.out.println("Browser is close");
		}
		
		
		@Test
		public void m4() {
			System.out.println("Method m4");
		}
		
		@Test
		public void m5() {
			System.out.println("Method m5");
		}
		
		@Test
		public void m6() {
			System.out.println("Method m6");
		}
	
}
