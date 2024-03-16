package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactTest {

	//method name => suffix mandatory Test
	@Test
	public void createContactTest(){
		WebDriver driver =new ChromeDriver() ;
		
		driver.get("https://www.ajio.com/");
		
	}
}
