package scandproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myclas {

	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void  mystab() {
		
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void  mytest() {}
	
}
