package SeleniumCode;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowDemo {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Click Here")).click();
	driver.findElement(By.linkText("Elemental Selenium")).click();
	   Set<String>allPage=driver.getWindowHandles();
	   for(String all:allPage)
	   {
		   driver.switchTo().window(all);
		   try {
		   String str=driver.findElement(By.xpath("//title[text()=\"New Window\"]")).getText();
		   System.out.println(str);
		   driver.quit();
		   break;
		   }catch(NoSuchElementException e) {
			   driver.close();
			   
		   }
		   }
	   
	   }
}

