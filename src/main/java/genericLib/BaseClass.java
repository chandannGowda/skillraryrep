package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Propertyfile pdata = new Propertyfile();
	public WebDriverutilies driverutilies=new WebDriverutilies();
	
	
	
	
	@BeforeMethod
	public void openapp() throws IOException
	{
		WebDriverManager.chromedriver().setup(); // add setup not added any driver executer . this will take care of driver 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void closeapp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		String name = res.getName();
		if(status==2)
		{
			Screenshot s = new Screenshot();
			s.getscreenshot(driver, name);
			
		}
		driver.quit();
	}
}
 