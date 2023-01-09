package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
		
 driver.get("https://www.ebay.ca/");
 
 //add common.io jar to the project
 File screenshotfile= ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(screenshotfile, new File("C:\\Selenium\\testing\\Screenshot.png"));
	}

}
