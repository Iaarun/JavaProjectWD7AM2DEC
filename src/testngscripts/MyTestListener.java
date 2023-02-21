package testngscripts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " STARTS");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " PASS");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " FAIL");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + " STARTS");
	}
}
