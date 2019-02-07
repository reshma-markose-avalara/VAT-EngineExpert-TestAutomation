package excel;

import org.apache.poi.hssf.usermodel.HSSFCell;

public class ExcelOperation extends ReadExcel{

	public static void main(String[] args) {
		ReadExcel re = new ReadExcel();
		String cell = re.returnCellValue(1,0);
		System.out.println(cell);
//re.returnCellValue(1,0).getStringCellValue
	}

}
