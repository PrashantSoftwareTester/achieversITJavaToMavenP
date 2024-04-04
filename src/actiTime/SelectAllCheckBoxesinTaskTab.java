package actiTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBoxesinTaskTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		Thread.sleep(5000);
		List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(5000);
		for(int i=0;i<=checkbox.size()-1;i++) {

			checkbox.get(i).click();

		}


		System.out.println("Test Passed");

	}

}
