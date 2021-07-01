package week2.day1.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAndDuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://leaftaps.com/opentaps/control/login");
	     chrome.findElement(By.id("username")).sendKeys("demosalesmanager");
	     chrome.findElement(By.id("password")).sendKeys("crmsfa");
	     chrome.findElement(By.className("decorativeSubmit")).click();
	     String title = chrome.getTitle();
	     System.out.println("title of the page" +title);
	     if(title.equals("Leaftaps - TestLeaf Automation Platform"))
	     {
	    	 System.out.println("in the viewpage");
	     }
	     else
	     {
	        System.out.println("not viewpage");
	     }
	     chrome.findElement(By.linkText("CRM/SFA")).click();
	     chrome.findElement(By.linkText("Leads")).click();
	     chrome.findElement(By.linkText("Create Lead")).click();
	     chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("ïnfoviewivtl");
	     chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("lavanya");
	     chrome.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
	     WebElement webEleSource1 = chrome.findElement(By.id("createLeadForm_dataSourceId"));	
	     Select drpDown1 = new Select(webEleSource1);		
	     // Select drpDown = new Select(webEleSource);		
	     // drpDown.selectByValue("LEAD_DIRECTMAIL");	
	     drpDown1.selectByIndex(3);		
	     //drpDown.selectByVisibleText("Direct Mail");
	     WebElement webEleSource2 = chrome.findElement(By.id("createLeadForm_marketingCampaignId"));	
	     Select drpDown2 = new Select(webEleSource2);		
	     drpDown2.selectByIndex(3);	      
	     chrome.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("lavanya1");
	     chrome.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("C1");
	     chrome.findElement(By.id("createLeadForm_personalTitle")).sendKeys("pertitle");
	     //chrome.findElement(By.id("createLeadForm_birthDate")).sendKeys("23/06/2021");
	     chrome.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("profileTitle");
	     chrome.findElement(By.id("createLeadForm_departmentName")).sendKeys("Cse");
	     chrome.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000");
	     WebElement webEleSource3 = chrome.findElement(By.id("createLeadForm_currencyUomId"));	
	     Select drpDown3 = new Select(webEleSource3);		
	     drpDown3.selectByIndex(3);
	     WebElement webEleSource4 = chrome.findElement(By.id("createLeadForm_industryEnumId"));	
	     Select drpDown4 = new Select(webEleSource4);		
	     drpDown4.selectByIndex(3);
	     chrome.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
	     WebElement webEleSource5 = chrome.findElement(By.id("createLeadForm_ownershipEnumId"));	
	     Select drpDown5 = new Select(webEleSource5);		
	     drpDown5.selectByIndex(3);
	     chrome.findElement(By.id("createLeadForm_sicCode")).sendKeys("3457374");
	     chrome.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$$$");
	     chrome.findElement(By.id("createLeadForm_description")).sendKeys("this is the page to view for the lead");
	     chrome.findElement(By.id("createLeadForm_importantNote")).sendKeys("importantnote");
	     chrome.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
	     chrome.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("678758");
	     chrome.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8703457374");
	     chrome.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("tex");
	     chrome.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("989759745");
	     chrome.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vlb@gmail.com");
	     chrome.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https:\\weburl");
	     chrome.findElement(By.id("createLeadForm_generalToName")).sendKeys("Lavan");
	     chrome.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Lavan9745");
	     chrome.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("nanjengounden");
	     chrome.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("gobi");
	     chrome.findElement(By.id("createLeadForm_generalCity")).sendKeys("erode");
	     WebElement webEleSource6 = chrome.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));	
	     Select drpDown6 = new Select(webEleSource6);		
	     drpDown6.selectByIndex(3);
	     chrome.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("638765");
	     WebElement webEleSource7 = chrome.findElement(By.id("createLeadForm_generalCountryGeoId"));	
	     Select drpDown7 = new Select(webEleSource7);		
	     drpDown6.selectByIndex(3);chrome.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("638475-rt");
	     chrome.findElement(By.name("submitButton")).click();
	     chrome.findElement(By.linkText("Duplicate Lead")).click();
	     chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("ïnfoview");
	     chrome.findElement(By.name("submitButton")).click();
	     String cmpyname = chrome.findElement(By.id("viewLead_companyName_sp")).getText();
	     if(cmpyname.equals("inforview"))
	     {
	    	 System.out.println("ït is duplicate companyname");
	     }
	     else
	     {
	    	 System.out.println("it is not duplicate companyname");
	     }
	     chrome.close();
	}

}
