package com.qa.medicare.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.qa.medicare.base.TestBase;
import com.qa.medicare.pages.AboutPage;
import com.qa.medicare.pages.HomePage;

public class AboutPageTest extends TestBase{
	
	HomePage hp;
	AboutPage ap;
	
	public AboutPageTest()
	{
		super();
	}
	
	@Test(priority='1')
	public void Startbrowser() throws InterruptedException, MalformedURLException
	{
		initialization();
		hp = new HomePage();
		ap = new AboutPage();
		
	}
	
	@Test(priority='2')
	public void Homepagetest()
	{
		String title= hp.getTitlePage();
		System.out.println(title);
		hp.AboutMedicareClick();
	}
	
	@Test(priority='3')
	public void AboutPageTitle()
	{
		ap.PageTitle();
	}
	
	@Test(priority='4')
	public void getTextValueTest()
	{
		String text= ap.textvalue();
		System.out.println(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
