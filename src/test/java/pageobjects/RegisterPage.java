package pageobjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RegisterPage {
	public WebDriver driver;

	public RegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By firstName=By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='First Name']");
	By lastName=By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='Last Name']");
	By address=By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea");
	By email=By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@type='email']");
	By phone=By.xpath("//input[@type='tel']");
	By gender_male=By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/label[1]/input");
	By gender_female=By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/label[2]/input");
	By hobies_list=By.xpath("//input[@type='checkbox']");
	By language=By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget' and @id='msdd']");
	By dropdownarrow=By.xpath("//span[@class='select2-selection__arrow']");
	By countries_list=By.xpath("//span[@class='select2-results']/ul/li");
	By year_arrow=By.xpath("//select[@id='yearbox']");
	By year_list=By.xpath("//select[@id='yearbox']/option");
	By month_arrow=By.xpath("//select[@placeholder='Month']");
	By month_list=By.xpath("//select[@placeholder='Month']/option");
	By day_arrow=By.xpath("//select[@placeholder='Day']");
	By day_list=By.xpath("//select[@placeholder='Day']/option");
	By password=By.xpath("//input[@id='firstpassword']");
	By confirmpassword=By.xpath("//input[@id='secondpassword']");
	By submit=By.xpath("//button[@type='submit']");
	By refresh=By.xpath("//button[@type='button']");
	
	public void setfirstname(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}
	
	public void setlastname(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	} 
	
	public void setaddress(String address1) {
		driver.findElement(address).sendKeys(address1);
	}
	
	public void setemail(String email1) {
		driver.findElement(email).sendKeys(email1);
	}
	public void setphonenumber(String phonenumber) {
		driver.findElement(phone).sendKeys(phonenumber);
	}
	
	public void selectgender(String gender) {
		if (gender.equalsIgnoreCase("male")) {
			driver.findElement(gender_male).click();
		} else if (gender.equalsIgnoreCase("female")) {
			driver.findElement(gender_female).click();
		} else {
			driver.findElement(gender_male).click();
		}
	}
   
	public void selecthobbies(String hobbie) {
		
		if(hobbie.equalsIgnoreCase("cricket")) {
			driver.findElement(By.xpath("//input[@type='checkbox' and @id='checkbox1' ]")).click();
		}
		else if(hobbie.equalsIgnoreCase("movies")) {
			driver.findElement(By.xpath("//input[@type='checkbox' and @id='checkbox2' ]")).click();
		}
		else if(hobbie.equalsIgnoreCase("hockey")) {
			driver.findElement(By.xpath("//input[@type='checkbox' and @id='checkbox3' ]")).click();
		}
		else {
			driver.findElement(By.xpath("//input[@type='checkbox' and @id='checkbox1' ]")).click();
		}
	}
	public void selectlanguage(String language1) {
		/*
		 * JavascriptExecutor jse = (JavascriptExecutor)driver;
		 * jse.executeScript(language1, null)
		 */
		WebElement element=driver.findElement(language);
		Actions a = new Actions(driver);
		a.moveToElement(element).click().perform();
		//.findElement(language).click();
		for(int i=1;i<42;i++) {
			String language2=driver.findElement(By.xpath("//multi-select/div/ul/li["+i+"]/a")).getText();
			if(language2.equalsIgnoreCase(language1)) {
				driver.findElement(By.xpath("//multi-select/div/ul/li["+i+"]/a")).click();
				break;
			}
			else {
				System.out.println("Please select correct language");
			}
		}
	}
	public void register(String firstname,String lastname,String address,String email,String phone,String gender,String hobbie,String language) throws InterruptedException {
		setfirstname(firstname);
		setlastname(lastname);
		setaddress(address);
		setemail(email);
		setphonenumber(phone);
		selectgender(gender);
		selecthobbies(hobbie);
		selectlanguage(language);
		
	}
	
	
	
	
	
	
}
