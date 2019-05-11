package Dairy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Vlcc.Create;

public class Starttest {
	static WebDriver driver = null;
	static Main_Class mc = new Main_Class();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String usr,pwd,browsertype,url,modulename,moduleaddress, name;
		//	url = "http://uat.milma.indictranstech.com";
			url="http://uat.coop.pvt.indictranstech.com";
			browsertype="chrome";
			usr="dairymanager@stellapps.com";
			pwd="admin";
			modulename="Dairy Cooperative Society";
			moduleaddress="Address List";
			name= "rehan.s";
			/*
			 * System.setProperty("webdriver.chrome.driver", "chromedriver"); WebDriver
			 * driver = new ChromeDriver(); driver.manage().window().maximize();
			 * driver.navigate().to(URL);
			 */
			Starttest ob=new Starttest();
			
			mc.getDriver();
			driver =mc.Login(browsertype, url,usr,pwd);
			Create cr=new Create(driver,modulename, name);
		
			cr.campaddress(moduleaddress);
			cr.clillingcenter(moduleaddress);
			cr.plantoffice(moduleaddress);
			
			cr.vlcccreateform(modulename);
			
			Thread.sleep(1000);
			//mc.tearDown();
		}
		catch(Exception e)
		{
			System.out.println("Script crash Or Failed ");
			mc.tearDown();
		}
		
		
	}
	





}
