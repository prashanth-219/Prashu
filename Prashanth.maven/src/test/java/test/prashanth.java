package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prashanth {

public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\B prashanth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
Driver.manage().window().maximize();
Driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Driver.findElement(By.xpath("//button[.=\"Change Text to Selenium Webdriver\"]")).click();
if(Driver.findElement(By.xpath("//h2[.=\"Selenium Webdriver\"]")).isEnabled());
{
	System.out.println("selenium webdriver");
}
Driver.findElement(By.xpath("//button[.=\"Display button after 10 seconds\"]")).click();
if(Driver.findElement(By.xpath("//button[.=\"Enabled\"]")).isEnabled());
{
	System.out.println("Enabled");
}
Driver.findElement(By.xpath("//button[.=\"Enable button after 10 seconds\"]")).click();
if(Driver.findElement(By.xpath("//button[.=\"Button\"]")).isEnabled());
{
	System.out.println("Button");
}
Driver.findElement(By.xpath("//button[.=\"Check Checkbox after 10 seconds\"]")).click();
if(Driver.findElement(By.xpath("//button[.=\"Check Checkbox after 10 seconds\"]")).isEnabled());
{
	System.out.println("checkbox");
}
}
	}


