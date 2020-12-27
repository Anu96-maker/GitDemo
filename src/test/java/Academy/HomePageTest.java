package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.base;

public class HomePageTest extends base {

	public  WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void init() throws IOException {
		driver = getData();

		

	}

	@Test(dataProvider = "data")
	public void baseNavigation(String username, String pwd, String text) throws IOException {

		driver.get(prop.getProperty("url"));
		LoginPage lp = new LoginPage(driver);

		lp.email().sendKeys(username);

		lp.pass().sendKeys(pwd);

		//System.out.println(text);
		log.info(text);
		lp.butt().click();

		
		  LandingPage lo = new LandingPage(driver);
		  
		  lo.drop().click();
		  
		  lo.log().click();
		  
		 	}

	@DataProvider
	public Object[][] data() {
		Object[][] ob = new Object[2][3];

		ob[0][0] = "anu.saroha96@gmail.com";
		ob[0][1] = "anujankit";
		ob[0][2] = "NonRestricted";

		ob[1][0] = "anu.saroha86@gmail.com";
		ob[1][1] = "jaimatadis";
		ob[1][2] = "Restricted";

		return ob;
	}

	@AfterTest
	public void last() {
		driver.close();
	}

}
