package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class ChangePasswordPage extends BasePage {

	public ChangePasswordPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public boolean isChangePasswordTitlePageDisplay() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.PageTitle)));
		return d.findElement(By.cssSelector(Constant.PageTitle)).isDisplayed();

	}

	public boolean isChangePasswordOldPasswordInputboxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_OldPassword)));
		return d.findElement(By.cssSelector(Constant.ChangePassword_OldPassword)).isDisplayed();
		

	}

	public boolean isChangePasswordNewPasswordInputBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_NewPassword)));
		return d.findElement(By.cssSelector(Constant.ChangePassword_NewPassword)).isDisplayed();

	}

	public boolean isChangePasswordConfirmPasswordInputBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_ConfirmPassword)));
		return d.findElement(By.cssSelector(Constant.ChangePassword_ConfirmPassword)).isDisplayed();

	}

	public boolean isChangePasswordSubmitButtonPresent() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_Submit)));
		return d.findElement(By.cssSelector(Constant.ChangePassword_Submit)).isDisplayed();

	}
	public boolean isChangePassWordErrorMessagePresent(){
		WebDriverWait wait = new WebDriverWait(d,35);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_ErrorMessage)));
		return d.findElement(By.cssSelector(Constant.ChangePassword_ErrorMessage)).isDisplayed();
	 		
	}
	 public boolean isPassWordSuccessfullyChangeTitlePagePresent(){
		 WebDriverWait wait = new WebDriverWait(d,30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.PasswordChangeSuccessfully)));
			return d.findElement(By.cssSelector(Constant.PasswordChangeSuccessfully)).isDisplayed();
		 
	 }

	public void sendChangePasswordOldPassword(String oldpassword) {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_OldPassword)));
		d.findElement(By.cssSelector(Constant.ChangePassword_OldPassword)).sendKeys(oldpassword);

	}

	public void sendChangePasswordNewPassword(String newpassword) {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_NewPassword)));
		d.findElement(By.cssSelector(Constant.ChangePassword_NewPassword)).sendKeys(newpassword);

	}

	public void sendChangePasswordConfirmPassword(String confirmPassword) {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_ConfirmPassword)));
		d.findElement(By.cssSelector(Constant.ChangePassword_ConfirmPassword)).sendKeys(confirmPassword);

	}
	
	public void clickChangePasswordSubmitButton(){
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_Submit)));
		d.findElement(By.cssSelector(Constant.ChangePassword_Submit)).click();
		
	}
}
