package com.qa.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
public class LoginTest {

	//what is log? : capturing info/activities at the time of program execution.
	//types of logs: What are four types of logs? also call  lables of logs
	//1. info
	//2. warn
	//3. debug
	//4. fatal
	//How to generate the logs? : use Apache log4j API (log4j jar (file)) add dependancy log4j 
	// How it works? : it reads log4j configuration from log4j.properties file
	// Where to create : create inside resources folder.

	WebDriver driver;
	
	Logger log= Logger.getLogger(LoginTest.class);//for your own log you have to define this line.

	@BeforeMethod
	public void setup() {
		log.info("****************** Starting test cases execution *************************");
		log.info("****************** Starting test cases execution *************************");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		log.info("Launching chrome browser");//using 1. info
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com");
		log.info("entering application URL");            //using 1. info 
		log.warn("Hey this is just a warning message");  //using 2. warn
		log.fatal("Hey this is just a fatal errar message"); //using 4. fatal
		log.debug("This is debug message");   //using 3.debug
	}

	@Test(priority=1)
	public void LogingPageTitleTest() {
		log.info("****************** starting test case *************************");
		log.info("****************** LogingPageTitleTest *************************");
		String title= driver.getTitle();
		System.out.println(title);
		log.info("Loging page title is--->"+title);//using 1. info
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		log.info("****************** Ending test case *************************");
		log.info("****************** LogingPageTitleTest *************************");	
	}

	@Test(priority=2)
	public void FreeCRMlogoTest() {
		log.info("****************** starting test case *************************");
		log.info("****************** FreeCRMlogoTest *************************");
		boolean b=driver.findElement(By.xpath("//img[@src='https://d3lh3kd7bj2evy.cloudfront.net/img/logo.png']")).isDisplayed();
		Assert.assertTrue(b);
		log.info("****************** Ending test case *************************");
		log.info("****************** LogingPageTitleTest *************************");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("****************** Browser is closed *************************");
		log.info("****************** Browser is closed *************************");
	}

}
