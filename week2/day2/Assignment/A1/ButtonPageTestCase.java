package week2.day2.Assignment.A1;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPageTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     
	     ChromeDriver chrome=new ChromeDriver();
	     chrome.get("http://leafground.com/pages/Button.html");
	     chrome.manage().window().maximize();
	     chrome.findElement(By.id("home")).click();
	     chrome.findElement(By.xpath("//h5[text()='Button']//following::img")).click();
	     WebElement element = chrome.findElement(By.id("position"));
	        Point point = element.getLocation();
	        System.out.println("Element's Position from left side is: "+point.getX()+" pixels.");
	        System.out.println("Element's Position from top is: "+point.getY()+" pixels.");
	        
	        String Color=chrome.findElement(By.id("color")).getAttribute("style");
	        System.out.println("Color of the button is"+ Color);
	        int Width= chrome.findElement(By.id("size")).getSize().getWidth();

	        int Height=chrome.findElement(By.id("size")).getSize().getHeight();
	        System.out.println("Size of the button"+Width+","+Height);
	     }
	    // chrome.findElement(By.id("")).click();
	     
	     //chrome.findElement(By.id("size")).click();
	     
	   
	}


