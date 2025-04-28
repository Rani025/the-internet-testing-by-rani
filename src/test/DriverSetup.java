package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
public static WebDriver CreateDRiver()
{
	//System.setProperty("webdriver.chrome.driver", "E:\\RANI DATA\\rani files\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
	
	WebDriverManager.chromedriver().setup();
	return new ChromeDriver();
}
	
}
