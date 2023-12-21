package com.qa.medicare.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.medicare.base.TestBase;

public class AboutPage extends TestBase {
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td/img")
	WebElement Aboutmedicare;
	
	//pageFactory init
	
	
	public AboutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action Method
	
	public void PageTitle()
	{
		System.out.println("Title of the Page :" + driver.getTitle());
	}
	
	
	public String textvalue()
	{
		String text=Aboutmedicare.getText();
		return text;
	}
	
	
	
	
	
	
	
	
	

}
