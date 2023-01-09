package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	private static final boolean WebElement = false;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		System.out.println(all.size());
		
		
			for(WebElement a:all) {
				System.out.println(a.getText());
			}
			
		}
	

	}


