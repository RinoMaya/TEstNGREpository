package org.samsung.knownfailedtestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class KnownFailedTestCase implements IRetryAnalyzer{
	int min = 0, max=10;
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		if (min<max) {
			min++;
			return true;
			
		}
		return false;
	}

}
