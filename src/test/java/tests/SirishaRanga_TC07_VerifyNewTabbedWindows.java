package tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.RegisterPage;
import utils.BaseTest;
import utils.ExcelUtility;

public class SirishaRanga_TC07_VerifyNewTabbedWindows  {
	
	@Test()
	public void sirisharanga_TC06_VerifyNewTabbedWindows() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		Set<String> windowHandle = driver.getWindowHandles();
		Iterator<String> iterator = windowHandle.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			String title =driver.switchTo().window(next).getTitle();
			System.out.println(title);
		}
		
		
	}
	
	
	
}
