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

	/* Iniliazed the Webdriver */
	public HomePage(WebDriver d) {
		super(d);

	}

	/* Games Category Menu */
	public boolean isGamesCategoryMenuPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GameCategoryMenu)).isDisplayed();

	}

	/* Casino Search Box Present */
	public boolean isCasinoSearchBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_SearchBox)).isDisplayed();

	}

	/* Check if Game Pop-up box */
	public boolean isGamePopUpBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.hp_GamesPopUpBox)));
		return d.findElement(By.cssSelector(Constant.hp_GamesPopUpBox)).isDisplayed();

	}

	/* Check if Game Name in Pop-up box is displayed */
	public boolean isGameNameInGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_GameName)).isDisplayed();

	}

	/* Check if Game Image is displayed within the Pop-up box */
	public boolean isGameImageWithinGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_GmaeImage)).isDisplayed();

	}

	/* Check if Play Button is displayed within Game Pop-up box */
	public boolean isPlayButtonWithinGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_PlayButton)).isDisplayed();
	}

	/* Check Demo button within Game Pop-up Box */
	public boolean isDemoButtonWithinGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_DemoButton)).isDisplayed();
	}

	/* Check if More Info link is displayed within the Game Pop-up box */
	public boolean isMoreInfoLinkWithinGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_MoreInfoLink)).isDisplayed();

	}

	/* Check if Close Icon is displayed within Game Pop-up Box */
	public boolean isCloseIconWithinGamePopUpBoxPresent() {
		return d.findElement(By.cssSelector(Constant.hp_GamePopUPBox_closeIcon)).isDisplayed();

	}

	/* Check if Search Box is opened is displayed */
	public boolean isGameSearchBoxOpenPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.hp_SearchBoxinputBox)));
		return d.findElement(By.cssSelector(Constant.hp_SearchBoxinputBox)).isDisplayed();

	}

	/* Check if search box is closed when i click on Close icon */
	public boolean isGameSearchBoxCloseIconPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.hp_CasinoSearchInputboxCloseIcon)));
		return d.findElement(By.cssSelector(Constant.hp_CasinoSearchInputboxCloseIcon)).isDisplayed();

	}

	/* Verify if Search game Return Roulette Express Premium */
	public boolean isGameSearchRouletteGameReturnPresent() {
		WebElement SearchRolutteGame = d.findElement(By.cssSelector(Constant.hp_SearchGameRouletteReturn));
		WebDriverWait wait = new WebDriverWait(d, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.hp_SearchGameRouletteReturn)));
		System.out.println(SearchRolutteGame.isDisplayed());
		d.findElement(By.cssSelector(Constant.hp_SearchGameRouletteReturn));
		return SearchRolutteGame.isDisplayed();
		// return
		// d.findElement(By.cssSelector(Constant.hp_SearchGameRouletteReturn)).isDisplayed();

	}

	/* Verify if Search Game Return Play Tech Games */
	public boolean isGameSearchPlayTechGameReturnPresent() {
		WebElement SearchVegasGame = d.findElement(By.cssSelector(Constant.hp_SearcgGameVirtueFusionGameReturn));
		WebDriverWait wait = new WebDriverWait(d, 65);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(Constant.hp_SearcgGameVirtueFusionGameReturn)));
		System.out.println(SearchVegasGame.isDisplayed());
		d.findElement(By.cssSelector(Constant.hp_SearcgGameVirtueFusionGameReturn));
		return SearchVegasGame.isDisplayed();
		// return
		// d.findElement(By.cssSelector(Constant.hp_SearcgGameVirtueFusionGameReturn)).isDisplayed();

	}

	/* Click Games Category feature tab */
	public void clickGameCategoryFeatureTab() {
		d.findElement(By.cssSelector(Constant.hp_GameCategoryMenu_FeatureTab)).click();

	}

	/* click Game Category Slot tab */
	public void clickGameCategorySlotsTab() {
		d.findElement(By.cssSelector(Constant.hp_GameCategoryMenu_FeatureTab)).click();

	}

	/* Click on Table game on Game Category on home Page */
	public void clickGameCategoryTableGamesTab() {
		d.findElement(By.cssSelector(Constant.hp_GameCategoryMenu_TableGamesTab)).click();
	}

	/* click All Tab on Game Category Tab */
	public void clickGameCategoryAllTab() {
		d.findElement(By.cssSelector(Constant.hp_GameCategoryMenu_AllTab)).click();
	}

	/* click on Casino Search Box */
	public void clickCasinoSearchBox() {
		d.findElement(By.cssSelector(Constant.hp_SearchBox)).click();
	}

	/* Click NetPlayTV Roulette Game */
	public void clickNetPlayTvRouletteGame(String GameType) {
		WebDriverWait wait = new WebDriverWait(d, 15);
		WebElement RouletteGame = d.findElement(By.cssSelector(Constant.RouletteExpressPremium));
		wait.until(ExpectedConditions.visibilityOf(RouletteGame));
		RouletteGame.click();

	}

	/* click Casino Slot Games */
	public void clickCasinoSlotsGames() {
		List<WebElement> PlayTechGames = d.findElements(By.cssSelector(Constant.hp_Playtech_SlotsGames));
		WebElement SlotsGame = PlayTechGames.get(2);
		((JavascriptExecutor) d).executeScript("arguments[0].click();", SlotsGame);
		// SlotsGame.click();
	}

	/* Click Casino Table Game */
	public void clickCasinoTableGames() {
		List<WebElement> PlayTechGames = d.findElements(By.cssSelector(Constant.hp_Playtech_SlotsGames));
		WebElement TableGame = PlayTechGames.get(5);
		((JavascriptExecutor) d).executeScript("arguments[0].click();", TableGame);
	}

	public void clickCasinoAllGames() {

	}

	/* Click on Play button on Game Pop-up box */
	public void clickGamePopBoxPlayButton() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.hp_GamePopUpBox_PlayButton)));
		d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_PlayButton)).click();

	}

	/* Click Demo Button On Game Pop -up box */
	public void clickGamePopBoxDemoButton() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_GamePopUpBox_DemoButton)));
		d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_DemoButton)).click();

	}

	/* Click on More Info link within the Game Pop-up Box */
	public void clickGamePopBoxMoreInfoLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_GamePopUpBox_MoreInfoLink)));
		d.findElement(By.cssSelector(Constant.hp_GamePopUpBox_MoreInfoLink)).click();

	}

	/* Click on Close Icon on the Game Pop-up box */
	public void clickGamePopBoxCloseIcon() {
		d.findElement(By.cssSelector(Constant.hp_GamePopUPBox_closeIcon)).click();

	}

	/* Click on close icon within the Search Input box on Casino Vertical */
	public void clickCasinoSearchInputBoxCloseIcon() {
		d.findElement(By.cssSelector(Constant.hp_CasinoSearchInputboxCloseIcon)).click();

	}

	/* click saech input box */
	public void clickSearchInputBox() {
		d.findElement(By.cssSelector(Constant.hp_SearchBox)).click();

	}

	/* click on Roulette Express Premium */
	public void clickRouletteExpressPremium() {
		d.findElement(By.cssSelector(Constant.RouletteExpressPremium)).click();
	}

	/* enter your game search name in the Search input box */
	public void sendGameSearch(String gameSearchType) {
		WebDriverWait duro = new WebDriverWait(d, 20);
		duro.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_CasinoSearchInputbox)));
		d.findElement(By.cssSelector(Constant.hp_CasinoSearchInputbox)).sendKeys(gameSearchType);
	}

}
