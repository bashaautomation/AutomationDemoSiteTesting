package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private  String excelpath=System.getProperty("user.dir")+"//src//test//resources//testdata//SirishaRanga_TestCases_V1.0.xlsx";
	public  ArrayList<String> getData(String testcasename) throws IOException {
		ArrayList<String> ar= new ArrayList<>();	
		FileInputStream fis = new FileInputStream(new File(excelpath));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int totalsheets =workbook.getNumberOfSheets();
		for(int i=0;i<totalsheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow=rows.next();
				Iterator<Cell> ce=firstrow.cellIterator();
				int k=0;
				int coloumn=0;
				int j=0;
				while(ce.hasNext()) {
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCaseId")) {
						coloumn=k;
					}
					k++;
				}
				while(rows.hasNext()) {
					Row r=rows.next();
					
					if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcasename)) {
						
						Iterator<Cell> cv = r.cellIterator();
						
						while(cv.hasNext()) {
							Cell c=cv.next();
							if(c.getCellTypeEnum()==CellType.STRING) {
							ar.add(c.getStringCellValue());	
							}else {
								ar.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
							
						}
						
						
					}
					
					
				}
				
				
				
			}
			
			
		}
		return ar;
		
				
		
		
	}
	
	
	
	
}