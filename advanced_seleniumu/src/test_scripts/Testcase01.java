package test_scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic_scripts.Excel;
import generic_scripts.Launch;
import pom_scripts.Login_page;

public class Testcase01 extends Launch
{
	@Test
	void tc1() throws Exception
	{
		String un = Excel.fetchData(1, 0, ex_path);
		String pwd = Excel.fetchData(1, 1, ex_path);
		String expttl = Excel.fetchData(1, 2, ex_path);
		Login_page lp=new Login_page(driver);
		lp.enterEmail(un);
		lp.enterPassword(pwd);
		lp.clickLogin();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(expttl));
		String act = driver.getTitle();
		assertEquals(expttl, act);
	}
} 