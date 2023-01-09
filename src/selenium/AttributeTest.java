package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.ebay.ca/");
		String s= driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("placeholder");
		System.out.println(s);

		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iphone");
		
		String x = driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("value");
		System.out.println(x);
	}

}
