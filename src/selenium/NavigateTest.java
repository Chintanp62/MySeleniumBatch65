package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");// same as driver.get();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
