package com.qa.medicare.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.medicare.base.TestBase;

import com.qa.medicare.pages.HomePage;
import com.qa.medicare.pages.Orderpage;
import com.qa.medicare.utilities.Xls_Reader;

public class OrderPageTest extends TestBase {
	
	HomePage hp;
	Orderpage op;
	Alert a ;
	
	public OrderPageTest()
	{
		super();
	}
	
	@Test(priority='1')
	public void StartBrowser() throws InterruptedException, MalformedURLException
	{
		initialization();
		hp = new HomePage();
		hp.OrderInquiryClick();
		op = new Orderpage();
	}
	
	@Test(priority='2')
	public void OrderCreateTest()
	{
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sonal\\Desktop\\TestData.xlsx");
		
		reader.addColumn("Sheet1", "Status");
		
		// Count the number of rows that have data in the sheet
		
	int rownum=	reader.getRowCount("Sheet1");
	
	for(int i=2; i<=rownum; i++)
	{
		String NAME = reader.getCellData("Sheet1", "Name", i);
		String CNAME = reader.getCellData("Sheet1", "Cname", i);
		String PNO= reader.getCellData("Sheet1", "Phone", i);
		String MNO = reader.getCellData("Sheet1","Mobile" , i);
		String EMAIL= reader.getCellData("Sheet1", "Email", i);
		op.orderCreate(NAME, CNAME, CNAME, PNO, MNO, EMAIL);
		reader.setCellData("Sheet1","Status",i,"Pass");
		
	}
		
		
	}
	
	
	@Test(priority='3')
	public void HabdleAlertTest() throws InterruptedException
	{
	
		op.buttonClcik();
		
		Thread.sleep(3000);
	
	a=driver.switchTo().alert();
	a.accept();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
