package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OutlookTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://login.live.com/ppsecure/post.srf?wa=wsignin1.0&rpsnv=13&ct=1665455692&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3df31ccd01-8521-67a8-1d9c-e4bc5ab198a9&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015&contextid=436688A4280FA188&bk=1665455693&uaid=b9e0efee0e5647258147ea98366adc9d&pid=0");
Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("chintanp12@outlook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		
	}

}
