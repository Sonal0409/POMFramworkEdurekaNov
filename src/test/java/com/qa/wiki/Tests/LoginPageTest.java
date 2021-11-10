package com.qa.wiki.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.Base.Base;
import com.qa.wiki.Pages.HomePage;
import com.qa.wiki.Pages.LoginPage;
import com.qa.wiki.Pages.MainPage;
import com.qa.wiki.Pages.SearchPage;

public class LoginPageTest extends Base{
	
	HomePage hp;
	SearchPage sp;
	MainPage mp;
	LoginPage lp;
	
	@BeforeClass
	public void Setup() throws InterruptedException
	{
		initialization();
		hp = new HomePage();
		hp.searchInput("Selenium Testing");
		sp= new SearchPage();
		sp.MainPageLinkClick();
		mp = new MainPage();
		mp.loginclick();
		lp= new LoginPage();
	
	}
	
	@Test(priority='1')
	public void enteruserDetailsTest()
	{
		lp.login("sonal04", "abc@123");
	}
	
	@Test(priority='2')
	public void helpLinkTest()
	{
		lp.helpLinkClick();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
