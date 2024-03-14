package TestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task_CloudTesla {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://e2e.cloudtesla.com/authentication/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://e2e.cloudtesla.com/authentication/signup");
	}
	@Test
	void signup() throws IOException, InterruptedException  {
		String file=System.getProperty("user.dir")+"/Data/Test Data Task.xlsx";
		//get num of rows
		int rows=Utiles.getRowCount(file, "Sheet1");
		for(int r=0;r<=rows;r++) {
			//read from excel
			String Password=Utiles.getCellData(file, "Sheet1", r, 0);
			String Name=Utiles.getCellData(file, "Sheet1", r, 1);
			String Clientid=Utiles.getCellData(file, "Sheet1", r, 2);
			String Phonenumber=Utiles.getCellData(file, "Sheet1", r, 3);
			String email=Utiles.getCellData(file, "Sheet1", r, 4);
			String username=Utiles.getCellData(file, "Sheet1", r, 5);
			String description=Utiles.getCellData(file, "Sheet1", r, 6);
			//pass to website
		

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Name);
		Thread.sleep(rows);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(Clientid);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(Phonenumber);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='desc']")).sendKeys(description);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		}
	}
}
