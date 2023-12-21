package com.qa.medicare.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.medicare.base.TestBase;

public class ProductPage extends TestBase {
	
	@FindBy(xpath="//map[@name='Map2']/child::area[1]")
	WebElement res;
	
	@FindBy(xpath="//map[@name='Map2']/child::area[2]")
	WebElement asp;
	
	@FindBy(xpath="//map[@name='Map2']/child::area[3]")
	WebElement dia;
	
	@FindBy(xpath="//td[@bgcolor='#FFFFFF']/descendant::img[9]")
	WebElement pr;
	
	public ProductPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String productTitle()
	{
		String title= driver.getTitle();
		return title;
	}
	
	
	public void respClick()
	{
		res.click();
	}
	
	public void aspiratorClick()
	{
		asp.click();
	}
	
	public void diaClick()
	{
		dia.click();
	}
	
	public String RangeText()
	{
		String range=pr.getAttribute("alt");
		return range;
	}
	
	
	
	
	
	

}
