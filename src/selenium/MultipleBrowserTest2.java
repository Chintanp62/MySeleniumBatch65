package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



public class MultipleBrowserTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		Xls_Reader d = new Xls_Reader("C:\\Selenium\\testing\\NikulTest.xlsx");
		String browser =d.getCellData("Data1", "Browser", 2);
		
		WebDriver driver;
		if(browser.equals("Firefox"))
		
		{
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
			
			 driver = new FirefoxDriver();

	}else if (browser.equals("Chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}else {
System.setProperty("webdriver.safari.driver", "C:\\Selenium\\SeleniumJars\\safaridriver.exe");
		
		 driver = new SafariDriver();
	}
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("fedsvgmdvsdvmrssgr");
		driver.findElement(By.name("pass")).sendKeys("gjegnegksg4wegksvs");
		driver.findElement(By.tagName("button")).click();


		
		
	}

}
