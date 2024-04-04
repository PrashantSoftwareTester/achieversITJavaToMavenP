package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertClassSoftAssert {
	SoftAssert sft=new SoftAssert();
	
	@Test()
	public void createCustomer() {
		System.out.println("Program Starts");
		System.out.println("Line1");
		System.out.println("Line2");
		sft.assertEquals("actitime","actitime1","Create Customer Assert1");
		System.out.println("Line3");
		System.out.println("Line4");
		System.out.println("Program Ends");
		}
	@Test()
		public void deleteCustomer() {
			System.out.println("Program Starts");
			System.out.println("Line1");
			System.out.println("Line2");
			sft.assertEquals("actitime","actitime1","delete Customer Assert1");
			System.out.println("Line3");
			System.out.println("Line4");
			System.out.println("Program Ends");
			}
		
		@AfterClass
		public void assertCall() {
			
			sft.assertAll();
			
		}
		
	
		
		
		
	}
	
	
	
	
	


