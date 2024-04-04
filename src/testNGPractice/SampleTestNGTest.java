package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNGTest {
	
	@BeforeClass
	public void dbconnection()
	{
	  System.out.println("connect to db");	  
	}
	
	@AfterClass
	public void closedb() {
		System.out.println("close db");
	}

	@BeforeMethod
	public void login()
	{
		System.out.println("Login to application");
	
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from application");
	}
	
	@Test(priority=-2,invocationCount = 4,testName="Actitime create customer")
	public void create_customer() {
		System.out.println("Create Customer");
	}
	
	@Test(priority=-1,invocationCount = 4)
	public void delete_customer()
	{
		System.out.println("delete the customer");
	}

}
