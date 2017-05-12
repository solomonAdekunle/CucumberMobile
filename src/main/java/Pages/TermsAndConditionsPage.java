package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class TermsAndConditionsPage extends BasePage{

	public TermsAndConditionsPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean isTermsAndConditionsTitlePageDisplay(){
		return d.findElement(By.cssSelector(Constant.PageTitle)).isDisplayed();
		
	}
}
