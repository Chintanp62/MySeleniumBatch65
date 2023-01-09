package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
 driver.get("https://ca.yahoo.com/");
 
 	WebElement navigation = driver.findElement(By.id("ybar-navigation"));
    List <WebElement> toplinks = navigation.findElements(By.tagName("a"));
    System.out.println(toplinks.size());
    
    for (WebElement a:toplinks) {
    	System.out.println(a.getText());
    }
	}

}
