package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class ChangePasswordPage extends BasePage{

	public ChangePasswordPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	
	public boolean isChangePasswordTitlePageDisplay(){
		WebDriverWait wait= new WebDriverWait(d,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.PageTitle)));
		return d.findElement(By.cssSelector(Constant.PageTitle)).isDisplayed();
		
	}
	
}
