package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
  public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	WebElement e=driver.findElement(By.xpath("//img[@alt=\"Grocery\"]"));
	Actions action=new Actions(driver);
	action.contextClick(e).perform();
	       String parent=driver.getWindowHandle();
	       Thread.sleep(3000);
WebDriver newTab=driver.switchTo().newWindow(WindowType.WINDOW);
         newTab.get("https://www.google.co.in/");
          newTab.findElement(By.name("q")).sendKeys("java");
          Thread.sleep(2000);
         newTab.close();
         driver.switchTo().window(parent);
         Thread.sleep(2000);
         WebElement e2=driver.findElement(By.xpath("//span[text()=\"Login\"]"));
         Actions action1=new Actions(driver);
         action1.moveToElement(e2).perform();
         driver.findElement(By.xpath("//a[@title=\"Orders\"]")).click();
         
         
         
		
}
}
