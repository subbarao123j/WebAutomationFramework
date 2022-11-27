package day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData2 {

	@Test
	public void readExcelData() {

		try {

			XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File("./TestData/data.xlsx")));

			System.out.println(wb.getSheet("Login").getRow(2).getCell(0).getStringCellValue());
			System.out.println(wb.getSheet("Login").getRow(2).getCell(1).getStringCellValue());
			System.out.println((int)wb.getSheet("Login").getRow(3).getCell(0).getNumericCellValue());

		} catch (IOException e) {
			System.out.println("File couldnot read" + e.getMessage());
		}

	}

}
