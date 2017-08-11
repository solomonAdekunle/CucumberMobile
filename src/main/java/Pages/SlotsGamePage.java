package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class SlotsGamePage  extends BasePage{

	public SlotsGamePage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isSlotsGameMenuWithinGameSessionPagePressent(){
		WebElement iFrame= d.findElement(By.tagName("iframe"));
		System.out.println(iFrame.getSize());
		WebDriverWait wait = new WebDriverWait(d,220);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe#aliveFrame")));
		WebElement Frame = d.findElement(By.cssSelector("iframe#aliveFrame"));
		WebElement Frame2=d.findElement(By.cssSelector("iframe.force-fullscreen"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.SlotsGameMenuIcon)));
    	d.switchTo().frame(Frame).switchTo().defaultContent().switchTo().frame(Frame2);
		WebElement PlayTechGameSessionMenuIcon=d.findElement(By.cssSelector(Constant.SlotsGameMenuIcon));
		System.out.println(PlayTechGameSessionMenuIcon.isDisplayed());
		return PlayTechGameSessionMenuIcon.isDisplayed();
	//return	d.findElement(By.cssSelector(Constant.SlotsGameMenuIcon)).isDisplayed();
	}
	 public void NavigateBackToHomePage(){
		 d.navigate().back();
	 }
	 
	 
	public boolean isVegasSlotGameSoundsBoxPresent(){
		WebDriverWait wait = new WebDriverWait(d,200);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe#aliveFrame")));
		WebElement Frame = d.findElement(By.cssSelector("iframe#aliveFrame"));
		d.switchTo().frame(Frame).switchTo().defaultContent();
		return	d.findElement(By.xpath(Constant.SlotGamesSoundPopUpBox)).isDisplayed();
	}
	
	public boolean isGameLoading(){
		WebDriverWait wait = new WebDriverWait(d,200);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe#aliveFrame")));
		WebElement Frame = d.findElement(By.cssSelector("iframe#aliveFrame"));
		WebElement Frame2=d.findElement(By.cssSelector("iframe.force-fullscreen"));
		d.switchTo().frame(Frame).switchTo().defaultContent().switchTo().frame(Frame2);
		System.out.println(d.findElement(By.cssSelector(Constant.SlotGamesLoading)).isDisplayed());
		return	d.findElement(By.cssSelector(Constant.SlotGamesLoading)).isDisplayed();
	}
}
