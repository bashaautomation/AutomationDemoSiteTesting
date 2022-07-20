package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.RegisterPage;
import utils.BaseTest;
import utils.ExcelUtility;

public class SirishaRanga_TC04_VerifyAlertWithOK  {
	
	@Test()
	public void sirisharanga_TC04_VerifyAlertWithOK() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();
		}
	
	
	
}
