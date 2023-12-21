package com.qa.medicare.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	
	public TestBase()
	{
		prop = new Properties();
		
		FileInputStream file =null;
		
		try {
			file= new FileInputStream("C:\\Users\\sonal\\eclipse-workspace\\CapStoneprojectSelenium\\src\\main\\java\\com\\qa\\medicare\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	public static void initialization() throws InterruptedException, MalformedURLException
	{
		
		  String browserName = prop.getProperty("browser");
		  if(browserName.equalsIgnoreCase("chrome")) {
		  System.out.println("Start chrome Browser");
		  
		  driver = new ChromeDriver(); }
		  
		  if(browserName.equalsIgnoreCase("firefox")) {
		  System.out.println("Start firefox browser");
		  
		  driver = new FirefoxDriver(); }
		 		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String urlname= prop.getProperty("url");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(urlname);
		
			
			
	}

}
