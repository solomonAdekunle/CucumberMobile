package Suite.SupercasinoCucumber_MobilePom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {
	public static WebDriver d;
	Properties OR = null;
	Properties Config = null;
	WebDriver mozilla = null;
	WebDriver chrome = null;
	WebDriver ie = null;

	public TestBase() throws IOException {
		this.createDriver();
	}

	protected void createDriver() throws IOException {
		// initialising the properties
		Config = new Properties();
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Config\\Config.Properties");
		Config.load(fs);
		// System.out.println("Looking at");
		// OR
		OR = new Properties();
		fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Config\\OR.Properties");
		OR.load(fs);

		if (d == null) {

			// initialised webdriver
			if (Config.getProperty("browser").equals("Firefox")) {
				// File file = new File("lib\\geckodriver.exe");
				System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
				d = new FirefoxDriver();
			} else if (Config.getProperty("browser").equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");
				// options.addArguments("no-sandbox");
				options.addArguments("--user-agent="
						+ "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3 like Mac OS X) AppleWebKit/602.1.50 (KHTML, like Gecko) CriOS/56.0.2924.75 Mobile/14E5239e Safari/602.1");
				// options.addArguments("--user-agent=" + "Mozilla/5.0 (iPad CPU
				// OS 8_0 like Mac OS X) AppleWebKit/600.1.3 (KHTML, like Gecko)
				// Version/8.0 Mobile/12A4345d Safari/600.1.4");
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				// cap.setCapability(CapabilityType.PROXY, p);
				cap.setCapability(ChromeOptions.CAPABILITY, options);
				d = new ChromeDriver(cap);

			} else if (Config.getProperty("browser").equals("IE")) {
				File file = new File("C:\\QA\\Chrome\\IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				d = new InternetExplorerDriver();

			}
			EventFiringWebDriver dr = new EventFiringWebDriver(d);
			d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			/* Smalltouch devices such as iPhone, Android and Windows phones */
			Dimension k = new Dimension(375, 667);
			/* Ipad Device */
			// Dimension k = new Dimension(768,1024);
			d.manage().window().setSize(k);
		}

	}

	public void navigate(String URLKey) {
		d.get(Config.getProperty(URLKey));
		// Utility.takeScreenshot(URLKey);
	}

	
	

	public String generateStringWithAllobedSplChars(int length, String allowdSplChrs) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
				"1234567890" + // numbers
				allowdSplChrs;
		return RandomStringUtils.random(length, allowedChars);
	}

	public String generateRandomAlphaNumeric(int lenght, String charcter) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!â€�$%^&*()";
		charcter = RandomStringUtils.random(lenght, characters);
		return charcter;
	}

	public static void takeScreenshot(String fileName) {
		File scrFile = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile,
					new File(System.getProperty("user.dir") + "\\screenshots\\" + fileName + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
