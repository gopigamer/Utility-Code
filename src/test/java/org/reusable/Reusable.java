package org.reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reusable {
	
	public static WebDriver driver;
//	public static Select s;

	public static void webLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Deva files\\Workspaces\\Practize\\Base-Utility\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void webUrl(String url) {
		driver.get(url);
	}
	public static void getTit() {
		String tit = driver.getTitle();
		System.out.println(tit);
	}
	public static void getCurrUrl() {
		String currurl = driver.getCurrentUrl();
		System.out.println(currurl);
	}
	public static void insert(WebElement e,String val) {
		e.sendKeys(val);
	}
	public static void btnTap(WebElement e) {
		e.click();		
	}
	public static void quitWindow() {
		driver.quit();
	}
	public static void sbi(WebElement e,int index) {
		Select s= new Select(e);
		s.selectByIndex(index);
	}

}
		