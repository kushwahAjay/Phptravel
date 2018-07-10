package Script;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersTest implements ITestListener
{
   
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test on start"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" on Test success"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on Test fail"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on Test skipped"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test onstart");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on test finish");
	}
	
}