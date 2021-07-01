package week2.day2.Assignment.A4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("https://www.redbus.in/");
	     chrome.manage().window().maximize();
	     chrome.findElement(By.id("src")).sendKeys("chennai");
	     chrome.findElement(By.xpath("//input[@id='src']/following-sibling::label")).click();
	     chrome.findElement(By.id("dest")).sendKeys("Bengaluru");
	     chrome.findElement(By.id("onward_cal")).click();
	     chrome.findElement(By.xpath("//tr[@class='rb-monthHeader']//following::td")).click();
	     chrome.findElement(By.linkText("Search Buses")).click();
	     
	}

}
