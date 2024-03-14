package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario1 {
	@BeforeMethod
void login() {
	System.out.println("login");
}
	@AfterMethod
void logout() {
	System.out.println("logout");
}
@Test(priority=1)
void search() {     //main method
	System.out.println("search product");
}
@Test(priority=2)
void addproduct() {     //main method
System.out.println("add product to cart");	
}

}
