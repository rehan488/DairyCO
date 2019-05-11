package Dairy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main_Class {
	private WebDriver driver;
	static String driverPath = "chromedriver";

	public WebDriver getDriver() {
		return driver;
	}

	private void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		//System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	
	public WebDriver initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);
			
		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
		return driver;
	}
	
	
	public WebDriver Login(String browserType, String appURL,String usr, String pwd)
	{
		driver =initializeTestBaseSetup("chrome", appURL);

		driver.findElement(By.id("login_email")).sendKeys(usr);
		driver.findElement(By.id("login_password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"page-login\"]/div/div/div[2]/section[1]/div[1]/form/button")).click();

		// wait until the page load
		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(By.id("navbar-search")));

		if (driver.findElement(By.id("navbar-search")).isDisplayed()) {
			System.out.println("Login sucessfully");
		}
		else 
		{
			System.out.println("Login Failed ");
			driver.quit();
		}
		return driver;
	}
	
	
	public void tearDown() {
		driver.quit();
	}

	
	
	
}
