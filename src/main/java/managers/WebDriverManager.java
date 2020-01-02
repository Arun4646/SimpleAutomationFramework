package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

import dataProviders.ConfigFileReader;
import enums.DriverType;
import enums.ScreenType;

public class WebDriverManager {

	private WebDriver driver;
	private DriverType driverType;
	private ScreenType screenType;
	private ConfigFileReader configFileReader;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
	private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
	private Dimension mobileDimension = new Dimension(414, 736);
	private Dimension tabletDimension = new Dimension(1024, 1366);
	
	public WebDriverManager() {
		
		configFileReader = new ConfigFileReader();
		driverType = configFileReader.getBrowser();
		screenType = configFileReader.getScreenType();
		
		//driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		
		//screenType = FileReaderManager.getInstance().getConfigReader().getScreenType();
	}
	
	public WebDriver getDriver() {

		if(driver == null) driver = createDriver();
		selectScreenSize(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	private WebDriver createDriver() {
		switch(driverType) {
		case FIREFOX : 
			System.setProperty(FIREFOX_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getFireFoxDriverPath());
			driver = new FirefoxDriver();
		break;
		case CHROME : 
			System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getChromeDriverPath());
			//ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver();
		break;
		case IE11 : 
			System.setProperty(IE_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getInternetExplorerDriverPath());
			InternetExplorerOptions ieOptions = new InternetExplorerOptions();
			ieOptions.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
			ieOptions.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, true);
			ieOptions.setCapability("requireWindowFocus", true);
			ieOptions.setCapability("requireWindowFocus", true);
			ieOptions.setCapability("ignoreZoomSetting", true);
			
			driver = new InternetExplorerDriver(ieOptions);
		break;
		case HEADLESS_CHROME :
			System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getChromeDriverPath());
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("window-size=1920,1080");
			driver = new ChromeDriver(chromeOptions);
		}
		
			return driver;
	}
	
	private void selectScreenSize(WebDriver driver) {
		switch(screenType) {
		case DESKTOP : driver.manage().window().maximize();
		break;
		case MOBILE : driver.manage().window().setSize(mobileDimension);
		break;
		case TABLET : driver.manage().window().setSize(tabletDimension);
		break;
		default : driver.manage().window().maximize();
		break;
		}
	}
	
	public void closeDriver() {
		//driver.close();
		driver.quit();
	}
	
	public String getDriverConfigName() {

		return driverType.toString() + "_" +screenType.toString();
	}
}
