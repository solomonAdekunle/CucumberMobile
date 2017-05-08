package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class WelcomePage  extends BasePage{

	public WelcomePage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean isWelcomeTitleTextPresent(){
	 return d.findElement(By.cssSelector(Constant.WelcomePage_TitleText)).isDisplayed();
	}
	public boolean isWelcomePageDepositNowButtonPresent(){
		 return d.findElement(By.cssSelector(Constant.WelcomePage_DepositNowButton)).isDisplayed();
		}
	public boolean isWelcomePageDepositMoreInfoLink(){
		 return d.findElement(By.cssSelector(Constant.WelcomePage_DepositMoreInfolink)).isDisplayed();
		}
	public boolean isWelcomePlayNowButtonPresent(){
		 return d.findElement(By.cssSelector(Constant.WelcomePage_PlayNowButton)).isDisplayed();
		}
}
