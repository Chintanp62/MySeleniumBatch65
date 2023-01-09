package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/\r\n");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		
		Actions builder = new Actions (driver);
		builder.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(1000);
		System.out.println(drop.getText());
		if(drop.getText().equals("Dropped!")){
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}

	}

}
