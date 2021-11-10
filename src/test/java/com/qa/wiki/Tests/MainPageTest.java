package com.qa.wiki.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.Base.Base;
import com.qa.wiki.Pages.HomePage;
import com.qa.wiki.Pages.MainPage;
import com.qa.wiki.Pages.SearchPage;

public class MainPageTest extends Base{
	
	HomePage hp;
	SearchPage sp;
	MainPage mp;

	@BeforeClass
	public void setup() throws InterruptedException
	{
		initialization();
		hp= new HomePage();
		hp.searchInput("selenium Automation");
		sp= new SearchPage();
		sp.MainPageLinkClick();
		mp= new MainPage();
	}

	@Test(priority='1')
	public void enClickText()
	{
		mp.encyclopediaClick();
	}
	

	@Test(priority='2')
	public void loginlinkTest()
	{
		mp.loginclick();
	}
	
	
	
	
	
	
	
	
	
	
}
