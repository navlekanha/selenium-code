package SeleniumCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	 WebElement el=driver.findElement(By.id("twotabsearchtextbox"));
	 el.sendKeys("iphone 15 pro max");
	 Thread.sleep(2000);
	 driver.findElement(By.id("//input[@type=\"submit\"]")).click();
	 Thread.sleep(2000);
	      List<WebElement> e=driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
	      for(WebElement e1:e)
	      {
	    	  System.out.println(e1.getText());
	      }
	
	
	
	            
}
	
	 
	   
	
}
	
	


		 
	
	


