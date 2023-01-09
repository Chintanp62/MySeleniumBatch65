package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("https://ca.yahoo.com/?p=us");
		
		 List<WebElement> alltrendings = driver.findElements(By.xpath("//div[@id='module-trending']//a"));
		
    
		
		System.out.println(alltrendings.size());
		
		for( int i =0; i<alltrendings.size(); i++) {
			System.out.println(alltrendings.get(i).getText());
		}

	}

}
