package com.qa.medicare.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.medicare.base.TestBase;
import com.qa.medicare.pages.HomePage;
import com.qa.medicare.pages.ProductPage;
import com.qa.medicare.pages.RespiratoryPage;

public class RespiratorypageTest extends TestBase{
	
	HomePage hp;
	ProductPage pp;
	RespiratoryPage rp;
	
	public RespiratorypageTest()
	{
		super();
	
	}

	
	@Test(priority='1')
	public void startBrowser() throws InterruptedException, MalformedURLException
	{
		initialization();
		hp = new HomePage();
		pp = new ProductPage();
		rp = new RespiratoryPage();
		
		hp.ProductClick();
		System.out.println(pp.productTitle());
	}
	
	@Test(priority='2')
	public void pagetittlecheckTest()
	{
		String title= rp.pagetittlecheck();
		System.out.println(title);
	}
	
	@Test(priority='3')
	public void dropdownclickTest()throws InterruptedException
	{
		rp.dropdownclick();
		rp.lifemateclick();
	}
	
	
	
	
	
	
	
}
