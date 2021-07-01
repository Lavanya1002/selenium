package week2.day2.Assignment.A2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftabsEditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://leaftaps.com/opentaps/control/login");
	     chrome.findElement(By.id("username")).sendKeys("demosalesmanager");
	     chrome.findElement(By.id("password")).sendKeys("crmsfa");
	     chrome.findElement(By.className("decorativeSubmit")).click();
	     chrome.findElement(By.linkText("CRM/SFA")).click();
	     chrome.findElement(By.linkText("Leads")).click();
	     chrome.findElement(By.xpath("//a[text()='Find Leads']")).click();
	     chrome.findElement(By.xpath("//span[text()='Name and ID']//following::input[2]")).sendKeys("Lavanya");
	     Thread.sleep(2000);
	     chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     Thread.sleep(2000);
	     String company = chrome.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']").getText();
         chrome.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	      String title = chrome.getTitle();
	     System.out.println("title of the page" +title);
	     if(title.equals("View Lead | opentaps CRM"))
	     {
	    	 System.out.println("in the viewpage");
	     }
	     else
	     {
	        System.out.println("not viewpage");
	     }
	     chrome.findElement(By.xpath("//a[text()='Edit']")).click();
	     chrome.findElement(By.id("updateLeadForm_companyName")).clear();
	     chrome.findElement(By.id("updateLeadForm_companyName")).sendKeys("infosys");
	     chrome.findElement(By.className("smallSubmit")).click();
	     String cmpyName=chrome.findElement(By.id("viewLead_companyName_sp")).getText();
	     if(cmpyName.contains(company)) {
	            
	            System.out.println("Didn't change");
	        }
	        else {
	            System.out.println("Company name has updated");
	        }

         chrome.close();
	     
	}

}
