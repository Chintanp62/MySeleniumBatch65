package selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://best.aliexpress.com/?lan=en");
		Thread.sleep(3000);
		List<WebElement> popup1 = driver.findElements(By.xpath("//img[@src='https://img.alicdn.com/tfs/TB1a.Oge_M11u4jSZPxXXahcXXa-48-48.png']"));
		System.out.println(popup1.size());
		
		if(popup1.size()>0) {
			popup1.get(0).click();
		}
		List<WebElement> ad2 = driver.findElements(By.xpath("(//img[@class='_24EHh'])[2]")); 
		System.out.println(ad2.size());
		
		if(ad2.size()>0) {
			ad2.get(0).click();
			//driver.findElement(By.xpath("(//img[@class='_24EHh'])[2]")).click();
			driver.findElement(By.xpath("(//img[@class='_24EHh'])[1]")).click();
		}
		List<WebElement> popup3 = driver.findElements(By.xpath("//img[@class='close-btn']"));
		System.out.println(popup3.size());
		
		if(popup3.size()>0) {
			popup3.get(0).click();
		}
		
		Thread.sleep(2000);
		
	
/*List<WebElement> ad2 = driver.findElements(By.xpath("(//img[@class='_24EHh'])[2]")); 
		System.out.println(ad2.size());
		
		if(ad2.size()>0) {
			ad2.get(0).click();
			//driver.findElement(By.xpath("(//img[@class='_24EHh'])[2]")).click();
			driver.findElement(By.xpath("(//img[@class='_24EHh'])[1]")).click();
		}
*/
		
	
	     driver.findElement(By.id("search-key")).sendKeys("Computer");
	
	
	}

}
