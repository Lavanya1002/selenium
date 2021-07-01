package week2.day2.Assignment.A1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPageTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://www.leafground.com/pages/Dropdown.html");
	     chrome.manage().window().maximize();
	     WebElement webEleSource1 = chrome.findElement(By.id("dropdown1"));
	     Select drpDown1 = new Select(webEleSource1);		
	    drpDown1.selectByIndex(1);
	    WebElement webEleSource2 = chrome.findElement(By.xpath("//div[@id='contentblock']//div[2]//select"));
	    Select drpDown2 = new Select(webEleSource2);		
	    drpDown2.selectByVisibleText("Appium");
	    WebElement webEleSource3 = chrome.findElement(By.id("dropdown3"));
	     Select drpDown3 = new Select(webEleSource3);		
	    drpDown3.selectByValue("3");
	     WebElement webEleSource4 = chrome.findElement(By.xpath("//div[@id='contentblock']//div[5]//select"));			
	     Select drpDown4 = new Select(webEleSource4);		
	     drpDown4.selectByIndex(3);	
	     WebElement webEleSource5 = chrome.findElement(By.xpath("//div[@id='contentblock']//div[6]//select"));
			
	     Select drpDown5 = new Select(webEleSource5);		
	     drpDown5.selectByVisibleText("Selenium");
	}

}
