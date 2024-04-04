package amazonTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllChkBoxinMobileTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=12572206691776078632&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062010&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Thread.sleep(5000);
		List<WebElement>chkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(5000);
		for(int i=0;i<=chkbox.size()-1;i++) {
			chkbox.get(i).click();
		}


		System.out.println("Test Passed");

	}

}
