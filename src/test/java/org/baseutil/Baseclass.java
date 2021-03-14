package org.baseutil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	
	protected static WebDriver driver;
	protected static void me() {
		
	}
	public static void browserLaunch(String driverdetail ){
		switch (driverdetail.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishm\\eclipse-workspace\\TestNGTEDY\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishm\\eclipse-workspace\\junitTEst\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "ie":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishm\\eclipse-workspace\\junitTEst\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;

		default:
			System.out.println("no default browser");
			break;
		}
	}
	
	public static void url(String url) {
		
		driver.get(url);
		
	}
	
	public static void webElement(WebElement element,String data) {
	element.sendKeys(data);
		
	}
	
	public static void click(WebElement element) {
		element.click();
		
	}
	
	public void implictWait(int second) {
		driver.manage().timeouts().implicitlyWait(second, TimeUnit.MILLISECONDS);
	}

}
