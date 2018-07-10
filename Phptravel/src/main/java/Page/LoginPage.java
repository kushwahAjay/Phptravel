package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 @FindBy(xpath="//input[@id='inputEmail']")
	 private WebElement UnTB;
	 
	 @FindBy(xpath="//input[@id='inputPassword']")
	 private WebElement PwTB;
	 
	 @FindBy(xpath="//input[@id='login']")
	 private WebElement loginBTN;
	 
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this); 
	
	}
	public void SetUserName(String uname)
	{
		UnTB.sendKeys(uname);
	}
	

	public void SetPassWord(String pword)
	{
		PwTB.sendKeys(pword);
	}
	
	public void clickLogin()
	{
		loginBTN.click();
	}

}
