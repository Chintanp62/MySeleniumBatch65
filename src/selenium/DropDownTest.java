package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://www.ebay.ca/");
		
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
	System.out.println(alloptions.size());
	

		
	for(int i=0; i<alloptions.size(); i++) {
		//if(alloptions.get(i).isSelected())
		System.out.println(alloptions.get(i).getText()+"--------"+alloptions.get(i).isSelected());
		
		//Selecting from the dropdown - to select from the dropdown we use inbuilt select class from selenium
		//pass the webelement as a parameter from where we want to select
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s= new Select(box);
		
		s.selectByIndex(2);
		Thread.sleep(3000);
		
		s.selectByValue("2984");
		Thread.sleep(3000);
		
		s.selectByVisibleText("Books");
		System.out.println("------------AfterSelection--------");
		 
		for( i  =0; i<alloptions.size(); i++) {
			if(alloptions.get(i).isSelected())
			System.out.println(alloptions.get(i).getText()+"--------"+alloptions.get(i).isSelected());
			
		
		}
		}
	}}
	
