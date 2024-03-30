package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tab {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		driver.findElement(By.id("email")).sendKeys("kanhanavle");
		 WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		 Thread.sleep(2000);
		    newTab.get("https://www.google.co.in/");
		    newTab.manage().window().maximize();
		    Thread.sleep(2000);
		   System.out.println(newTab.getTitle()); 
		   Assert.assertEquals(newTab.getTitle(),"Google" );
		   newTab.close();
		   driver.switchTo().window(parent);
		   Thread.sleep(2000);
		   driver.findElement(By.id("pass")).sendKeys("kanha");
		   
	}

}
