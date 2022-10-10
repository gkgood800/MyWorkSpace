package VerificationAssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicVerificationPractice {

	//1. AssertEquals() :- If Actual and Expected are Matching
	
		@Test
		public void test1() {
			String Actual = "Hi";
			String Expected = "Hello";
			Assert.assertEquals(Actual, Expected);
		}
	
	// 2. AssertNotEquals():- if actual and expected are not matching then TC will pass.

		/*@Test
		public void test2() {
			String Actual="Hi";
			String Expected="Hellos";
			Assert.assertNotEquals(Actual, Expected);
		}*/
	
	// 3. Assert Null :- TC will pass if field is empty
	
		/*@Test
		public void test3() {
			String products=null;
			Assert.assertNull(products);
		}*/
	
	// 4. Assert not Null :- TC will pass if field is not empty
	
		/*@Test
		public void test4() {
			String products="1500";
			Assert.assertNotNull(products);
		}*/
	
	// 5. Assert fail() :- for purposefully failing  the TC.
	
		@Test
		public void test4() {
			String products="1500";
			Assert.fail();
		}
	
}
