package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\B prashanth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
Driver.manage().window().maximize();
Driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
WebDriverWait wait=new WebDriverWait(Driver, 15);
Driver.findElement(By.xpath("//button[.=\"Change Text to Selenium Webdriver\"]")).click();	
Thread.sleep(5000);
System.out.print(Driver.switchTo().alert().getText());
Driver.switchTo().alert().accept();


	}

}
