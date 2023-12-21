package com.qa.medicare.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.qa.medicare.base.TestBase;
import com.qa.medicare.pages.AboutPage;
import com.qa.medicare.pages.HomePage;
import com.qa.medicare.pages.ProductPage;

public class HomePageTest extends TestBase {
	
	HomePage hp;
	
	AboutPage ap;
	
	ProductPage pro;
	
	public HomePageTest()
	{
		super();
	}
	
	@Test(priority='1')
	public void startBrowser() throws InterruptedException, MalformedURLException
	{
		initialization();
		hp = new HomePage();
	}
	
	@Test(priority='2')
	public void testtitlePage()
	{
		String title = hp.getTitlePage();
		System.out.println("The title of page is: " + title);
	}
	
	@Test(priority='3')
	public void AboutMedicareTest()
	{
		ap=hp.AboutMedicareClick();
		
	}
	
	@Test(priority='4')
	public void ProductClickTest() throws InterruptedException
	{
		
		driver.navigate().back();
		Thread.sleep(2000);
		pro=hp.ProductClick();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
