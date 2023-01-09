package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		Thread.sleep(3000);

		String expctedUrl = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
	String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		
		
		if(expctedUrl.equals(actualUrl)&& expectedTitle.equals(actualTitle)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test fail");
		}
	}

}
