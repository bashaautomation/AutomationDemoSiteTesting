package utils;

import java.io.IOException;
import java.util.ArrayList;

public class testutility {

	public static void main(String[] args) throws IOException {
	ExcelUtility util= new ExcelUtility();
	 ArrayList<String> data = util.getData("TC01_VerifyRegistrationWithValiddata");
	 System.out.println(data);
		
		
		

	}

}
