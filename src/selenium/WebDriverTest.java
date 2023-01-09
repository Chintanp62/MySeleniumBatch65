package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");

//classname objname= new classname();
//FirefoxDriver driver = new FirefoxDriver();
		
// Parentsclassname(interface) object= new classname();
		WebDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.facebook.com/login/");// Open facebook
		
		driver.findElement(By.id("email")).sendKeys("whatevertigdfvdgldmg");//type mail
		driver.findElement(By.id("pass")).sendKeys("jfejgdvjgv mgrgvrd");//type password
		driver.findElement(By.name("login")).click();

	}

}
