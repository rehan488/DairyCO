test
package Vlcc;

import org.apache.bcel.ExceptionConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.commandhandler.ExceptionHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Dairy.Starttest;

public class Create {
	public static WebDriver driver = null;

	String vlcc_name, name1, abbr, email_id, contact_no, chilling_centre, camp_office, plant_office, amcu_id,longformatfarmerid;
	String address_title, address_type, manager_name, manager_email, address_line1, city, centre_id,associated_camp_office,chilladdress_title;
	int vlccflag=0;
	public Create(WebDriver driver, String modulename, String name) {
		try {
			this.driver = driver;

			address_title = name;
			chilladdress_title=address_title;
			vlcc_name = "dcsap2";
			plant_office = address_title+"-Plant";
			
			//plant_office = address_title+"-Plant";
			
			address_type = "P&I";
			manager_name = address_title;
			manager_email = address_title + "@gmail.com";
			address_line1 = address_title;
			city = "Pune";
			centre_id = address_title;
			
			
			
			name1 = vlcc_name;
			abbr = vlcc_name.substring(3);
			email_id = vlcc_name + "@indictranstech.com";
			contact_no = "9874561230";
			chilling_centre = address_title+"-Chilling Centre";
			camp_office = address_title + "-P&I";
			
			amcu_id = vlcc_name;
			
			longformatfarmerid=camp_office+"_"+"chill"+chilladdress_title+"_"+plant_office+"_"+address_title;
			
			
			associated_camp_office=camp_office;

			
			// function for creating campoffice
			// campaddress(moduleaddress);

			// function for creating vlcc

			// System.out.println("In create vlcc constructor");
		}

		catch (Exception e) {
			System.out.println("Script crash or Create Failed ");
		}
	}

