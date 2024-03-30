package SeleniumCode;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	  
	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		//File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(source,new File("C:\\Users\\kanha\\OneDrive\\Documents\\Office Data\\Resume\\kanha.jpg"));
	}

}
