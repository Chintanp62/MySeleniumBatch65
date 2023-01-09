package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("saegsayhgsgfsdg");
		driver.findElement(By.cssSelector("#pass")).sendKeys("ergregdveggescsv");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#u_0_5_OR")).click();

	}

}
