package org.samsung.pageexecution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.baseutil.Baseclass;
import org.samsung.pagefactory.BuyingpageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BuyingPageExecution2 extends Baseclass {

@BeforeClass
public void bclass() {
	System.out.println("run before every class if declared");
}

@BeforeMethod
public void meth() {
	Date d = new Date();
	System.out.println(d);
}

@Test
public void exchangeDeviceYesClick() throws AWTException, InterruptedException {
	Assert.assertTrue(false);
}

@Test(dataProvider="data", dataProviderClass=BuyingPageExecution.class)
public void te(String browser, String username, String org) {
	System.out.println("my non prorities method");
	System.out.println(browser + "\t"+ username +"\t"+org );
}



@AfterMethod
public void aMeth() {
	Date d = new Date();
	System.out.println(d);
}

@AfterClass
public void Aclass() {
	System.out.println("run after every class if declared");
}

@AfterSuite
public void afterSuite() {
System.out.println("work done");
}

@AfterTest
public void Atest() {
	System.out.println("work done");
}



}
