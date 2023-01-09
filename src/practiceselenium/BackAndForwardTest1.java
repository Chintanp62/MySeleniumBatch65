package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://ca.yahoo.com/");
		driver.findElement(By.partialLinkText("ews")).click();;
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

	}

}
