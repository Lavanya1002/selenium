package week2.day1.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://www.leafground.com/pages/Dropdown.html");
	     chrome.manage().window().maximize();
	     WebElement webEleSource1 = chrome.findElement(By.xpath("//input[text()=You can also use sendKeys to select]"));			
	     Select drpDown1 = new Select(webEleSource1);		
	     // Select drpDown = new Select(webEleSource);		
	     // drpDown.selectByValue("LEAD_DIRECTMAIL");	
	     drpDown1.selectByIndex(3);	
	     WebElement webEleSource2 = chrome.findElement(By.xpath("//input[text()=Select your programs]"));
			
	     Select drpDown2 = new Select(webEleSource2);		
	     // Select drpDown = new Select(webEleSource);		
	     // drpDown.selectByValue("LEAD_DIRECTMAIL");	
	     drpDown1.selectByVisibleText("Selenium");	
	}

}
