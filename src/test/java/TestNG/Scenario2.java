package TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scenario2 {
	@BeforeClass
	void login() {
		System.out.println("login");
	}
	@AfterClass	
	void logout() {
		System.out.println("logout"); 
	}
	@Test(priority=1)
	void search() {     
		System.out.println("search product");
	}
	@Test(priority=2)
	void addproduct() {     
	System.out.println("add product to cart");	
	}

}
