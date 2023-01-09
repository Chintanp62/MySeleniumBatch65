package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stubgeckodriver.exe
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/");
				List <WebElement> alllinks = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		 
		
		System.out.println(alllinks.size());
		
		for(WebElement a: alllinks) {
			System.out.println(a.getText());
		}
	}

}
