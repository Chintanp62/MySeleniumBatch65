package selenium;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.nike.com/ca/");
		
		WebElement shoes = driver.findElement(By.linkText("Men"));
		Actions builder = new Actions(driver);
		builder.moveToElement(shoes).build().perform();
		
		Thread.sleep(4000);
		
		List<WebElement> all = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		Thread.sleep(4000);
		
		System.out.println(all.size());


        for (WebElement a:all) {
        	System.out.println(a.getText());
        }}
	}


