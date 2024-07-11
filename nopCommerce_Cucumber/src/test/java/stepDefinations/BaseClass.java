package stepDefinations;

import org.openqa.selenium.WebDriver;


import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public AddcustomerPage addCust;
	
	//created for generating randomstring for unique email
	//public static String randomestring() {
//		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
	//	return (generatedString1);
	}

//}
