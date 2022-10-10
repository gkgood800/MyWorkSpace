package VerificationAssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertSample {

	@Test											//Whenever assert fails==>Next lines of code doesn't executes
	public void test1() {
		String str1 = "Hello";
		Assert.assertEquals(str1, "Hii");			//FAIL
		System.out.println(str1);
	
		
		String str2 = "Hi";
		Assert.assertEquals(str2, "Hi");			//PASS
		System.out.println(str2);
	}
	
}
