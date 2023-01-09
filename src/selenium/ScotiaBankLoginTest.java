package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();//Open firefox
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=QM-ZkAg5gDc&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiUU0tWmtBZzVnRGMiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2Mjg0MDUxNywiaWF0IjoxNjYyODM5MzE3LCJqdGkiOiJmMWYxYWFjMS0xYWQ3LTQyM2QtODQ4Ni00MWU2MDMxMWM4NjUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.pNwBAsO48ErO2H8LwswwqGGt64cI3KXBMbFL223qfZV_jthC2rY7Dy1rtGf0nuZ0WZXE_81hpqEqsA98q0HjZhGhie6YkWbQhRXQ2QO3yu4bSQ8X6K61aJuGDmwlyaxx-9Vu96ESL3q-z8l9SgLqy8TM8jb1q9TsFDFAY1x7gkDvK11J--G8t0Xsm2veIPY25ne5Wz7212bxxwpyRSetcPVliqRaqfrN2eTnFaeD4SlH5DiPJ235CfVjQsZyP1RhnzFHFbydjptKAwAbGTRUBf8jwAN-oRQt2dAvJ15rSxuvYv-vFkuS_Yaa8tuyj2HaZT8-EjE0LW-gYMKg97uYiQ&preferred_environment=");
		driver.findElement(By.id("usernameInput-input")).sendKeys("vsdagsfhddfghsdfhf@#$");
		driver.findElement(By.name("password")).sendKeys("sadgvsdfbsdfgdd");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(2000);
	
		String expectedError = "Please enter a username or card number without special characters.";
		String actualError = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualError);
		
		if(expectedError.equals(actualError)) {
			System.out.println("Pass");
		}else {
			System.out.println("fail");
		}
	}
}
