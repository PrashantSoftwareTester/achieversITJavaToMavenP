package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenders {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(500);
        driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//img[@class='date-button-image'])[1]")).click();
        String month="June 2024";
        String date="20";
        int i=1;
        while(i<=12) {
        	try {
        		//driver.findElement(By.xpath("//tr[td[table[tbody[tr[td[em[button[text()='June 2024']]]]]]]]/following-sibling::tr[1]/descendant::span[text()='20']")).click();
        		
        		driver.findElement(By.xpath("//tr[td[table[tbody[tr[td[em[button[text()='"+month+"']]]]]]]]/following-sibling::tr[1]/descendant::span[text()='"+date+"']")).click();
        		break;
        	}catch(Throwable t) {
        		driver.findElement(By.xpath("//a[@title='Next Month (Control+Right)']")).click();
        		Thread.sleep(500);
        	}
        	i++;
        }
		
		
		
		
		

	}

}
