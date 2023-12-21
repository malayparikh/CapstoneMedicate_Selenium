package com.qa.medicare.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.medicare.base.TestBase;

public class HomePage extends TestBase{
	
	
	// Object Repository
	// @FindBy : you will provide webelement locator value and name of the webelement
	
	@FindBy(xpath="//map[@name='Map2']/child::area[1]")
	WebElement AboutMedicare;
	
	@FindBy(xpath="//map[@name='Map2']/child::area[2]")
	WebElement Product;
	
	@FindBy(xpath="//map[@name='Map2']/child::area[3]")
	WebElement Order;
	
	@FindBy(xpath="//map[@name='Map2']/child::area[4]")
	WebElement site;
	
	@FindBy(xpath="//map[@name='Map2']/child::area[5]")
	WebElement Contact;
	
	// PageFactory : initialize the WebElements
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Action methods
	
	public String getTitlePage()
	{
	String title= driver.getTitle();
		return title;
	}
	
	
	public AboutPage AboutMedicareClick()
	{
		AboutMedicare.click();
		return new AboutPage();
	}
	
	public ProductPage ProductClick()
	{
		Product.click();
		return new ProductPage();
	}
	
	public Orderpage OrderInquiryClick()
	{
		Order.click();
		return new Orderpage();
	}
	
	public SitePage SiteClick()
	{
		site.click();
		return new SitePage();
	}
	
	public ContactPage ContactClick()
	{
		Contact.click();
		return new ContactPage();
	}
	

}
