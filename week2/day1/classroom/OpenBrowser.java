package week2.day1.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     
     ChromeDriver chrome=new ChromeDriver();
     chrome.get("http://leaftaps.com/opentaps/control/main");
     chrome.manage().window().maximize();
     chrome.findElement(By.id("username")).sendKeys("demosalesmanager");
     chrome.findElement(By.id("password")).sendKeys("crmsfa");
     chrome.findElement(By.className("decorativeSubmit")).click();
     String title = chrome.getTitle();
     System.out.println("title of the page" +title);
     chrome.findElement(By.className("crmsfa")).click();
     chrome.findElement(By.linkText("Leads")).click();
     chrome.findElement(By.linkText("Create Lead")).click();
     chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("ïnfoview");
     chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("lavanya");
     chrome.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
     chrome.findElement(By.name("submitButton")).click();
     
  
	}

}
