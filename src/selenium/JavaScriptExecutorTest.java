package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.adidas.ca/en");
		
		

		WebElement Career=driver.findElement(By.linkText("Careers"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		
		//option1- using x and y cordinate
		//System.out.println(Career.getLocation());
		//jse.executeAsyncScript("window.scrollBy(0, 5000)");
		//Thread.sleep(5000);
		//Career.click();
		
		
		//option 2 - Scroll until the element is in the view
			//	jse.executeScript("arguments[0].scrollIntoView(true);", Career);
				//Career.click();

				
				//option 3 - direct click using JavascriptExecuter
				jse.executeScript("arguments[0].click();", Career);

	}

}
