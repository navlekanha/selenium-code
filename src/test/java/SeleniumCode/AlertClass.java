package SeleniumCode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value=\"ClickToGetAlert\"]")).click();
		Thread.sleep(2000);
		    Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText()); 
		        alert.accept();
	}

}
