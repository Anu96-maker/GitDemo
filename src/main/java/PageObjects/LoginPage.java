package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
	
		this.driver=driver;
	}
	
	
	By emailID=By.id("email");
	
	By Pwd=By.id("pass");
	
	By button=By.xpath("//*[text()='Log In']");
	
	By text=By.xpath("//*[@class='_8eso']");
	
	By img=By.cssSelector(".fb_logo._8ilh.img");
	
	
	public WebElement email()
	{
		return driver.findElement(emailID);
	}
	
	public WebElement pass()
	{
		return driver.findElement(Pwd);
	}
	
	public WebElement butt()
	{
		return driver.findElement(button);
	}
	
	public WebElement title()
	{
		return driver.findElement(text);
	}

	public WebElement image()
	{
		return driver.findElement(img);
	}

	
}
