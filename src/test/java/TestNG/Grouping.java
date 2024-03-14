package TestNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="smoke")
	void launch() {
		System.out.println("launch");
	}
	@Test(groups={"smoke","sanity"})
	void login() {
		System.out.println("login");
	}
	@Test(groups={"smoke","regression"})
	void search() {
		System.out.println("search");
	}
	@Test(groups={"regression","retest"})
	void addproduct() {
		System.out.println("addproduct");
	}

}
