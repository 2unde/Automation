package com.autotrader.test;

import org.junit.*;

import com.autotrader.helper.AutotraderHelper;
import com.autotrader.pages.HomePage;
import com.autotrader.pages.SearchResultPage;

public class SearchForACarWithinAParticularPriceRange extends AutotraderHelper
{
	private HomePage homepage;
	private SearchResultPage searchPage;
	
	@Before
	public void setUp() throws Exception
	{
		launchBrowser("Chrome");
		homepage = new HomePage();
		searchPage = new SearchResultPage();
		
	}
	
	@After
	public void tearDown() throws Exception
	{
		closeBrowser();
		
	}
	
	@Test
	public void SearchForACarWithinAParticularPriceRangeTest() throws Exception
	{
		GivenINavigateAutotraderHomepage();
		homepage.andIAmOnAutotraderHomepage();
		homepage.whenIEnterValidPostcode();
		homepage.andISelectDistanceToPostcode();
		homepage.andISelectACarMake();
		//homepage.andISelectAPriceFrom();
		//homepage.andISelectAPriceTo();
		homepage.andIClickOnSearchCarButton();
		searchPage.thenIAmOnSearchResultPage();
	}
}
