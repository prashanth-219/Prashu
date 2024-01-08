package pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;

public class Equartzlogin extends Baseclass{


	@FindBy(xpath="//input[@name='user_id']")
	WebElement username;
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	@FindBy(xpath="//button[.=\"Sign in\"]")
	WebElement click;
	public Equartzlogin(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	
	}
	public home credentials() {
		username.sendKeys(p.getProperty("username"));
		password.sendKeys(p.getProperty("password"));
		click.click();
		return new home();

	}
}


