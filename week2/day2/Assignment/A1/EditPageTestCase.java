package week2.day2.Assignment.A1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPageTestCase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://leafground.com/pages/Edit.html");
	     chrome.manage().window().maximize();
	     chrome.findElement(By.id("email")).sendKeys("lavanya2021@gmail.com");
	     chrome.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']//following::input")).sendKeys("lavanya");
	     chrome.findElement(By.xpath("//label[text()='Get default text entered']//following::input")).sendKeys("lavan");
	     chrome.findElement(By.xpath("//label[text()='Clear the text']//following::input")).sendKeys("lavan1");
	     WebElement field = chrome.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']//following::input"));
	     if(field .isEnabled())
	     {
	      System.out.print("\nField is enabled. Take your action.");
	     }
	     else
	     {
	      System.out.print("\nField is disabled. Take your action.");
	     }
	    
	}

}
