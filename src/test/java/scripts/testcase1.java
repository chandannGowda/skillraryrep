package scripts;



import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.addtocartpage;
import pompages.skillrarydemopage;
import pompages.skillrarypage;

public class testcase1 extends BaseClass {
	@Test
	public void tc1()
	{
		skillrarypage s = new skillrarypage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		driverutilies.switchTabs(driver);
		skillrarydemopage sd= new skillrarydemopage(driver);
		driverutilies.mouseHover(driver,sd.getCoursebtab());
		sd.seleniumtraining();
		
		addtocartpage ac = new addtocartpage(driver);
		driverutilies.doubleclick(driver, ac.getAddbtn());
		ac.addtocartbutton();
		driverutilies.alertpopup(driver);
		
		
	
		
	}

}
