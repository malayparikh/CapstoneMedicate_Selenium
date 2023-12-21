package com.qa.medicare.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.qa.medicare.base.TestBase;
import com.qa.medicare.pages.HomePage;
import com.qa.medicare.pages.ProductPage;

public class ProductPageTest extends TestBase{
	
	HomePage hp;
	ProductPage pp;
	
	public ProductPageTest()
	{
		super();
	}
	@Test(priority='1')
	public void startbrowser() throws InterruptedException, MalformedURLException
	{
		initialization();
		hp = new HomePage();
		pp = new ProductPage();
		hp.ProductClick();
	}

	@Test(priority='2')
	public void TestTitle()
	{
		String title = pp.productTitle();
		System.out.println(title);
	}
	@Test(priority='3')
	public void respClicktest() throws InterruptedException
	{
		pp.respClick();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@Test(priority='4')
	public void aspiratorClickTest() throws InterruptedException
	{
		pp.aspiratorClick();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority='5')
	public void diaClick() throws InterruptedException
	{
		pp.diaClick();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority='6')
	public void RangeTextText()
	{
	String text=	pp.RangeText();
	System.out.println(text);
	}
	
	
	
	
	
	
}
