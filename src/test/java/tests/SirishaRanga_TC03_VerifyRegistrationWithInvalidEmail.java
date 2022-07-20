package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import pageobjects.RegisterPage;
import utils.BaseTest;
import utils.ExcelUtility;

public class SirishaRanga_TC03_VerifyRegistrationWithInvalidEmail extends BaseTest {
	
	@Test()
	public void sirisharanga_TC03_VerifyRegistrationWithInvalidEmail() throws InterruptedException, IOException {
		RegisterPage registerpage= new RegisterPage(driver);
		ExcelUtility  util= new ExcelUtility();
		ArrayList<String> data = util.getData("TC03_VerifyRegistrationWithInvalidEmail");
		registerpage.register(data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(6), data.get(7),data.get(8));
		
	}
	
	
	
}
