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

public class ReadExcelData {

	@Test
	public void readExcelData() {

		File src = new File("./TestData/data.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			XSSFSheet sh1 = wb.getSheet("Login");

			XSSFRow r1 = sh1.getRow(0);
			XSSFCell cl = r1.getCell(0);

			String data = cl.getStringCellValue();

			System.out.println(data);
		} catch (IOException e) {
			System.out.println("File couldnot read"+e.getMessage());
		}

	}

}
