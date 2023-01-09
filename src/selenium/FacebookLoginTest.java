package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.facebook.com/login/");
		
		
		//1.classname- for class attribute//Space in the class name, we cannot use this option directly
		//driver.findElement(By.className("inputtext_55rl_6luy")).sendKeys("fejenvrskbvrbtrkbt");
		
		//2.cssselector, syntax for Css selector
		//driver.findElement(By.cssSelector(null));
		
		//3. id- id attribute working
		driver.findElement(By.id("email")).sendKeys("fedsvgmdvsdvmrssgr");
		
		//4linkText- only for links
       // driver.findElement(By.linkText(null));
		
		//5.name- name attribute- working
		//driver.findElement(By.name("email")).sendKeys("dgkevnedgkegrff");
		
		//6. partiallinkText- only for links
		//driver.findElement(By.partialLinkText(null));
		
		//7. tagname- not working, not unique
		//driver.findElement(By.tagName("input")).sendKeys("sgfrjegnrkhbfegr");
		
		//8.xpath- syntax for xpath
		
		//Password
		driver.findElement(By.name("pass")).sendKeys("gjegnegksg4wegksvs");
		
		//Login Button
		driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.xpath(null));
		
	}

}
