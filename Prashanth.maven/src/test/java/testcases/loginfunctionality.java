package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclass;
import pageobjectclass.Equartzlogin;
import pageobjectclass.home;

public class loginfunctionality extends Baseclass {
	Equartzlogin EqartzCredentials;
	@BeforeMethod 
	public void url() {
		setup();
		EqartzCredentials=new Equartzlogin(Driver);
		
	}
	@Test
	public void Enterhomepage() {
		EqartzCredentials.credentials();
		String homepageurl=Driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/", homepageurl);
}
	@AfterMethod
	public void Close() {
		Driver.close();
	}
}
