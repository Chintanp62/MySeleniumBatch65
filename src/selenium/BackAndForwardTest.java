package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.google.com/");
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
	wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		wait.until(ExpectedConditions.titleIs("Google"));
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());


	}

}
