package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeDepotTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.homedepot.ca/en/home.html");
		
		driver.findElement(By.xpath("//span[@class='acl-main-nav-item__label ng-star-inserted'][contains(text(),'Shop by Department')]")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> dept= driver.findElements(By.xpath("//div[@id='acl-flyout-menu-main__focus-wrapper--l1']//a"));
		System.out.println(dept.size());
		

	}
	
}
