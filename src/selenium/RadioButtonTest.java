package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radiobutton = driver.findElements(By.name("group1"));
		System.out.println(radiobutton.size());
		
		for(WebElement a:radiobutton) {
			System.out.println(a.getAttribute("value")+"----------"+a.isSelected());
		}
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		//radiobutton.get(2).click();
		
		for(WebElement a:radiobutton) {
			System.out.println(a.getAttribute("value")+"----------"+a.isSelected());
		}
		
		
	}

}
