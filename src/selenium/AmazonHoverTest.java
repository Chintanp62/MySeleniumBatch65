package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/");
		
		WebElement acount = driver.findElement(By.id("nav-link-accountList"));
		Actions builder = new Actions(driver);
		builder.moveToElement(acount).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(all.size());
		
		
			for(WebElement a:all) {
				System.out.println(a.getText());

	}

}}
