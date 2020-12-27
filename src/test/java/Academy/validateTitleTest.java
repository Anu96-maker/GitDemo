package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import junit.framework.Assert;
import resources.base;

public class validateTitleTest extends base {
	
	public  WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void init() throws IOException {
		driver = getData();
		log.info("Open Browser");

		driver.get(prop.getProperty("url"));
		log.info("Open URL");

	}

	
	@Test
	public void validate() throws IOException
	{
		
       
		LoginPage lp=new LoginPage(driver);
		
		Assert.assertEquals("Facebook helps you connect and share with the people in your lifes.", lp.title().getText());
		log.info("validate title");
		
		
			}
	
	@AfterTest
	public void last()
	{
		driver.close();
	}

}
