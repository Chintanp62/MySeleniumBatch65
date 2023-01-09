package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.facebook.com/login/");// Open facebook
		
		driver.findElement(By.id("email")).sendKeys("whatevertigdfvdgldmg");//type mail
		driver.findElement(By.id("pass")).sendKeys("jfejgdvjgv mgrgvrd");//type password
		driver.findElement(By.name("login")).click();
	}

}
