package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task_On_Grouping {
	WebDriver driver;
	@Test(groups="smoke")
	void smokeGroup() {
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Phones']")).click();
	}
	@Test(groups="regression")
	void regressionGroup() {
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Laptops']")).click();
	}
	@Test(groups="regression")
	void smokeAndRegressionGroup() {
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Monitors']")).click();
	
    }
}
