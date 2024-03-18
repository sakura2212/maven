package basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonutils.PropertyFileUtil;
import commonutils.WebDriverUtil;

//class name => suffix mandatory Test
public class OrganisationTest {

	//method name => suffix mandatory Test
	@Test
	public void createOrgTest() throws IOException{
		PropertyFileUtil pf =new PropertyFileUtil() ;
		WebDriverUtil wu = new WebDriverUtil() ;
		
		WebDriver driver =new ChromeDriver() ;
		
		//driver.get("http://localhost:8888/");
		String url = pf.getDataFromPropertyFile("Url") ;
		String userName = pf.getDataFromPropertyFile("Username") ;
		String userPass = pf.getDataFromPropertyFile("Password") ;
		
		//launch appln
				driver.get(url);
				
				//login cred
				driver.findElement(By.name("user_name")).sendKeys(userName);
				driver.findElement(By.name("user_password")).sendKeys(userPass);
				driver.findElement(By.id("submitButton")).click();
		
	}
}
