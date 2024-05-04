package fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public static String getcelldata() throws IOException {
		FileInputStream file=new FileInputStream("./src/test/resources/Demowebshop test case.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Sheet page=book.getSheet("Test Scenarios");
		Row row=page.getRow(32);
		Cell cell=row.getCell(0);
		String value=cell.getStringCellValue();
		System.out.println(value);				
		return null;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException,IOException {
		getcelldata();
	}

}
