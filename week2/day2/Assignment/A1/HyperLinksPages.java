package week2.day2.Assignment.A1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinksPages {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://leafground.com/pages/Link.html");
	     chrome.manage().window().maximize();
	     chrome.findElement(By.linkText("Go to Home Page")).click();
	     chrome.findElement(By.xpath("//h5[text()='HyperLink']//following::img")).click();
	     chrome.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
	     chrome.findElement(By.id("home")).click();
	     chrome.findElement(By.xpath("//h5[text()='HyperLink']//following::img")).click();
	     chrome.findElement(By.xpath("//label[text()='(Interact with same link name)']//preceding::a[1]")).click();
	     chrome.findElement(By.xpath("//h5[text()='HyperLink']//following::img")).click();
	     chrome.findElement(By.linkText("Verify am I broken?")).click();
	     String title = chrome.getTitle();
	     if(title.equals("HTTP Status 404 – Not Found"))
	     {
	     System.out.println("this page is error");
	     chrome.close();
	     }
	     else
	     {
	    System.out.println("this is not error page");	 
	     }
	     
	     
	     }
}
