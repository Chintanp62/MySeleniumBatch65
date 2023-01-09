package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));//another xpath (By.xpath("//ul[@class='main-nav-links']/li[3]//li"));

		
		System.out.println(all.size());
		
		for(WebElement a:all) {
			System.out.println(a.getText());
		}

	}

}
