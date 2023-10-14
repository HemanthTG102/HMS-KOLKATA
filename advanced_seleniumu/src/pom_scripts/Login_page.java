package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement logbtn;
	
	public Login_page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void enterEmail(String s)
	{
		email.sendKeys(s);
	}
	
	public void enterPassword(String s)
	{
		pass.sendKeys(s);
	}
	
	public void clickLogin()
	{
		logbtn.click();
	}
}
