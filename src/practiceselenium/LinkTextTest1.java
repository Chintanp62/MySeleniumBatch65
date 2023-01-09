package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",  "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Store")).click();
		String expcted= "https://store.google.com/CA?utm_source=hp_header&utm_medium=google_ooo&utm_campaign=GS100042&hl=en-CA";
		String actual= driver.getCurrentUrl();
		System.out.println(actual);
		String title= "Google Store for Google Made Devices & Accessories";
		String title1= driver.getTitle();
		System.out.println(title1);
		if (expcted.equals(actual) && title.equals(title1)){
			
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
