package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Constant;

public class LiveVerticalPage extends BasePage{

	public LiveVerticalPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void clickLiveRouletteGame() {
		List<WebElement> NetplatvGames=d.findElements(By.cssSelector(Constant.hp_NetPlayTv_Games));
		WebElement RouletteGame=NetplatvGames.get(0);
		RouletteGame.click();

	}
}
