package week2.day1.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://leaftaps.com/opentaps/control/main");
	     chrome.manage().window().maximize();
	     chrome.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	     chrome.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	     chrome.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	     chrome.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	     chrome.findElement(By.linkText("Leads")).click();
	     chrome.findElement(By.linkText("Create Lead")).click();
	     
	   //td[@class='titleCell']//following::a
	   //td[@class='titleCell']//following::a[2]
	     //table[@class='x-grid3-row-table']//a
	     
	     
	}

}
