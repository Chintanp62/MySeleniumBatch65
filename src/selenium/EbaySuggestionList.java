package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("mobile");
		Thread.sleep(3000);

		WebElement suggestion = driver.findElement(By.xpath("//ul[@id='ui-id-1']"));
		List <WebElement> alllist = suggestion.findElements(By.tagName("a"));
		System.out.println(alllist.size());
		
		for(WebElement b:alllist) {
			System.out.println(b.getText());
			}
	}

}
