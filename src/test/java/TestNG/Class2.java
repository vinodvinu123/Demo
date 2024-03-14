package TestNG;

import org.testng.annotations.Test;

public class Class2 {
	@Test(priority=1)
	void search() {     
		System.out.println("search product");
	}
	@Test(priority=2)
	void addproduct() {     
	System.out.println("add product to cart");	
	}
}
