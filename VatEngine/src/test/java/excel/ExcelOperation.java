package excel;

import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFCell;

public class ExcelOperation extends ReadExcel{

	public static void main(String[] args) {
		ReadExcel re = new ReadExcel();
		String inputFile = "C:\\code\\VAT-Engine-Tests\\VatEngine\\src\\test\\java\\excel\\TestVatEngine.xls";
		String outputFile = "C:\\TestVatEngineResult.xls";
		int rows ;
		//This data needs to be written (Object[])
	      Map < String, Object[] > result = null;
	      /*int rows = re.numRows();
	      for(int i = 1; i < rows; i++){
	    	  System.out.println(i);
	    	  System.out.println(re.returnCellValue(i,0));
	    	  result.put( ""+i, new Object[] {
		    		  re.returnCellValue(i,0), re.returnCellValue(i,1), re.returnCellValue(i,2),
		    		  re.returnCellValue(i,3), re.returnCellValue(i,4), re.returnCellValue(i,5),
		    		  "SUCCESS"});
	      }*/
	    re.openFile(inputFile,0);
		rows = re.numRows();
		System.out.println(rows);
		result = new TreeMap < String, Object[] >();
		result.put( ""+0, new Object[] {
    			re.returnCellValue(0,0), re.returnCellValue(0,1),"RESULT"});
		for(int i = 1; i < rows; i++){
			System.out.println(i);
			result.put( ""+i, new Object[] {
        			re.returnCellValue(i,0), re.returnCellValue(i,1),"PASS"});
		}
	      re.writeTestResults(result,outputFile, "Bahrain"); //made changes here
	      
	      
	  	re.openFile(inputFile,1);
	  	rows = re.numRows();
		System.out.println(rows);
		result = new TreeMap < String, Object[] >();
		result.put( ""+0, new Object[] {
    			re.returnCellValue(0,0), re.returnCellValue(0,1),re.returnCellValue(0,2),"RESULT"});
		for(int i = 1; i < rows; i++){
			System.out.println(i);
			result.put( ""+i, new Object[] {
        			re.returnCellValue(i,0), re.returnCellValue(i,1),re.returnCellValue(i,2),"PASS"});
		}
	      re.writeTestResults(result,outputFile, "GCC"); //made  changes here
	}
}
