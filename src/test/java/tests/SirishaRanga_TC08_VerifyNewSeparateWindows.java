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

public class SirishaRanga_TC08_VerifyNewSeparateWindows {
	
	@Test()
	public void sirisharanga_TC08_VerifyNewSeparateWindows() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		WebElement button=driver.findElement(By.xpath("//div[@class='tabpane pullleft']/ul/li[2]/a"));
		button.click();
		WebElement button1=driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button"));
		button1.click();
		Set<String> windowHandle = driver.getWindowHandles();
		Iterator<String> iterator = windowHandle.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			String title =driver.switchTo().window(next).getTitle();
			System.out.println(title);
			
		
			}
		driver.quit();
	}
	
	
	
}
