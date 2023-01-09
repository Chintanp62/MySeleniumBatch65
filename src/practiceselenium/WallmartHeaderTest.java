package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WallmartHeaderTest {

	private static final boolean WebElement = false;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.walmart.ca/en");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-ecdloo e1rio6v31']")).click();
		Thread.sleep(4000);
		
		List<WebElement> names = driver.findElements(By.xpath("//li[@data-automation='category-list-fallback']"));
		
		System.out.println(names.size());
		for(WebElement a:names){
			System.out.println(a.getText());
			
		}
	}

}
