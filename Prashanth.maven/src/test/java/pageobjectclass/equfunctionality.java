package pageobjectclass;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class equfunctionality {
	@FindBy(xpath="//input[@name=\"user_id\"]")
	WebElement username;
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;
	@FindBy(xpath="//button[text()=\"Sign in\"]")
	WebElement submit;
	public equfunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public void equacredntials(String name,String paswrd) {
			username.sendKeys(name);
			password.sendKeys(paswrd);
			submit.click();
		
	}
	}

