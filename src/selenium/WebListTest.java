package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.google.com/");
		
		//WebElement firstLink = driver.findElement(By.tagName("a"));
		//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		//List<WebElement> alllinks = footer.findElements(By.tagName("a"));
		
				List<WebElement> allLinks = driver.findElements(By.tagName("a"));
				System.out.println(allLinks.size());
				
				for(int i=0; i<allLinks.size(); i++) {
				System.out.println(allLinks.get(i).getText());
				
		
	}
				
	}}
