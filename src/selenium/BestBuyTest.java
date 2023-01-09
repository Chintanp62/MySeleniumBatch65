package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.bestbuy.ca/en-ca/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@data-automation='x-shop']")).click();
		Thread.sleep(2000);
		
		List<WebElement> alllink = driver.findElements(By.xpath("(//div[@data-automation='menu-main-l1'])[1]/a"));
		System.out.println(alllink.size());
		
		for(WebElement a:alllink) {
			System.out.println(a.getText());
		}

	}
}

