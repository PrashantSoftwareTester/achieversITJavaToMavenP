package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClassHardAssert {
	
	@Test()
	public void create_customer() {
		System.out.println("Program starts");
		System.out.println("Line1");
		System.out.println("Line2");
		Assert.assertEquals("actitime", "actitime1");
		System.out.println("Line3");
		System.out.println("Line4");
		System.out.println("Program Ends");
	}
	
	@Test()
	public void delete_customer()
	{
		System.out.println("Program starts");
		System.out.println("Line1");
		System.out.println("Line2");
		System.out.println("Line3");
		System.out.println("Line4");
		System.out.println("Program Ends");
		
		
	}
}

	



