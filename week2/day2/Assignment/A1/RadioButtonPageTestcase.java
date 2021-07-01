package week2.day2.Assignment.A1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonPageTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://leafground.com/pages/radio.html");
	     chrome.manage().window().maximize();
	     chrome.findElement(By.id("yes")).click();
	     chrome.findElement(By.xpath("//label[text()='Find default selected radio button']//following::input")).click();
	     chrome.findElement(By.xpath("//div[@class='example'][3]//following::input")).click();
	     
	}

}
