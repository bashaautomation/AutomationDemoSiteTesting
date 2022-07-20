package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.RegisterPage;
import utils.BaseTest;
import utils.ExcelUtility;

public class SirishaRanga_TC15_VerifySelectableSerializable  {
	
	@Test()
	public void sirisharanga_TC15_VerifySelectableSerializable() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Selectable.html");
		WebElement serialiable=driver.findElement(By.xpath("//div[@class='tabpane pullleft']/ul/li[2]/a"));
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(serialiable));
		serialiable.click();
		WebElement firstelement=driver.findElement(By.xpath("//div[@id='Serialize']/ul/li[1]"));
		firstelement.click();
		String text1=driver.findElement(By.xpath("//p[@id='feedback']/span[1]")).getText();
		String text2=driver.findElement(By.xpath("//p[@id='feedback']/span[2]")).getText();
		String expected="You've selected: Readability";
		String actual=text1+" "+text2;
		Assert.assertEquals(actual, expected);
		driver.close();
		}
	
	
	
}
