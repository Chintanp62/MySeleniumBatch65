package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();//Open firefox
		driver.get("https://www.facebook.com/login/");
		

	}

}
