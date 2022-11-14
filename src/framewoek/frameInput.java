package framewoek;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
@Test
public class frameInput {
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public frameInput(String excelpath) {
		try
		{
			File src=new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb=new XSSFWorkbook();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());}
		}
	@AfterMethod	
	public int getdata(int sheetnumber, int row, int coloumn) {
		sheet1=wb.getSheetAt(sheetnumber);
		Object data=sheet1.getRow(row).getCell(coloumn).getStringCellValue();
		return (int) data;
	}
	
	
	
	}
	


