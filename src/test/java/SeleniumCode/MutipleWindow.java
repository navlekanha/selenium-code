package SeleniumCode;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleWindow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://omayo.blogspot.com/");
		 driver.findElement(By.id("selenium143")).click();
		 driver.findElement(By.linkText("Open a popup window")).click();
		     Set<String> windowIds=driver.getWindowHandles();
		     for(String windowid:windowIds)
		     {
		    	 driver.switchTo().window(windowid);
		     try {
		        String text=driver.findElement(By.xpath("//h3[text()=\"New Window\"]")).getText();
		          System.out.println(text);
		          driver.quit();
		     }catch(NoSuchElementException e)
		     {
		    	driver.close();
		     }
		     
		     }
	}
	

}
