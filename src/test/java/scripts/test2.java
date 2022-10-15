package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.Testingpage;
import pompages.skillrarydemopage;
import pompages.skillrarypage;

public class test2 extends BaseClass {
	@Test
	public void tc2() throws IOException
	{
		skillrarypage s = new skillrarypage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		driverutilies.switchTabs(driver);
		skillrarydemopage sd = new skillrarydemopage(driver);
		driverutilies.dropdown(sd.getCourseadd(), pdata.getData("coursename"));
		
		driverutilies.switchTabs(driver);
		
		Testingpage tp=new Testingpage(driver);
		driverutilies.draganddrop(driver,tp.getSeleniumtraining(), tp.getCart());
		Point loc = tp.getFacebook().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		driverutilies.scrollBar(driver, x, y);
		tp.facebookicon();
		
		
	}

}
