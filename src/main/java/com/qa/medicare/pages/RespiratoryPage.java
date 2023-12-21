package com.qa.medicare.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.medicare.base.TestBase;

public class RespiratoryPage extends TestBase {
	
	Actions a = new Actions(driver);
	
    @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr/td[2]/a/img")
	WebElement mo;
    
    @FindBy(xpath="//div[@id='menuFg0']/child::div[1]")
	WebElement res;
    
    @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[3]/td/a/img")
	WebElement lf;
	
	
	public RespiratoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String pagetittlecheck()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public void dropdownclick() throws InterruptedException
	{
		
		a.moveToElement(mo).perform();
		Thread.sleep(2000);
		res.click();
		
	}
	
	public void lifemateclick()
	{
		lf.click();
	}
	
	
	/*
	 * @Test public void repTest() throws InterruptedException { WebDriver driver =
	 * new ChromeDriver();
	 * 
	 * driver.get("https://www.medicare-india.com/Product_range.htm");
	 * 
	 * WebElement product = driver.findElement(By.xpath(
	 * "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr/td[2]/a/img"
	 * ));
	 * 
	 * Actions a = new Actions(driver);
	 * 
	 * a.moveToElement(product).perform();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * // driver.findElement(By.id("menuItemText0")).click();
	 * 
	 * List<WebElement> li =
	 * driver.findElements(By.xpath("//div[@id='menuFg0']/child::*"));
	 * 
	 * System.out.println(li.size());
	 * 
	 * for(WebElement temp:li) { if(temp.getText().contains("care"));
	 * 
	 * temp.click(); }
	 * 
	 * 
	 * 
	 * }
	 */
}
