package com.qa.medicare.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.qa.medicare.base.TestBase;
import com.qa.medicare.pages.HomePage;
import com.qa.medicare.pages.RespiratoryPage;

public class GridExecution extends TestBase{


	public GridExecution()
	{
		super();
	}
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
	
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String huburl = "http://192.168.1.14:4545/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(huburl),options);
		
		
		driver.get("https://www.medicare-india.com/");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//map[@name='Map2']/child::area[2]"));
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
