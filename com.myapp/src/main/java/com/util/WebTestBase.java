package com.util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageMethods.Address;

public class WebTestBase {
	public static WebDriver driver;
	static JavascriptExecutor js;
	public static void browser(String browserName) throws Exception {
		switch (browserName.toLowerCase()) {
		case "chrome":{
			System.setProperty("webdriver.chrome.driver", "./src/main/java/browserDrivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		
		case "firefox":{
			System.setProperty("webdriver.gecko.driver", "./src/main/java/browserDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		
		case "internet explorer":{
			System.setProperty("webdriver.ie.driver", "./src/main/java/browserDrivers/IEDriverServer.exe");
			driver = new FirefoxDriver();
			break;
		}
		
		default:
			throw new Exception("Incorrect option");
		}
		
		driver.manage().window().maximize();
	}
	
	public static void passUrl(String url) {
		driver.get(url);
	}
	
	public static void javascript(String script, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript(script, element);
	}
	
	public static void scrollView(WebElement element) {
		javascript("arguments[0].scrollIntoView();", element);
	}
	
	public static void screenShot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("./Screenshot/"+fileName+".png"));
	}
	
	public static WebDriverWait explicitwait(int SECONDS, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(SECONDS));
		wait.until(ExpectedConditions.visibilityOf(element));
		return wait;
	}
	
	public  static void implicitwait(int SECONDS) {
		driver.manage().timeouts().implicitlyWait(SECONDS, TimeUnit.SECONDS);
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void sendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void dropdown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	public static void mouseOver(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
}
