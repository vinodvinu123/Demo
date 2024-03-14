package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_Methods {
	WebDriver driver;
	@BeforeMethod
void openapp() throws InterruptedException {
		   driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
}
	@Test
void login() throws InterruptedException {
		   
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			 Thread.sleep(3000);
}
    @Test
void logout() throws InterruptedException {
    	
		   driver.findElement(By.className("oxd-userdropdown-tab")).click();
		   driver.findElement(By.xpath("//a[text()='Logout']")).click();
		   Thread.sleep(3000);
		   
}
	@AfterMethod
void closeapp() {
	       driver.close();
}
}
