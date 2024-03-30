package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleFrame {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/iframe");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
      driver.findElement(By.xpath("//body[@id=\"tinymce\"]/p")).clear();
      Thread.sleep(2000);
	driver.findElement(By.xpath("//body[@id=\"tinymce\"]/p")).sendKeys("kanah navle");
}
}
