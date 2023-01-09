package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S201536013%3A1662310282036478&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmXGCyuu2MppkhcjC8gXJiLTlSN9oSBf3IyE0GtPVi8HnowZy1_2ioo6laPjp2W_OOTaSftQ");
		Thread.sleep(3000);
		
		driver.findElement(By.id("identifierId")).sendKeys("jegfnegkeegfgefefv@gmail.com");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		String expectederror = "Couldn’t find your Google Account";
		String actualerror = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(actualerror);
		
		if(expectederror.equals(actualerror)) {
			System.out.println("TestPass");
		}else {
			System.out.println("Test Fail");
			
		}
	}
		
	


	

}
