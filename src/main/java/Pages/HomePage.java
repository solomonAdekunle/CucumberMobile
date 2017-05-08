package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class HomePage extends BasePage {

	public HomePage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public boolean isGamesCategoryMenuPresent() {
	return d.findElement(By.cssSelector(Constant.hp_GameCategoryMenu)).isDisplayed();

	}

	public boolean isCasinoSearchBoxPresent() {
	return d.findElement(By.cssSelector(Constant.hp_SearchBox)).isDisplayed();

	}

	public boolean isGamePopUpBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.hp_GamesPopUpBox)));
	return d.findElement(By.cssSelector(Constant.hp_GamesPopUpBox)).isDisplayed();

	}

	public boolean isGameNameInGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_GameName)).isDisplayed();


	}

	public boolean isGameImageWithinGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_GmaeImage)).isDisplayed();

	}

	public boolean isPlayButtonWithinGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_PlayButton)).isDisplayed();
	}

	public boolean isDemoButtonWithinGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_DemoButton)).isDisplayed();
	}

	public boolean isMoreInfoLinkWithinGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_MoreInfoLink)).isDisplayed();

	}

	public boolean isCloseIconWithinGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUPBox_closeIcon)).isDisplayed();

	}

	public void clickGameCategoryFeatureTab() {
		d.findElement(By.cssSelector(Constant.hp_GameCategoryMenu_FeatureTab)).click();

	}

	public void clickGameCategorySlotsTab() {
		d.findElement(By.cssSelector(Constant.hp_GameCategoryMenu_FeatureTab)).click();

	}

	public void clickGameCategoryTableGamesTab() {
		d.findElement(By.cssSelector(Constant.hp_GameCategoryMenu_TableGamesTab)).click();
	}

	public void clickGameCategoryAllTab() {
		d.findElement(By.cssSelector(Constant.hp_GameCategoryMenu_AllTab)).click();
	}

	public void clickCasinoSearchBox() {
		d.findElement(By.cssSelector(Constant.hp_SearchBox)).click();
	}

	public void clickNetPlayTvRouletteGame( String GameType) {
		List<WebElement> NetplatvGames=d.findElements(By.cssSelector(Constant.hp_NetPlayTv_Games));
		WebElement RouletteGame=NetplatvGames.get(2);
		RouletteGame.click();

	}

	public void clickCasinoSlotsGames() {
		List<WebElement> PlayTechGames=d.findElements(By.cssSelector(Constant.hp_Playtech_SlotsGames));
		WebElement SlotsGame=PlayTechGames.get(2);
		((JavascriptExecutor) d).executeScript("arguments[0].click();", SlotsGame);
		//SlotsGame.click();
	}

	public void clickCasinoTableGames() {
		List<WebElement> PlayTechGames=d.findElements(By.cssSelector(Constant.hp_Playtech_SlotsGames));
		WebElement TableGame=PlayTechGames.get(5);
		((JavascriptExecutor) d).executeScript("arguments[0].click();", TableGame);
	}

	public void clickCasinoAllGames() {

	}
	

	public void clickGamePopBoxPlayButton() {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.hp_GamePopUpBox_PlayButton)));
		d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_PlayButton)).click();
		

	}
	public void clickGamePopBoxDemoButton() {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_GamePopUpBox_DemoButton)));
		d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_DemoButton)).click();
		

	}
	public void clickGamePopBoxMoreInfoLink() {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_GamePopUpBox_MoreInfoLink)));
		d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_MoreInfoLink)).click();

	}

	public void clickGamePopBoxCloseIcon() {
		
		d.findElement(By.cssSelector(Constant.hp_GamePopUPBox_closeIcon)).click();

	}

	public void clickCasinoSearchInputBoxCloseIcon() {
		d.findElement(By.cssSelector(Constant.hp_CasinoSearchInputboxCloseIcon)).click();

	}

	public void sendCasinoGameSearch() {
		d.findElement(By.cssSelector(Constant.hp_CasinoSearchInputbox)).click();
	}
	
	
}