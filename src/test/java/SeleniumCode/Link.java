package SeleniumCode;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		   List<WebElement>e=driver.findElements(By.tagName("a"));
		   System.out.println(e.size());
		   
		   for(int i=0;i<e.size();i++)
		   {
			   System.out.println(e.get(i).getAttribute("href"));
		   }
		   driver.close();
		 
		 
	}

}
