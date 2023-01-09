package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EBayHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
		
 driver.get("https://www.ebay.ca/");
 
 List <WebElement> alllinks= driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li/a"));
 	
 	System.out.println(alllinks.size());
 	
 	for(WebElement a:alllinks) {
 		System.out.println(a.getText());
 	}
	}

}
