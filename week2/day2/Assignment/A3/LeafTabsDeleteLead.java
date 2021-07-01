package week2.day2.Assignment.A3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTabsDeleteLead {

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
	     chrome.findElement(By.linkText("Find Leads")).click();
	     chrome.findElement(By.linkText("Phone")).click();
	     chrome.findElement(By.xpath("//span[text()='Phone']//following::input[7]")).sendKeys("99");
	     Thread.sleep(2000);
	     chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     Thread.sleep(2000);
	     String id = chrome.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").getText();
	     chrome.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	     chrome.findElement(By.linkText("Delete")).click();
	     chrome.findElement(By.linkText("Find Leads")).click();
	     chrome.findElement(By.xpath("//span[text()='Name and ID']//following::input[1]")).sendKeys(id);
	     Thread.sleep(2000);
	     chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     Thread.sleep(2000);
	     String Message=chrome.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	     System.out.println(Message);
	     if(Message.equals("No records to display"))
	     {
	    	 System.out.println(id+ "Record is deleted");
	     }
	     else
	     {  System.out.println("Record is not deleted");
	     
	     }
	     chrome.close();
	}

}