	public void campaddress(String moduleaddress) {
		try {

			search(moduleaddress);
			createnew();

			System.out.println("Creating camp office ");

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='address_title'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='address_title'] //input[@type='text']"))
					.sendKeys(address_title);

			Thread.sleep(2000);
			/*
			 * Select addtype = new Select(driver.findElement(By.
			 * xpath("//*[@data-fieldname='address_type'] //*[@data-fieldtype='Select']")));
			 * //addtype.selectByVisibleText(address_type); addtype.selectByIndex(1);
			 */

			// driver.findElement(By.xpath("//*[@data-fieldname='address_type']
			// //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='address_type'] //*[@placeholder='']"))
					.sendKeys(address_type);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='manager_name'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='manager_name'] //input[@type='text']"))
					.sendKeys(manager_name);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='manager_email'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='manager_email'] //input[@type='text']"))
					.sendKeys(manager_email);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='address_line1'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='address_line1'] //input[@type='text']"))
					.sendKeys(address_line1);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='city'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='city'] //input[@type='text']")).sendKeys(city);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='centre_id'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='centre_id'] //input[@type='text']")).sendKeys(centre_id);

			// Save function call
			save();

		} catch (Exception e) {
			System.out.println("Script crash or campaddress Failed " + e);
		}
	}

	public void clillingcenter(String moduleaddress)
	{

		try {

			search(moduleaddress);
			createnew();
			address_type="Chilling Centre";
			centre_id="chill"+chilladdress_title;
			System.out.println("Creating clilling center ");

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='address_title'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='address_title'] //input[@type='text']"))
					.sendKeys(chilladdress_title);

			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//*[@data-fieldname='address_type'] //*[@placeholder='']"))
					.sendKeys(address_type);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='manager_name'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='manager_name'] //input[@type='text']"))
					.sendKeys(manager_name);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='manager_email'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='manager_email'] //input[@type='text']"))
					.sendKeys(manager_email);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='address_line1'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='address_line1'] //input[@type='text']"))
					.sendKeys(address_line1);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='city'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='city'] //input[@type='text']")).sendKeys(city);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='centre_id'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='centre_id'] //input[@type='text']")).sendKeys(centre_id);
			
			
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='associated_camp_office'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='associated_camp_office'] //input[@type='text']")).sendKeys(associated_camp_office);

			// Save function call
			save();

		} catch (Exception e) {
			System.out.println("Script crash or clillingcenter Failed " + e);
		}
	
	}
	
	public void plantoffice(String moduleaddress)
	{	
			try {

				search(moduleaddress);
				createnew();
				address_type="Plant";
				centre_id="plant"+address_title;
				System.out.println("Creating Plant office ");

				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='address_title'] //input[@type='text']")).clear();
				driver.findElement(By.xpath("//*[@data-fieldname='address_title'] //input[@type='text']"))
						.sendKeys(address_title);

				Thread.sleep(2000);
				/*
				 * Select addtype = new Select(driver.findElement(By.
				 * xpath("//*[@data-fieldname='address_type'] //*[@data-fieldtype='Select']")));
				 * //addtype.selectByVisibleText(address_type); addtype.selectByIndex(1);
				 */

				// driver.findElement(By.xpath("//*[@data-fieldname='address_type']
				// //input[@type='text']")).clear();
				driver.findElement(By.xpath("//*[@data-fieldname='address_type'] //*[@placeholder='']"))
						.sendKeys(address_type);

				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='manager_name'] //input[@type='text']")).clear();
				driver.findElement(By.xpath("//*[@data-fieldname='manager_name'] //input[@type='text']"))
						.sendKeys(manager_name);

				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='manager_email'] //input[@type='text']")).clear();
				driver.findElement(By.xpath("//*[@data-fieldname='manager_email'] //input[@type='text']"))
						.sendKeys(manager_email);

				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='address_line1'] //input[@type='text']")).clear();
				driver.findElement(By.xpath("//*[@data-fieldname='address_line1'] //input[@type='text']"))
						.sendKeys(address_line1);

				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='city'] //input[@type='text']")).clear();
				driver.findElement(By.xpath("//*[@data-fieldname='city'] //input[@type='text']")).sendKeys(city);

				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='centre_id'] //input[@type='text']")).clear();
				driver.findElement(By.xpath("//*[@data-fieldname='centre_id'] //input[@type='text']")).sendKeys(centre_id);

				// Save function call
				save();

			} catch (Exception e) {
				System.out.println("Script crash or Plant office Failed " + e);
			}
	}
	
	public void vlcccreateform(String modulename) {
		try {

			// filling data

			search(modulename);
			driver.navigate().refresh();
			WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.elementToBeClickable(By.xpath("//*[@data-fieldname='name'] //input[@type='text']")));
			createnew();

			Thread.sleep(1000);

			System.out.println("Creating Vlcc ");

			driver.findElement(By.xpath("//*[@data-fieldname='vlcc_name'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='vlcc_name'] //input[@type='text']")).sendKeys(vlcc_name);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='name1'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='name1'] //input[@type='text']")).sendKeys(name1);

			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@data-fieldname='abbr'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='abbr'] //input[@type='text']")).sendKeys(abbr);

			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@data-fieldname='email_id'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='email_id'] //input[@type='text']")).sendKeys(email_id);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='contact_no'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='contact_no'] //input[@type='text']"))
					.sendKeys(contact_no);

			// filling data into ASSOCIATED BRANCH DETAILS

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='chilling_centre'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='chilling_centre'] //input[@type='text']"))
					.sendKeys(chilling_centre);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='camp_office'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='camp_office'] //input[@type='text']"))
					.sendKeys(camp_office);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='plant_office'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='plant_office'] //input[@type='text']"))
					.sendKeys(plant_office);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='amcu_id'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='amcu_id'] //input[@type='text']")).sendKeys(amcu_id);
			
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-fieldname='longformatfarmerid'] //input[@type='text']")).clear();
			driver.findElement(By.xpath("//*[@data-fieldname='longformatfarmerid'] //input[@type='text']")).sendKeys(longformatfarmerid);
			vlccflag=1;
			// Save function call
			save();
			
			

		} catch (Exception e) {
			System.out.println("Script crash or vlcccreateform Failed ");
		}
	}

	public void save() {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[contains(@class, 'hidden-xs') and text() = 'Save']")).click();

			try {
				// Message after creating vlcc
				WebElement element = (new WebDriverWait(driver, 30))
						.until(ExpectedConditions.visibilityOfElementLocated(
								By.xpath("//h4[contains(@class, 'modal-title') and text() = 'Message']")));

				
				if (driver.findElement(By.xpath("//h4[contains(@class, 'modal-title') and text() = 'Message']"))
						.isDisplayed()) {
				/*	element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(
							By.xpath("//h4[contains(@class, 'modal-title') and text() = 'Message']")));
*/
					boolean message = driver
							.findElement(By.xpath("//h4[contains(@class,'modal-title') and text() = 'Message']"))
							.isDisplayed();
					String text = driver.findElement(By.xpath("//*[contains(@class,'msgprint')]")).getText();

					// System.out.println(text);
					if (!message) {

						System.out.println("Doc Save Sucessfully...!!");
					}
					Thread.sleep(1000);
					if (message) {
						text = driver.findElement(By.xpath("//*[contains(@class,'msgprint')]")).getText();

						if (text.equals("Please add address details for " + vlcc_name)) {
							System.out.println("Doc Save Sucessfully...!!");
							//Code for vlcc address after save
							System.out.println("vlccflag --"+vlccflag);
							if(vlccflag==1)
							{
								Thread.sleep(1000);
								saveaddress();
							}
							
							/*Thread.sleep(1000);
							driver.findElement(
									By.xpath("/html/body/div[10]/div[2]/div/div[1]/div/div[2]/div/button[1]/span"))
									.click();
							*/
							
						} else {
							System.out.println("Failed to Save ??? " + text);
							Thread.sleep(1000);
							driver.findElement(
									By.xpath("/html/body/div[10]/div[2]/div/div[1]/div/div[2]/div/button[1]/span"))
									.click();
						}
					}
				} else {
					System.out.println("TTTT");
				}

			} catch (Exception e) {
				System.out.println("No Msg popup");
				//System.out.println("Doc Save Sucessfully...!!");
			}

		} catch (Exception e) {
			System.out.println("save Faield :" + e);
		}
	}

	public void search(String modulename) {
		try {
		Thread.sleep(2000);
			driver.findElement(By.id("navbar-search")).sendKeys(modulename);
			Thread.sleep(1000);
			driver.findElement(By.id("navbar-search")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			//driver.findElement(By.id("navbar-search")).sendKeys(Keys.ARROW_DOWN);
		//	Thread.sleep(1000);
			driver.findElement(By.id("navbar-search")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Search Script failed -" + e);
		}
	}

	public void createnew() {

		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"//span[contains(@class, 'hidden-xs') and text() = 'New' and //i[contains(@class,'visible-xs octicon octicon-plus') and //button[contains(@class,'btn btn-primary btn-sm primary-action')]]]"))
					.click();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("createnew Script failed ");

		}
	}

	
	public void saveaddress()
	{

		try {
			
			address_type="DCS";
			
			Thread.sleep(1000);
			if (driver.findElement(By.xpath("//h4[contains(@class, 'modal-title') and text() = 'Message']"))
					.isDisplayed())
			{
				
				Thread.sleep(1000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@data-fieldname='address'] //input[@type='text']")).click();
				driver.findElement(By.xpath("//*[@data-fieldname='address'] //input[@type='text']")).sendKeys(Keys.ENTER);
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='address_title'] //input[@type='text']")).sendKeys(address_title);
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='address_type'] //input[@type='text']")).sendKeys(address_type);
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='address_line1'] //input[@type='text']")).sendKeys(address_line1);
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='city'] //input[@type='text']")).sendKeys(city);
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[.='                             Add Row']")).click();
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='link_doctype'] //input[@type='text']")).sendKeys("Company");
				

				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"page-Form/Address\"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[3]/div/div/div[2]/div[5]/div[2]/div/form/div[2]/div/div/div[2]/div[1]/div/div/div[2]")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='link_doctype'] //input[@type='text']")).sendKeys("Company");
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-fieldname='link_name'] //input[@type='text']")).sendKeys(address_title);
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[contains(@class, 'hidden-xs') and text() = 'Save']")).click();

				Thread.sleep(2000);
				String addtitle=driver.findElement(By.xpath("//h1[contains(@class, 'editable-title')]")).getText();
				
				
				System.out.println("Address title "+addtitle);
			}

		} catch (Exception e) {
			System.out.println("Save address Script failed ");

		}
	}
	
}
