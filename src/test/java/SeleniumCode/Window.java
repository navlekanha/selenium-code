package SeleniumCode;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.programiz.com/java-programming/online-compiler/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title=\"Online C Compiler\"]")).click();
		Set<String> ids=driver.getWindowHandles();
		for(String id:ids)
		{
			driver.switchTo().window(id);
			try {
			 
			driver.findElement(By.xpath("//span[@class=\"run-text\"]")).click();
			Thread.sleep(2000);
			driver.quit();
			break;
			}catch(NoSuchElementException e)
			{
				driver.close();
			}
			
		}
		
	}
}


