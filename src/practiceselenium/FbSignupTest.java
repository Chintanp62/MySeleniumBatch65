package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbSignupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("lastname")).sendKeys("sfejenfegskgrg");
		driver.findElement(By.name("reg_email__")).sendKeys("3858392010");
		driver.findElement(By.name("reg_passwd__")).sendKeys("gejgesvdskvsdr");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		
	}

}
