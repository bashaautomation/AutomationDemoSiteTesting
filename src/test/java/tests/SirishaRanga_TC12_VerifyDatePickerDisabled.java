package tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.RegisterPage;
import utils.BaseTest;
import utils.ExcelUtility;

public class SirishaRanga_TC12_VerifyDatePickerDisabled  {
	
	WebDriver driver;
	
	@Test()
	public void sirisharanga_TC12_VerifyDatePickerDisabled() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		selectDesiredDate("20");
		driver.close();
	
	}
	
	public void selectDesiredDate(String date) {
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
		int totalrows=findElements.size();
		List<WebElement> findElements1 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td"));
        int totalcols=findElements1.size();
        System.out.println(totalrows+"---"+totalcols);
        for(int i=1;i<=totalrows;i++) {
        	for(int j=1;j<=totalcols;j++) {
        		String alldates=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]")).getText();
        		if(alldates.equals(date)) {
        			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]")).click();
        		}
        	}
        }
        
	}
	
	
}
