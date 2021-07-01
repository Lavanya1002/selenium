package week2.day2.Assignment.A1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imagepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://leafground.com/pages/Image.html");
	     chrome.manage().window().maximize();
	     chrome.findElement(By.xpath("//label[text()='Click on this image to go home page']//following::img")).click();
	     chrome.findElement(By.xpath("//h5[text()='Image']//following::img")).click();
	     chrome.findElement(By.xpath("//label[text()='Am I Broken Image?']//following::img")).click();
	     Thread.sleep(1000);
	     chrome.findElement(By.xpath(" //label[text()='Click me using Keyboard or Mouse']//following::img")).click();
	     
	   
	}

}
