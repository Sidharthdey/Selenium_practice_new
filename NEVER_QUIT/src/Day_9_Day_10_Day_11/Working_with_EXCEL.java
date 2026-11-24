package Day_9_Day_10_Day_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_with_EXCEL {

	public static void main(String[] args)  {
		try {
			
			
			FileInputStream Cutiepie = new FileInputStream("D:\\ECLIPSE_testing\\NEVER_QUIT\\gantok.xlsx");
			Workbook Shine = WorkbookFactory.create(Cutiepie);
			Sheet s = Shine.getSheet("Sheet1");
			Row r=s.getRow(1);
			Cell c=r.getCell(0);
			String te=c.getStringCellValue();
			System.out.println(te);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
