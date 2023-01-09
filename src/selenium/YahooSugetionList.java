package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSugetionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("canada");
		Thread.sleep(3000);
		
		
		List<WebElement> alllink  = driver.findElements(By.xpath("//ul[@class='_yb_17qmx']/li"));
		
		
		System.out.println( alllink.size());
		
		for(WebElement a: alllink) {
			System.out.println(a.getText());
		}
	}
}
