package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Task_Parllel_Test {
	WebDriver driver;

	void login() {
		 WebDriver driver =new ChromeDriver();		
		 driver.get("https://www.saucedemo.com");		
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");		
		 driver.findElement(By.xpath("//input[@id='login-button']")).click();	
    }
	void selectDropDown() {
		 Select drpdwn=new Select(driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")));
	     drpdwn.selectByVisibleText("Price (low to high)");
	}
	void addProduct() {
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-onesie\"] ")).click();
		 List<WebElement>options=(List<WebElement>) driver.findElements(By.xpath("//select[@id=\"animals\"]//option"));
	}
	void openshoppingCart() {
		 driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}
	void checkout() {
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	}
	void enterInformation() {
		 driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Vinod");	 	
	 	 driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Kumar");
	 	 driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("517247");
	 	driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	void finish() {
		 driver.findElement(By.xpath("//button[@id='finish']")).click();
	}
	
	
}
