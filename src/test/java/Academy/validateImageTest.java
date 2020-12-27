package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import junit.framework.Assert;
import resources.base;

public class validateImageTest extends base {
	public  WebDriver driver;

	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void init() throws IOException {
		driver = getData();

		driver.get(prop.getProperty("url"));

	}

	@Test
	public void validate() throws IOException {

		
		LoginPage lp = new LoginPage(driver);

		Assert.assertTrue(lp.image().isDisplayed());
		log.info("validate Image");

	}

	@AfterTest
	public void last() {
		driver.close();
	}

}
