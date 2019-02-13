package excel;

import static org.testng.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;

public class ReadExcel {
	static HSSFSheet sheet;
	HSSFWorkbook hw = new HSSFWorkbook();
	
	public void openFile(String filename,int i){
		try {
			sheet = new HSSFWorkbook(new POIFSFileSystem(new FileInputStream(filename))).getSheetAt(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String returnCellValue(int row, int column){
		try {
			String str = sheet.getRow(row).getCell(column).getStringCellValue();
			if(str == null)
				return "";
			else
				return str;
		} catch (NullPointerException ne) {
			return "";
		}
	}
	
	public int numRows(){
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int numCols(){
		return sheet.getRow(0).getLastCellNum();
	}

	public void writeTestResults(Map < String, Object[] > result, String filename,String sheetname){  //changes made
		try {
			
			HSSFSheet hs = hw.createSheet(sheetname);  //made changes here
			HSSFRow rw;
			rw = hs.createRow(result.size());
			
			Set < String > keyid = result.keySet();
		    int rowid = 0;
			for (String key : keyid) {
				rw = hs.createRow(rowid++);
				Object [] objectArr = result.get(key);
				int cellid = 0;

				for (Object obj : objectArr){
					Cell cell = rw.createCell(cellid++);
					cell.setCellValue((String)obj);
				}
			}
			FileOutputStream fo =  new FileOutputStream(filename);
			hw.write(fo);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	/*
	  	public void writeTestResults(Map < String, Object[] > result, String filename,String sheetname){  //changes made
		try {
			
			HSSFWorkbook hw = new HSSFWorkbook();
			HSSFSheet hs = hw.createSheet(sheetname);  //made changes here
			HSSFRow rw;
			rw = hs.createRow(result.size());
			
			Set < String > keyid = result.keySet();
		    int rowid = 0;
			for (String key : keyid) {
				rw = hs.createRow(rowid++);
				Object [] objectArr = result.get(key);
				int cellid = 0;

				for (Object obj : objectArr){
					Cell cell = rw.createCell(cellid++);
					cell.setCellValue((String)obj);
				}
			}
			FileOutputStream fo =  new FileOutputStream(filename);
			hw.write(fo);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	
	
}
