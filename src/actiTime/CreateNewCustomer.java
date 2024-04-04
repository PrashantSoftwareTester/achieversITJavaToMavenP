package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewCustomer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Amit Kumar");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("This is a gold customer");
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		
		
		
		
		
		
		
		
		

	}

}
