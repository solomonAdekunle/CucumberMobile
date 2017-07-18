package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class GameInfoPage extends BasePage{

	public GameInfoPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
		
		
	}

	public boolean isGameNameTitlePresent(){
		return d.findElement(By.cssSelector(Constant.PageTitle)).isDisplayed();
		
		
	}
	
	public boolean isGameInfoGameBannerImagePresent(){
		return d.findElement(By.cssSelector(Constant.GameBanner)).isDisplayed();
		
		
	}
	
	public boolean isGameInfoGameDetailsPresent(){
		return d.findElement(By.cssSelector(Constant.GameInfomationDetails)).isDisplayed();
		
		
	}
	public boolean isGameInfoGameDeviceImagePresent(){
		WebDriverWait wait= new WebDriverWait(d,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.GameDevices)));
		WebElement  GameDevice=d.findElement(By.cssSelector(Constant.GameDevices));
		Actions move= new Actions(d);
		move.moveToElement(GameDevice).build().perform();
		return GameDevice.isDisplayed();
		
		
	}
	public boolean isGameInfoGameAirStatusPresent(){
		return d.findElement(By.cssSelector(Constant.GameAirStaus)).isDisplayed();
		
		
	}
	public boolean isGameInfoPlayForRealButtonPresent(){
		return d.findElement(By.cssSelector(Constant.GameInfoPlayForReal)).isDisplayed();
		
		
	}
	public boolean isGameInfoPlayForFunButtonPresent(){
		return d.findElement(By.cssSelector(Constant.GameInfoPlayForFun)).isDisplayed();
		
		
	}
	public boolean isGameInfoJackpotSliderPresent(){
		return d.findElement(By.cssSelector(Constant.GameInfoJackPotSlider)).isDisplayed();
		
		
	}
	public boolean isGameInfoWinnerSliderPresent(){
		return d.findElement(By.cssSelector(Constant.GameInfoWinnerSlider)).isDisplayed();
		
		
	}
	public boolean isGameInfoAppleStoreLogoPresent(){
		return d.findElement(By.cssSelector(Constant.GameInfoAppStoreLogo)).isDisplayed();
		
		
	}
	public boolean isGameInfoAndroidAppLogoPresent(){
		return d.findElement(By.cssSelector(Constant.GameInfoAndroidLogo)).isDisplayed();
		
		
	}
	
	public void clickGameInfoPlayForRealButton() {
		WebDriverWait wait=new WebDriverWait(d,90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.GameInfoPlayForReal)));
		WebElement PlayForReal=d.findElement(By.cssSelector(Constant.GameInfoPlayForReal));
		System.out.println(PlayForReal.isDisplayed());
		Actions Move = new Actions(d);
		Move.moveToElement(PlayForReal).doubleClick().build().perform();
	//((JavascriptExecutor) d).executeScript("arguments[0].click();", PlayForReal);
		
		
		//d.findElement(By.cssSelector(Constant.GameInfoPlayForReal)).click();
//	
		
		
	}
	
	public void clickGameInfoPlayForFunButton(){
		d.findElement(By.cssSelector(Constant.GameInfoPlayForFun)).click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
