package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class ResponsibleGamblingPage extends BasePage{

	public ResponsibleGamblingPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public boolean isResponsibleGamblingTitlePageDisplay(){
		return d.findElement(By.cssSelector(Constant.PageTitle)).isDisplayed();
		
	}

}
