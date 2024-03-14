package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task_Amazon {
	WebDriver driver;
	@Test
	void launch() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=8288066175582356485&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
		driver.manage().window().maximize();
	
		String Expres=".in";
		String actres=driver.findElement(By.xpath("//a[@aria-label='Amazon.in']")).getText();
		System.out.println(actres);
		//validation
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(Expres, actres);
		sa.assertAll();	
	
}
	
}
