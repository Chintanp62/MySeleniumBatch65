package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://echoecho.com/javascript4.htm");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.name("B2")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());

		al.accept();//lick on selected button
		//al.dismiss(); click on non selected button
		
		
		driver.findElement(By.name("B3")).click();
		
		al = driver.switchTo().alert();
				al.sendKeys("Selenium");
				
				al.accept();

	}

}
