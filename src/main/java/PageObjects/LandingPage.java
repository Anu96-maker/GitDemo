package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
	
		this.driver=driver;
	}
	
	
	By drop=By.cssSelector("[aria-label='Account'] i");
	By logout=By.xpath("//*[text()='Log Out']");
	
	
	public WebElement drop()
	{
		return driver.findElement(drop);
	}
	
	public WebElement log()
	{
		return driver.findElement(logout);
	}

}
