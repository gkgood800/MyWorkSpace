package PomWithPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {  // methods call. // Testcases.
	// Browser setup ==> validations apply ==> browser close.
		
		WebDriver driver;
		 
		@BeforeClass
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Notes\\Auto\\Selenium All jar files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@AfterClass
		public void teardown() {
			//driver.close();
		}
		
		
		@Test
		public void FacebookRegistrationPageTest_Positive() {
			
			RegistrationPage rp = new RegistrationPage(driver);
			rp.ClickFacebookSignupLink();
			rp.VerifyFacebookRegistrationPageFblogo();
			rp.VerifyFacebookRegistrationPageAlreadyAccount();
			rp.SetFacebookRegistrationPageLastname();
			rp.SetFacebookRegistrationPageFirstname("ABC");
			rp.SetFacebookRegistrationPageMobileEmail();
			rp.SetFacebookRegistrationPageReEnterMobileEmail();
			rp.SetFacebookRegistrationPagePassword();
			rp.SetFacebookRegistrationPageBirthDay();
			rp.SetFacebookRegistrationPageBirthMonth();
			rp.SetFacebookRegistrationPageBirthYear();
			rp.SetFacebookRegistrationPageGender("male");
			rp.ClickFacebookRegistrationPageSubmitBtn();
			driver.navigate().back();
		}
		
}
