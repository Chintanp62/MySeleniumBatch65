package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.name("lastname")).sendKeys("saegsayhgsgfsdg");
		driver.findElement(By.name("reg_email__")).sendKeys("6475862386");
		driver.findElement(By.id("password_step_input")).sendKeys("dsgsdhethsfgsd");
		
		WebElement box = driver.findElement(By.id("month"));
		Select s = new Select(box);
		s.selectByVisibleText("Jul");
		
		WebElement date= driver.findElement(By.id("day"));
		Select d = new Select(date);
		d.selectByVisibleText("11");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select (year);
		y.selectByVisibleText("2000");
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
       
	}
	

}
