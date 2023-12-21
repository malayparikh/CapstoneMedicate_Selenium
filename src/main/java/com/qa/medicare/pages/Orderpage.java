package com.qa.medicare.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.medicare.base.TestBase;

public class Orderpage extends TestBase {

	@FindBy(id="Name")
	WebElement name;
	
	@FindBy(id="Company_Name")
	WebElement cname;
	
	@FindBy(id="Address")
	WebElement addr;
	
	@FindBy(id="Phone_No")
	WebElement pno;
	@FindBy(id="Mobile_No")
	WebElement mno;
	
	@FindBy(id="email")
	WebElement em;
	
	@FindBy(xpath="//*[@id=\"chk1[]\"]")
	WebElement chbox;
	
	@FindBy(xpath="//*[@id=\"form2\"]/table/tbody/tr[10]/td[3]/font/select")
	WebElement sel;
	
	@FindBy(name="Submit")
	WebElement btn;
	
	Select s ;
	
	public Orderpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void orderCreate(String n, String cn, String ad, String pn, String mn, String email)
	{
		name.clear();
		name.sendKeys(n);
		cname.clear();
		cname.sendKeys(cn);
		pno.clear();
		pno.sendKeys(pn);
		mno.clear();
		mno.sendKeys(mn);
		em.clear();
		em.sendKeys(email);
		chbox.click();
		
		s = new Select(sel);
		s.selectByIndex(2);
		
	
	}
	
	
	
	public void buttonClcik()
	{
		btn.click();
	}
	
	
	
	
	
}
