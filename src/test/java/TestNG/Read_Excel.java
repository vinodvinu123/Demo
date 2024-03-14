package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Excel { 
	@Test	
	void excelread() throws IOException {
		//open excel file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Data\\TestData1.xlsx");
		//open workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//goto sheet
		XSSFSheet sheet=workbook.getSheet("Sheet1");//or getSheetAt(0) by index
		int rows=sheet.getLastRowNum();//how many no of rows in sheet
		int cells=sheet.getRow(0).getLastCellNum();//how many number of cells in one row
		System.out.println(rows);
		System.out.println(cells);
		
		for(int r=0;r<=rows;r++) {
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<cells;c++) {
				XSSFCell cell=currentrow.getCell(c);//goto current cell (0,0)
				String value=cell.toString();//read the cell data
				System.out.print(value+" ");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
