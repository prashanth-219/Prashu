package utils;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class dataretrieve {
			static String path="./testdata/data retive.xlsx";
			public static String[][] setdata(String xlname) throws Throwable{
			File f=new File(path);
			FileInputStream input=new FileInputStream(f);
		XSSFWorkbook wrokbook=new XSSFWorkbook(input);
		XSSFSheet sheet=wrokbook.getSheet(xlname);
	              int row=sheet.getPhysicalNumberOfRows();
		    int cell=sheet.getRow(1).getLastCellNum();
		String[][]data=new String[row-1][cell];
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<cell;j++) {
				DataFormatter df=new DataFormatter();
			data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		wrokbook.close();
		input.close();
		return data;
		
		
		
	}
			
	}
