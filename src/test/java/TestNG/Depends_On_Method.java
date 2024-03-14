package TestNG;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Depends_On_Method {
	WebDriver driver;
	@Test(priority=1,invocationCount=2)
	void launch() {
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Assert.assertTrue(false);//fail the method
	}
@Test(priority=2,dependsOnMethods="launch")
	void login() throws InterruptedException {
		WebElement mail=driver.findElement(By.xpath("//input[@id='Email']"));
		mail.clear();
		mail.sendKeys("admin@yourstore.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@class='password']"));
		pwd.clear();
		pwd.sendKeys("admin");
driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		String Expres="Dashboard";
		String actres=driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText();
		System.out.println(actres);
		//validation
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(Expres, actres);
		sa.assertAll();
	}
	@Test(priority=3,dependsOnMethods="login")
	void close() {
		driver.quit();
	}

}
