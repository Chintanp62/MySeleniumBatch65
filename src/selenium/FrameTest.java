package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://jqueryui.com/droppable/");
		
	
		List<WebElement> element = driver.findElements(By.linkText("Sortable"));
		System.out.println(element.size());
		 if (element.size()>0) {
			 System.out.println("Element Present");
			 
		 }else {
			 System.out.println("Element is Not Present");
		 }


			List<WebElement> box = driver.findElements(By.xpath("//div[@id='draggable']"));
			System.out.println(box.size());
			if(box.size()>0) {
				System.out.println("Box is Present");
			}else {System.out.println("Box is not present");
	}
			driver.switchTo().frame(0);//By index
			//driver.switchTo().frame("demo-frame");
			//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); By Webelement
			
			System.out.println("--------------------Switched to the frame-------");
			
			
			 element = driver.findElements(By.linkText("Sortable"));
			System.out.println(element.size());
			 if (element.size()>0) {
				 System.out.println("Element Present");
				 
			 }else {
				 System.out.println("Element is Not Present");
			 }


				 box = driver.findElements(By.xpath("//div[@id='draggable']"));
				System.out.println(box.size());
				if(box.size()>0) {
					System.out.println("Box is Present");
				}else {System.out.println("Box is not present");
		}
				System.out.println("--------------Switching back to main page------------");
				
				driver.switchTo().defaultContent();
				

				 element = driver.findElements(By.linkText("Sortable"));
				System.out.println(element.size());
				 if (element.size()>0) {
					 System.out.println("Element Present");
					 
				 }else {
					 System.out.println("Element is Not Present");
				 }


					 box = driver.findElements(By.xpath("//div[@id='draggable']"));
					System.out.println(box.size());
					if(box.size()>0) {
						System.out.println("Box is Present");
					}else {System.out.println("Box is not present");
			}
				
	}
}
