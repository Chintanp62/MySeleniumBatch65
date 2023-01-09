package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
         FirefoxDriver driver= new FirefoxDriver();
         driver.get("https://www.td.com/ca/en/personal-banking/");
         Thread.sleep(3000);
         
        WebElement footer =   driver.findElement(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']"));
        List<WebElement> alllinks = footer.findElements(By.tagName("a"));
        
        System.out.println(alllinks.size());
        
        for(int i = 0;i<alllinks.size();i++) {
        	System.out.println(alllinks.get(i).getText());
        }
        
	}

}
