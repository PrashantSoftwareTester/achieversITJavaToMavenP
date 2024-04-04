package testNGPractice;

import org.testng.annotations.Test;

public class SampleTestNGTest1 {
	
	@Test(priority=-2)
	public void create_user() {
		System.out.println("Create user");
	}
	
	@Test(priority=-1)
	public void delete_user()
	{
		System.out.println("delete the user");
	}
	
	
	
	
	
	

}
