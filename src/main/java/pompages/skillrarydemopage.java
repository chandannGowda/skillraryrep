package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrarydemopage {
	@FindBy(id="course")
	private WebElement coursebtab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtrainingtab;
	
	@FindBy(name="addresstype")
	private WebElement courseadd;
	
	public skillrarydemopage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursebtab() {
		return coursebtab;
	}

	public void seleniumtraining()
	{
		seleniumtrainingtab.click();
	}

	public WebElement getCourseadd() {
		return courseadd;
	}

	 
}
