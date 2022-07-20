package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.RegisterPage;
import utils.BaseTest;
import utils.ExcelUtility;

public class SirishaRanga_TC14_VerifySelectableDefaultfunctionality  {
	
	@Test()
	public void sirisharanga_TC14_VerifySelectableDefaultfunctionality() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Selectable.html");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"Default\"]/ul/li[1]/b"));
		element.click();
		String actual=element.getText();
		String expected="Sakinalium - Readability";
		Assert.assertEquals(actual, expected);
		driver.close();
		}
	
	
	
}
