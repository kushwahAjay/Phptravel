package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class BaseTest implements IAutoConst {
	
	public WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	@Parameters({"browser"})
	@BeforeMethod(alwaysRun=true)
	public void openApp(String browser)
	{
		com.aventstack.extentreports.ExtentReports erep=new ExtentReports();
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./src/test/resources/Reports/er.html");
		erep.attachReporter(reporter);
		ExtentTest test1=erep.createTest("TestLogin");
		test1.pass("valid login");

		erep.flush();
		Reporter.log("Open App", true);
		
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			
		
			driver=new FirefoxDriver();
		}
		//WebDriver driver=new ChromeDriver();
		String URL=AL.getProperty(SETTING_PATH, "URL");
		driver.get(URL);
		
		String strITO=AL.getProperty(SETTING_PATH, "ITO");
		long ITO=Long.parseLong(strITO);
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	}
	@AfterMethod(alwaysRun=true)
	public void closeBrowser(ITestResult res) 
	{
		String name=res.getName();
		int status=res.getStatus();
		if(status==2)
		{
			String Image_path = AL.getPhoto(driver, PHOTO_PATH, name);
			Reporter.log("Image_path:"+Image_path,true);	
		}
		
		driver.quit();
	}
}
