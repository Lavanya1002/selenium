package week2.day2.Assignment.A1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://leafground.com/pages/checkbox.html");
	     chrome.manage().window().maximize();
	     chrome.findElement(By.xpath("//div[@class='example']//following::input[3]")).click();
	     WebElement select=chrome.findElement(By.xpath("//div[@class='example'][2]//following::input"));
	     if(select.isSelected())
	     {
	    	 System.out.println("check box is selected");
	     }
	     else
	     {
	    	 System.out.println("checkbox is not selected");
	     }
	     chrome.findElement(By.xpath("//div[@class='example'][3]//following::input[2]")).click();
	     for(int i=1;i<=5;i++)
	    	 {
	    	 chrome.findElement(By.xpath("//div[@class='example'][4]//following::input")).click();
	    	 }
	}

}
