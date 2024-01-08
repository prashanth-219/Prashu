package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\B prashanth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	   WebDriver Driver=new ChromeDriver();
	   Driver.manage().window().maximize();
	   Driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	   Driver.manage().timeouts().demo(20,TimeUnit.SECONDS);
	   
	   
	   

	}

}
