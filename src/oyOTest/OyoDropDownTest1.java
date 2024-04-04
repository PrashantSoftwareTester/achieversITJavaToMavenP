package oyOTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OyoDropDownTest1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.oyorooms.com/");
	Thread.sleep(5000);
	WebElement Gur=driver.findElement(By.xpath("//h2[text()='Gurgaon']"));
	Actions act=new Actions(driver);
	act.moveToElement(Gur).perform();
	WebElement golf=driver.findElement(By.xpath("//a[text()='Golf Course Road']"));
    act.click(golf).perform();
    System.out.println("passed");
	
	
	}

}
