package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());

		al.accept();//lick on selected button
		//al.dismiss(); click on non selected button
		
		Thread.sleep(2000);
		driver.findElement(By.name("B3")).click();
		Thread.sleep(2000);
		al = driver.switchTo().alert();
				al.sendKeys("Selenium");
				Thread.sleep(2000);
				al.accept();
				
		
	}

}
