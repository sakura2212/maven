package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//class name => suffix mandatory Test
public class OrganisationTest {

	//method name => suffix mandatory Test
	@Test
	public void createOrgTest(){
		WebDriver driver =new ChromeDriver() ;
		
		driver.get("http://localhost:8888/");
		
	}
}
