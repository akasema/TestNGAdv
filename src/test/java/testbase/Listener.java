package testbase;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hrms.util.CommonMethods;

public class Listener extends BaseClass implements ITestListener{
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started "+ result.getName());
}
public void onTestSuccess(ITestResult result) {
	System.out.println("Test Passed "+ result.getName());
	CommonMethods.takeScreenshot("Passed/"+ result.getName());
}
public void onTestFailure(ITestResult result) {
	System.out.println("Test Failed "+ result.getName());
}

}
