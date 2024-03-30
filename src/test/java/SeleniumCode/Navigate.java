package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	// Thread.sleep(3000);
	 driver.findElement(By.id("email")).sendKeys("kanhanavle@gmail.com");
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 driver.findElement(By.id("email")).sendKeys("kanha@gmail.com");
	 
}
}
