package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbFooterListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.facebook.com/login/");
		
		WebElement footer = driver.findElement(By.xpath("//div[@id='pageFooterChildren']"));
		List <WebElement> alllinks = footer.findElements(By.tagName("a"));
		
		
		System.out.println(alllinks.size());
		for(int i = 0; i<alllinks.size(); i++) {
			System.out.println(alllinks.get(i).getText());
			
		}
		
		
	}

}
