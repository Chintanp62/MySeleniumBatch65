package practiceselenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.ebay.ca/");
		Thread.sleep(3000);
		
		List<WebElement> allchoice = driver.findElements(By.xpath("//select[@id='gh-cat']//option"));
		System.out.println(allchoice.size());
		
		
		for (WebElement a:allchoice) {
			System.out.println(a.getText()+"--------"+a.isSelected());
			
			WebElement box = driver.findElement(By.id("gh-cat"));
			Select s = new Select (box);
			s.selectByIndex(2);
			Thread.sleep(3000);
			
			s.selectByValue("2984");
			Thread.sleep(3000);
			
			s.selectByVisibleText("Books");
			
			System.out.println("-----After Selection-------");
			
			for( int i = 0; i < 36; i++) {
				System.out.println(allchoice.get(i).getText()+"--------"+allchoice.get(i).isSelected());}
				
				
		}
	}
	}

