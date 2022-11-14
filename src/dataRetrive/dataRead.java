package dataRetrive;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataRead {
 
		XSSFWorkbook wb;
		XSSFSheet sheet1;
		
		
		public  dataRead( String excelpath){
			try {
				File src=new File(excelpath);
				FileInputStream fis=new FileInputStream(src);
				wb=new XSSFWorkbook(fis);
				
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
			
			
		}

public String getdata( int sheetNumber,int row,int coloumn) {
	sheet1=wb.getSheetAt(sheetNumber);
	String data =sheet1.getRow(row).getCell(coloumn).getStringCellValue();
	return data;
	
	
	
}
public int getRowCount(int sheetIndex) {
	 int row=wb.getSheetAt(sheetIndex).getLastRowNum();
	 row=row+1;
	 return row;
	
}
}
