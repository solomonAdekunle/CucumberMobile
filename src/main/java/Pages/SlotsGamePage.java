package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class SlotsGamePage extends BasePage {

	public SlotsGamePage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
  /* Get current Page url address */
	public String isSlotsGameMenuWithinGameSessionPagePressent() {
		this.waitForLoad(d);
		String PlaytechUrl = d.getCurrentUrl();
		System.out.println(PlaytechUrl);
		return PlaytechUrl;

	}

	/* Navigate back to the Home Page */
	public void NavigateBackToHomePage() {
		d.navigate().back();
	}
	/* get the Current Url Address*/
	public String VerifySlotGameUrlAddress() {
		this.waitForLoad(d);
		System.out.println(d.getCurrentUrl());
		return d.getCurrentUrl();

		}
	/* Check if the Game is loading */
	public boolean isGameLoading() {
		WebDriverWait wait = new WebDriverWait(d, 200);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe#aliveFrame")));
		WebElement Frame = d.findElement(By.cssSelector("iframe#aliveFrame"));
		WebElement Frame2 = d.findElement(By.cssSelector("iframe.force-fullscreen"));
		d.switchTo().frame(Frame).switchTo().defaultContent().switchTo().frame(Frame2);
		System.out.println(d.findElement(By.cssSelector(Constant.SlotGamesLoading)).isDisplayed());
		return d.findElement(By.cssSelector(Constant.SlotGamesLoading)).isDisplayed();
	}

	// wait for page to load //
	public void waitForLoad(WebDriver driver) {
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete");
			}
		};
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(pageLoadCondition);
	}
}
