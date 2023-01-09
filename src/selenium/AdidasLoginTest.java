package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.adidas.ca/en/account-login");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-email")).sendKeys("sdfsdaghsdgfdsgdsh@test.com");
		driver.findElement(By.id("login-password")).sendKeys("vsdgvsdgsgsdg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		String expectedErr = "Your request timed out – please retry";
		String actualErr = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Pass");
		}else {
			System.out.println("fail");

		
			
		
		
		
	}
	}
}
