package FirstMavenPrgm;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadExample1 {
	XSSFSheet sh;
	public ExcelReadExample1() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\Ansala\\eclipse-workspace\\My_Maven_Project\\src\\main\\resources\\Book1.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
	}
	public String readData(int i,int j) {
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		int celltype = c.getCellType();
		switch(celltype) {
		case Cell.CELL_TYPE_NUMERIC:
		{
			double data=c.getNumericCellValue();
			return String.valueOf(data);
		}
		case Cell.CELL_TYPE_STRING:
		{
			String data=c.getStringCellValue();
			return data;

		}
		default:
			return null;
		
	}
	}
	public void printAllData() {
		for(Row r:sh) {
			for(Cell c:r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
