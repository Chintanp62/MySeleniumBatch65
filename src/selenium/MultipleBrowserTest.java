package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browser= "Chrome";//Chrome//We will read this value from data file like excel
		WebDriver driver;
		if(browser.equals("Firefox"))
		
		{
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
			
			 driver = new FirefoxDriver();

	}else if (browser.equals("Chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}else {
System.setProperty("webdriver.safari.driver", "C:\\Selenium\\SeleniumJars\\safaridriver.exe");
		
		 driver = new SafariDriver();
	}
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.name("lastname")).sendKeys("saegsayhgsgfsdg");
		driver.findElement(By.name("reg_email__")).sendKeys("6475862386");
		driver.findElement(By.id("password_step_input")).sendKeys("dsgsdhethsfgsd");
		
		
	}
}
