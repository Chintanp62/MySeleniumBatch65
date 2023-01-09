package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
			
			FirefoxDriver driver = new FirefoxDriver();//Open firefox
			driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1326183725%3A1663531299854152&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWo_-lKfFMle0qqVp_QeJydJAnbp3DHARZ6gP5fvIxzEu0w4cXhjXydFkzVKLOqWg7HdLdCIuA");
	
	driver.findElement(By.linkText("Help")).click();
	Thread.sleep(3000);
	Set<String> allwindows= driver.getWindowHandles();
	System.out.println(allwindows.size());
	
	Iterator<String> itr= allwindows.iterator();
	String parentwindow= itr.next();
	String childwindow= itr.next();
	
	System.out.println(parentwindow);
	System.out.println(childwindow);
	
	driver.switchTo().window(childwindow);
	System.out.println(driver.getTitle());
	driver.close();// close the window we are in
	
	driver.switchTo().window(parentwindow);
	System.out.println(driver.getTitle());
	driver.close();// close all the windowa and kill the driver
	
	
	
	}

}
