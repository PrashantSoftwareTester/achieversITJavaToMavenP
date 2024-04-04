package htmlgoodies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		List<WebElement> capitals=driver.findElements(By.xpath("//div[@class='dragableBox' and contains(@id,'box')]"));
		List<WebElement> countries=driver.findElements(By.xpath("//div[@id='countries']/div"));
		for(int i=0;i<=capitals.size()-1;i++) {
			for(int j=0;j<=countries.size()-1;j++) {
				act.dragAndDrop(capitals.get(i),countries.get(j)).perform();
				if(capitals.get(i).getCssValue("background-color").equals("rgba(0, 255, 0, 1)")) {
					break;
				}else {
					act.dragAndDrop(capitals.get(i),driver.findElement(By.id("dropContent"))).perform();
				} 
			}

		}
		
		driver.quit();
		System.out.println("Test Passed");
	}
}


