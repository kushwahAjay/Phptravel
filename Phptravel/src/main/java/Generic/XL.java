package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {
	public static String getCellValue(String path,String sheet,int i,int j)
	{
		
	
	String v=" ";
	try
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		v=wb.getSheet("TestLoginPage").getRow(i).getCell(j).toString();
	}
 catch (Exception e)
	{
	 
	}
	return v;
	}
	public static int getRowCount(String path,String sheet)
	{
		int rc=0;
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			rc=wb.getSheet("TestLoginPage").getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
		return rc;
	}

}
