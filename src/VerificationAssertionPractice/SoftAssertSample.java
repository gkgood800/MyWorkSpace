package VerificationAssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSample {

	// Soft Assert:- Non Static Methods
	
	@Test											
	public void test1() {
		SoftAssert soft = new SoftAssert();
		String str1 = "Hello";
		soft.assertEquals(str1, "Hii");			//FAIL
		System.out.println(str1);
	
		
		String str2 = "Hi";
		soft.assertEquals(str2, "Hi");			//PASS
		System.out.println(str2);
		
		soft.assertAll();
	}
}
