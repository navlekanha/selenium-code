package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/iframe");
		  driver.manage().window().maximize();
		     WebElement e=driver.findElement(By.xpath("//iframe[@title=\"Rich Text Area\"]"));
		  driver.switchTo().frame(e);
		  driver.findElement(By.xpath("//body[@id=\"tinymce\"]/p")).clear();
		  driver.findElement(By.xpath("//body[@id=\"tinymce\"]/p")).sendKeys("kanah navle");
	}

}
