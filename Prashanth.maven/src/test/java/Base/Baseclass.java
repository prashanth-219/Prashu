package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Baseclass {
	public static FileInputStream file;	
	public static Properties p;
	public static WebDriver Driver;
String path = "./src/test/java/configproperties/config";
public Baseclass() {
	
   p=new Properties();
	
	try {
		file=new FileInputStream(path);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		p.load(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}	
	public static void setup() {
		String browser=p.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", 
					   "C:\\Users\\B prashanth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  Driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					   "C:\\Users\\B prashanth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		Driver=new EdgeDriver();
		}
	 Driver.manage().window().maximize();
	 Driver.get(p.getProperty("url"));
	 Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	

}
