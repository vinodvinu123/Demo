package TestNG;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_NopCommerse {
	WebDriver driver;
	@BeforeMethod
	void launch() {
		driver=new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
	}
	@Test
	void login() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mail=driver.findElement(By.xpath("//input[@id='Email']"));
		mail.clear();
		mail.sendKeys("admin@yourstore.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@class='password']"));
		pwd.clear();
		pwd.sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		String Expres="Dashboard";
		String actres=driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText();
		System.out.println(actres);
		//validation
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(Expres, actres);
		sa.assertAll();	
	}

}
