package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	@org.junit.Test
	public void test1() throws IOException, InvalidFormatException {
		FileInputStream file = new FileInputStream(new File("d:/test.xlsx"));
		Workbook workBook = WorkbookFactory.create(file);
		Sheet sheet = workBook.getSheetAt(0);
		
		for(int i=0; i<=sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			for(int j=0; j<row.getLastCellNum(); j++) {

				Cell cell = row.getCell(j);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				System.out.print(cell.getStringCellValue()+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(new File("d:\\test.xlsx"));
		HSSFWorkbook workBook = new HSSFWorkbook(file);
		HSSFSheet sheet = workBook.getSheetAt(0);
		
		for(int i=0; i<=sheet.getLastRowNum(); i++) {
			HSSFRow row = sheet.getRow(i);
			for(int j=0; j<3; j++) {
				HSSFCell cell = row.getCell(j);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				System.out.print(cell.getStringCellValue()+"\t");
			}
			System.out.println();
		}
	}
}
