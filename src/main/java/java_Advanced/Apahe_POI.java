package java_Advanced;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Formatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apahe_POI {

	public static void main(String[] args) throws IOException {
		Apahe_POI apahe_POI= new Apahe_POI();
		apahe_POI.writeFile();
		
	}
	public void readFile() {
	File file = new File("‪C:\\Users\\groov\\eclipse\\Java Project\\src\\excel.xlsx");
		
		XSSFWorkbook workbook;
		XSSFSheet sheet;
	
		//Object[][] arr = new Object[0][0];
		
		try {
			FileInputStream inputStream = new FileInputStream(file);
			workbook = new XSSFWorkbook(inputStream);
			sheet = workbook.getSheet("Sheet1");
			//System.out.println(sheet.getRow(row).getCell(1).getStringCellValue());
			int start = sheet.getFirstRowNum();
			int last = sheet.getLastRowNum();
			for(int i = start; i<=last; i++) {
				System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
			}
			
			//Formatter formatter = new Formatter();
			
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}		
	}

	public void writeFile() throws IOException {
		File file = new File("C:\\Users\\groov\\eclipse\\Java Project\\src\\excell.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
	
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
			Row row;
			Cell cell; //Cell as the COLUMN
			
			for(int i = 0;i <=9; i++) {
				row = sheet.createRow(i);
				for(int j = 0; j <=9; j++) {
					cell = row.createCell(j);
					cell.setCellValue((i+1) * (j+1));
				}
			}
			
			
			try {
				FileOutputStream outputStream = new FileOutputStream(file);
				if (file !=null);
					workbook.write(outputStream);
					outputStream.close();
					workbook.close();

			
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
	}
}
