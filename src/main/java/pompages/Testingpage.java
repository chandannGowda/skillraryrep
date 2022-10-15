package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;
	
	@FindBy(id="cartAreat")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	
	public Testingpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}


	public WebElement getCart() {
		return cart;
	}


	public WebElement getFacebook() {
		return facebook;
	}

	public void facebookicon()
	{
		facebook.click();
	}
}
