package com.qa.wiki.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.Base.Base;
import com.qa.wiki.Pages.HomePage;

import com.qa.wiki.Pages.SearchPagenew;

public class SearchPageTestnew extends Base {
	
	HomePage hp;
	SearchPagenew sp;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		initialization();
		hp= new HomePage();
		hp.searchInput("selenium Automation");
		sp= new SearchPagenew();
	}

	@Test
	public void searchPageTest() throws InterruptedException
	{
		sp.SearchResults("appium", "documentation");
	}
	
	
	
	
	
	
	
	
	
	
}
