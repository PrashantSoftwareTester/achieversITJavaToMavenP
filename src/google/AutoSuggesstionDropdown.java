package google;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesstionDropdown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		Robot rbt=new Robot();
		WebElement wb=driver.findElement(By.xpath("//textarea[@title='Search']"));
		wb.sendKeys("cog");
		Thread.sleep(5000);
		List<WebElement>drp=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li/descendant::b"));
		int i=0;
		while(i<=drp.size()-1) {
			rbt.keyPress(KeyEvent.VK_DOWN);
			if(wb.getAttribute("value").equals("cognizant bangalore")) {
				rbt.keyPress(KeyEvent.VK_ENTER);
				break;
			}
			i++;
		}
		System.out.println("Test Passed");
		driver.quit();

	}

}
