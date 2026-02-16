package com.Amazon.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileUtility {

	public static String[][] readExcelData(String filepath, String sheetname) throws IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		Workbook workBook=new XSSFWorkbook(fis);
		Sheet sheet=workBook.getSheet(sheetname);

		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();

		//Create tow dimensional String/Object
		String [][] data = new String [rowCount-1][columnCount];
		

		// Apply Nested loop for row count and column count.
		for(int i=1; i<rowCount; i++) 
		{
			Row row = sheet.getRow(i);

			for(int j=0; j<columnCount; j++) 
			{
				Cell cell = row.getCell(j);
				data [i-1][j] = cell.toString();
			}

		}
		
		// Close WorkBook
		workBook.close();
		// Return data variable
		return data;

	}




}
